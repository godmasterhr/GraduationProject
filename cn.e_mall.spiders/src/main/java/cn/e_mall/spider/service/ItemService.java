package cn.e_mall.spider.service;

import org.springframework.stereotype.Service;

import cn.e_mall.spider.mapper.ItemMapper;
import cn.e_mall.spider.pojo.Item;


public interface ItemService {
	
	public void addItem(Item item);
		
}
