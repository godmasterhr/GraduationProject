package cn.e_mall.manage.controller;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {
	
	@RequestMapping("/index")
	public String toIndex(){
		return "index";
	}
	
	@RequestMapping("/toWWW")
	public void toWWW(HttpServletResponse response){
		response.setHeader("Refresh", "0;URL=http://www.e_mall.com");
	}
}
