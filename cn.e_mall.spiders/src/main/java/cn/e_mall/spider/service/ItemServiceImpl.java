package cn.e_mall.spider.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

import cn.e_mall.spider.mapper.ItemMapper;
import cn.e_mall.spider.mapper.ItemMapperImpl;
import cn.e_mall.spider.pojo.Item;


public class ItemServiceImpl implements ItemService{
	
   	
	
	public void addItem(Item item) {
		ItemMapper itemMapper = new ItemMapperImpl();
		itemMapper.addItem(item);
		}

}
