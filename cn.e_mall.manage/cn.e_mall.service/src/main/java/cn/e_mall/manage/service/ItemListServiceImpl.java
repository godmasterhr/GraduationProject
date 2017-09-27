package cn.e_mall.manage.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.e_mall.manage.mapper.ItemListMapper;
import cn.e_mall.manage.pojo.Item;

@Service
public class ItemListServiceImpl implements ItemListService{
	
	@Autowired
	private ItemListMapper itemListMapper;
	/**
	 * 
	 * 获取手机列表
	 */
	public List<Item> findPhoneList() {
		
		return itemListMapper.findPhoneList();
	}
	/**
	 * 
	 * 获取鞋子列表
	 */
	public List<Item> findShoesList() {
		return itemListMapper.findShoesList();
	}
	/**
	 * 
	 * 获取电脑列表
	 */
	public List<Item> findCpuList() {
		return itemListMapper.findCpuList();
	}
	/**
	 * 
	 * 获取衣服列表
	 */
	public List<Item> findClothList() {
		return itemListMapper.findClothList();
	}
	/**
	 * 
	 * 获取家电列表
	 */
	public List<Item> findHomeeList() {
		return itemListMapper.findHomeeList();
	}
	/**
	 * 
	 * 获取食物列表
	 */
	public List<Item> findFoodList() {
		return itemListMapper.findFoodList();
	}
	/**
	 * 
	 * 获取书本列表
	 */
	public List<Item> findBookList() {
		return itemListMapper.findBookList();
	}
	/**
	 * 
	 * 获取医药列表
	 */
	public List<Item> findMedicalList() {
		return itemListMapper.findMedicalList();
	}

}
