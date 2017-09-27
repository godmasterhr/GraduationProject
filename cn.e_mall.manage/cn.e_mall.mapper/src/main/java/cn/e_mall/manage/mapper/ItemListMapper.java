package cn.e_mall.manage.mapper;

import java.util.List;

import cn.e_mall.manage.pojo.Item;

public interface ItemListMapper {
	/**
	 * 
	 * 获取手机列表
	 */
	public List<Item> findPhoneList();
	/**
	 * 
	 * 获取鞋子列表
	 */
	public List<Item> findShoesList();
	/**
	 * 
	 * 获取电脑列表
	 */
	public List<Item> findCpuList();
	/**
	 * 
	 * 获取衣服列表
	 */
	public List<Item> findClothList();
	/**
	 * 
	 * 获取家电列表
	 */
	public List<Item> findHomeeList();
	/**
	 * 
	 * 获取食物列表
	 */
	public List<Item> findFoodList();
	/**
	 * 
	 * 获取书本列表
	 */
	public List<Item> findBookList();
	/**
	 * 
	 * 获取医药列表
	 */
	public List<Item> findMedicalList();
}
