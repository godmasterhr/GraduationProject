package com.e_mall.www.controller;


import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.e_mall.www.pojo.Item;
import com.e_mall.www.pojo.ItemPage;
import com.e_mall.www.service.ItemListService;

@Controller
public class ItemListController {
	
	@Autowired
	private ItemListService itemListService;
	
	
	
	@RequestMapping("/toItemList")
	public String toItemList(HttpServletRequest request,Model model) throws Exception{
		int page = Integer.parseInt(request.getParameter("page"));
		String type = request.getParameter("type");
		ItemPage<Item> itemPage =null;
		switch (Integer.parseInt(type)) {
		case 8:
			itemPage = itemListService.findShoesList(page,type);
			break;
		case 7:
			itemPage = itemListService.findMedicalList(page,type);
			break;
		case 6:
			itemPage = itemListService.findBookList(page,type);
			break;
		case 5:
			itemPage = itemListService.findFoodList(page,type);
			break;
		case 4:
			itemPage = itemListService.findHomeeList(page,type);
			break;
		case 3:
			itemPage = itemListService.findClothList(page,type);
			break;
		case 2:
			itemPage = itemListService.findCpuList(page,type);
			break;
		case 1:
			itemPage= itemListService.findPhoneList(page,type);
			break;
		default:
			break;
		}
		model.addAttribute("page", itemPage);
		return "itemList";
	}
	

}
