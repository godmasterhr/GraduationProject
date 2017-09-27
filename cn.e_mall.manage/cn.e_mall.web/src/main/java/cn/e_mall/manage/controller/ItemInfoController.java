package cn.e_mall.manage.controller;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

import org.apache.commons.io.FileUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import cn.e_mall.manage.pojo.Item;
import cn.e_mall.manage.service.ItemInfoService;



@Controller
public class ItemInfoController {
	@Autowired
	private ItemInfoService itemInfoService;
	
	@RequestMapping("/toItemInfo")
	@ResponseBody
	public Item toItemInfo(String id,Model model){
		Item item = itemInfoService.findItemById(id);
		model.addAttribute("item", item);
		return item;
	}
	
	@RequestMapping("/toUpdateItem")
	public String toUpdateItem(String itemId,Model model){
		Item item = itemInfoService.findItemById(itemId);
		model.addAttribute("item", item);
		return "itemUpdate";
	}
	
	@RequestMapping("/toaddItem")
	public String toaddItem(){
		return "itemadd";
	}
	
	
	@RequestMapping("/addItem")
	public String addItem(MultipartFile file,Item item) throws Exception{
		int i = Integer.parseInt(item.getItemType());
		String url = "";
		switch(i){
			case 1:url="phone";break;
			case 2:url="computer";break;
			case 3:url="clothes";break;
			case 4:url="homee";break;
			case 5:url="food";break;
			case 6:url="book";break;
			case 7:url="drug";break;
			case 8:url="shoes";break;
		}
		String itemUrl = "D:\\JDimgs\\"+url+"\\"+file.getOriginalFilename();
		item.setItemUrl(itemUrl);
		item.setId(UUID.randomUUID().toString());
		itemInfoService.saveItem(item);
		FileUtils.writeByteArrayToFile(new File(itemUrl), file.getBytes());
		return "redirect:/seeItem?page=1&type="+item.getItemType();
	}
	
	
	@RequestMapping("/updateItem")
	public String updateItem(MultipartFile file,Item item) throws Exception{
		int i = Integer.parseInt(item.getItemType());
		String url = "";
		switch(i){
			case 1:url="phone";break;
			case 2:url="computer";break;
			case 3:url="clothes";break;
			case 4:url="homee";break;
			case 5:url="food";break;
			case 6:url="book";break;
			case 7:url="drug";break;
			case 8:url="shoes";break;
		}if(!"".equals(file.getOriginalFilename())){
			Item pro = itemInfoService.findItemById(item.getId());
			File f = new File(pro.getItemUrl());
			f.delete();
			String itemUrl = "D:\\JDimgs\\"+url+"\\"+file.getOriginalFilename();
			item.setItemUrl(itemUrl);
			itemInfoService.updateItem(item,true);
			FileUtils.writeByteArrayToFile(new File(itemUrl), file.getBytes());
		}else{
			itemInfoService.updateItem(item,false);
		}
		return "redirect:/seeItem?page=1&type="+item.getItemType();
	}
	
	@RequestMapping("/toDeleteItem")
	public String toaddItem(String itemId){
		Item item = itemInfoService.findItemById(itemId);
		itemInfoService.deleteItemById(itemId);
		return "redirect:/seeItem?page=1&type="+item.getItemType();
	}
	
	
	@RequestMapping("/toUpdateNum")
	public void toUpdateNum(String id,int num ){
		System.out.println(id+","+num);
		itemInfoService.updateNum(id,num);
	}
	
	
	
}
