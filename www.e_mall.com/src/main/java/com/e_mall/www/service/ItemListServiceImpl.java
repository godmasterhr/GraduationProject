package com.e_mall.www.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.e_mall.www.pojo.Item;
import com.e_mall.www.pojo.ItemPage;
import com.e_mall.www.util.BeanUtils;

import cn.e_mall.common.service.HttpClientService;

@Service
public class ItemListServiceImpl implements ItemListService{
	
	
	@Autowired
	private HttpClientService httpClientService;
	
	
	/**
	 * 查询所有手机
	 *  
	 */
	public ItemPage<Item> findPhoneList(int page,String type) throws Exception{
		String url="http://manage.e_mall.com:8081/phone?page="+page+"&type="+type;
		String jsonData = httpClientService.doGet(url);
		ItemPage<Item> itemPage = BeanUtils.getInstance().getItemPage(jsonData);
		return itemPage;
	}
	/**
	 * 查询所有电脑
	 */
	public ItemPage<Item> findCpuList(int page,String type) throws Exception{
		String url="http://manage.e_mall.com:8081/phone?page="+page+"&type="+type;
		String jsonData = httpClientService.doGet(url);
		ItemPage<Item> itemPage = BeanUtils.getInstance().getItemPage(jsonData);
		return itemPage;
	}
	/**
	 * 查询所有衣服
	 */
	public ItemPage<Item> findClothList(int page,String type) throws Exception{
		String url="http://manage.e_mall.com:8081/phone?page="+page+"&type="+type;
		String jsonData = httpClientService.doGet(url);
		ItemPage<Item> itemPage = BeanUtils.getInstance().getItemPage(jsonData);
		return itemPage;
	}
	/**
	 * 查询所有家电
	 */
	public ItemPage<Item> findHomeeList(int page,String type) throws Exception{
		String url="http://manage.e_mall.com:8081/phone?page="+page+"&type="+type;
		String jsonData = httpClientService.doGet(url);
		ItemPage<Item> itemPage = BeanUtils.getInstance().getItemPage(jsonData);
		return itemPage;
	}
	/**
	 * 查询所有食物
	 */
	public ItemPage<Item> findFoodList(int page,String type) throws Exception{
		String url="http://manage.e_mall.com:8081/phone?page="+page+"&type="+type;
		String jsonData = httpClientService.doGet(url);
		ItemPage<Item> itemPage = BeanUtils.getInstance().getItemPage(jsonData);
		return itemPage;
	}
	/**
	 * 查询所有图书
	 */
	public ItemPage<Item> findBookList(int page,String type) throws Exception{
		String url="http://manage.e_mall.com:8081/phone?page="+page+"&type="+type;
		String jsonData = httpClientService.doGet(url);
		ItemPage<Item> itemPage = BeanUtils.getInstance().getItemPage(jsonData);
		return itemPage;
	}
	/**
	 * 查询所有医药
	 */
	public ItemPage<Item> findMedicalList(int page,String type) throws Exception{
		String url="http://manage.e_mall.com:8081/phone?page="+page+"&type="+type;
		String jsonData = httpClientService.doGet(url);
		ItemPage<Item> itemPage = BeanUtils.getInstance().getItemPage(jsonData);
		return itemPage;
	}
	@Override
	public ItemPage<Item> findShoesList(int page,String type) throws Exception{
		String url="http://manage.e_mall.com:8081/phone?page="+page+"&type="+type;
		String jsonData = httpClientService.doGet(url);
		ItemPage<Item> itemPage = BeanUtils.getInstance().getItemPage(jsonData);
		return itemPage;
	}
	
}
