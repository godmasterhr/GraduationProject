package com.e_mall.www.interceptor;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import com.e_mall.www.pojo.User;
import com.e_mall.www.service.UserService;
/**
 * 拦截器 实现30天自动登录
 * @author 何睿
 *
 */
public class AutoLoginInterceptor implements HandlerInterceptor{
	
	@Autowired
	private UserService userSerivce;
	
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		//拦截器 从cookie中取数据,如果有，进行判断，然后登陆，放置在session中，如果没有，什么也不做
		Cookie[] cookies = request.getCookies();
		for (Cookie cookie : cookies) {
			System.out.println(cookie.getName());
			if("autologin".equals(cookie.getName())||"autologin"==cookie.getName()&&(cookie.getValue()!=""||!"".equals(cookie.getValue()))){
				String info = cookie.getValue();
				User user = new User();
				user.setUserName(cookie.getValue().split(",")[0]);
				user.setPassWord(cookie.getValue().split(",")[1]);
				User use = userSerivce.findUserByUP(user);
				request.getSession().setAttribute("user", use);
			}
		}
		return true;
	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		// TODO Auto-generated method stub
		
	}

}
