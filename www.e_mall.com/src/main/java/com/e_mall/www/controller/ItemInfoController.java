package com.e_mall.www.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.e_mall.www.pojo.Item;
import com.e_mall.www.service.ItemInfoService;

/**
 * 商品的详细信息的Controller
 * @author Administrator
 *
 */
@Controller
public class ItemInfoController {
	@Autowired
	private ItemInfoService itemInfoService;
	
	@RequestMapping("/toItemInfo")
	public String toItemInfo(String id,Model model){
		Item item = itemInfoService.findItemById(id);
		model.addAttribute("item", item);
		return "itemInfo";
	}
}
