package cn.e_mall.manage.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import cn.e_mall.manage.pojo.Item;
import cn.e_mall.manage.service.ItemListService;

@Controller
public class ItemListController {
	
	@Autowired
	private ItemListService itemListService; 
	
	@RequestMapping("/phone")
	@ResponseBody
	public PageInfo toItemList(HttpServletRequest request,Model model) throws Exception{
		int page = Integer.parseInt(request.getParameter("page"));
		String type = request.getParameter("type");
		PageHelper.startPage(page, 30);
		List<Item> itemList =null;
		if("8".equals(type)){
			itemList = itemListService.findShoesList();
		}else if("1".equals(type)){
			itemList = itemListService.findPhoneList();
		}else if("2".equals(type)){
			itemList = itemListService.findCpuList();
		}else if("3".equals(type)){
			itemList = itemListService.findClothList();
		}else if("4".equals(type)){
			itemList = itemListService.findHomeeList();
		}else if("5".equals(type)){
			itemList = itemListService.findFoodList();
		}else if("6".equals(type)){
			itemList = itemListService.findBookList();
		}else if("7".equals(type)){
			itemList = itemListService.findMedicalList();
		}
		PageInfo<Item> pageInfo = new PageInfo<Item>(itemList);
		return pageInfo;
	}
	
	
	@RequestMapping("/seeItem")
	public String  seeItem(HttpServletRequest request,Model model) throws Exception{
		int page = Integer.parseInt(request.getParameter("page"));
		String type = request.getParameter("type");
		PageHelper.startPage(page, 7);
		List<Item> itemList =null;
		if("8".equals(type)){
			itemList = itemListService.findShoesList();
		}else if("1".equals(type)){
			itemList = itemListService.findPhoneList();
		}else if("2".equals(type)){
			itemList = itemListService.findCpuList();
		}else if("3".equals(type)){
			itemList = itemListService.findClothList();
		}else if("4".equals(type)){
			itemList = itemListService.findHomeeList();
		}else if("5".equals(type)){
			itemList = itemListService.findFoodList();
		}else if("6".equals(type)){
			itemList = itemListService.findBookList();
		}else if("7".equals(type)){
			itemList = itemListService.findMedicalList();
		}
		PageInfo<Item> pageInfo = new PageInfo<Item>(itemList);
		model.addAttribute("pageInfo",pageInfo);
		return "itemList";
	}
	
}
