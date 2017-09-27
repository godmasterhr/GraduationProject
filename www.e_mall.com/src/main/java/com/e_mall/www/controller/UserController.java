package com.e_mall.www.controller;


import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.e_mall.www.pojo.User;
import com.e_mall.www.service.UserService;


@Controller
public class UserController {
	
	@Autowired
	private UserService userSerivce;
	/*
	 * 转向登录页面
	 */
	@RequestMapping("/toLogin")
	public String toLogin(){
		return "login";	
	}
	/*
	 * 转向注册页面
	 */
	@RequestMapping("/toRegist")
	public String toRegist(){
		return "regist";
	}
	
	/*
	 * 新增用户
	 */
	@RequestMapping("/saveUser")
	public String  addUser(User user,Model model){
		userSerivce.saveUser(user);
		model.addAttribute("flag", "true");
		return "regist";
	}
	
	/*
	 * 用户登录
	 */
	@RequestMapping("/login")
	public String  login(User user,Model model,HttpServletRequest request,HttpServletResponse response,String remember,String autologin){
		Cookie cookie = null;
		//首先先检测有没有记住用户名 设置cookie
		if("true".equals(remember)||"true"==remember){
			cookie = new Cookie("remember",user.getUserName());
			cookie.setMaxAge(Integer.MAX_VALUE);
			cookie.setPath(request.getContextPath());
			response.addCookie(cookie);
		}else{
			cookie = new Cookie("remember","");
			cookie.setMaxAge(0);
			cookie.setPath(request.getContextPath());
			response.addCookie(cookie);
		}
		
		//检测用户名，登陆
		User use = userSerivce.findUserByUP(user);
		if(use!=null){
			//然后先检测有没有30天自动登录 设置cookie
			Cookie autocookie = null;
			if("true".equals(autologin)||"true"==autologin){
				autocookie = new Cookie("autologin",user.getUserName()+","+user.getPassWord());
				autocookie.setMaxAge(60*60*24*30);
				autocookie.setPath(request.getContextPath());
				response.addCookie(autocookie);
			}else{
				autocookie = new Cookie("autologin","");
				autocookie.setMaxAge(0);
				autocookie.setPath(request.getContextPath());
				response.addCookie(autocookie);
			}
			request.getSession().setAttribute("user", use);
			return "index";
		}
		else {
			model.addAttribute("error","用户名或密码错误");
			return "/login";
		}
	}
	/*
	 * 用户登出
	 */
	@RequestMapping("/toLogOut")
	public String toLogOut(HttpServletRequest request,HttpServletResponse response){
		//清除cookie
		Cookie[] cookies = request.getCookies();
		for (Cookie cookie : cookies) {
			if("autologin".equals(cookie.getName())||"autologin"==cookie.getName()&&(cookie.getValue()!=""||!"".equals(cookie.getValue()))){
				cookie.setValue("");
				cookie.setMaxAge(0);
				cookie.setPath(request.getContextPath());
				response.addCookie(cookie);
			}
		}
		//清除session
		if(request.getSession(false)!=null){
			request.getSession().invalidate();
		}
		return "redirect:/index";
	}
	/*
	 * 转向修改用户信息页面
	 */
	@RequestMapping("/toUserInfo")
	public String toUserInfo(HttpServletRequest request){
		//用户的数据直接从session中拿就够了，不用再去数据库里面去拿了
		return "userInfo";
	}
	@RequestMapping("/updateUser")
	public String toUpdateUser(User user,Model model){
		userSerivce.updateUser(user);
		model.addAttribute("flag", "true");
		return "userInfo";
	}
	
	
	
	
	/*
	 * ajax验证用户名是否存在
	 */
	@RequestMapping("/checkUserName")
	public void checkUserName(HttpServletResponse response,String userName) throws Exception{
		response.setContentType("text/html; charset=utf-8");
		User user = userSerivce.findUserByUserName(userName);
		if(user==null){
			response.getWriter().print("<font color='red'>恭喜你，用户名可以使用</font>");
		}else{
			response.getWriter().print("<font color='red'>此用户名已被使用</font>");
		}
	}
}
