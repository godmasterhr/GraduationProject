package cn.e_mall.manage.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ItemController {
	
	
	
	@RequestMapping("/toItemManage")
	public String toItemManage(){
		return "itemManage";
	}
	
}
