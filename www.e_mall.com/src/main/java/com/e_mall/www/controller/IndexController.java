package com.e_mall.www.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
/**
 * 实现主页链接跳转的Controller
 * @author 何睿
 *
 */
@Controller
public class IndexController {
	
	@RequestMapping("/index")
	public String toIndex(){
		return "index";
	}
	
	
}