package cn.e_mall.manage.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.e_mall.manage.pojo.User;
import cn.e_mall.manage.service.UserService;

@Controller
public class UserController {
	
	@Autowired
	private UserService userService;
	/**
	 * 跳转会员管理界面
	 * @return
	 */
	@RequestMapping("/toUserManage")
	public String toUserManage(){
		return "userManage";
	}
	
	@RequestMapping("/toSeeUser")
	public String toSeeUser(int page,Model model) {
		List<User> userList = userService.findUserList(page);
		model.addAttribute("userList", userList);
		model.addAttribute("page", page);
		return "userList";
	}
	@RequestMapping("/toDelUser")
	public String toDelUser(int page,Model model) {
		List<User> userList = userService.findUserList(page);
		model.addAttribute("userList", userList);
		model.addAttribute("page", page);
		return "userDelList";
	}
	
	@RequestMapping("/delUser")
	public String delUser(String userId){
		userService.delUserById(userId);
		return "redirect:/toDelUser?page="+1;
	}
}
