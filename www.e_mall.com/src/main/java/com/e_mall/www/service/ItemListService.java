package com.e_mall.www.service;

import java.util.List;

import com.e_mall.www.pojo.Item;
import com.e_mall.www.pojo.ItemPage;
import com.github.pagehelper.PageInfo;

public interface ItemListService {
	
	
	/**
	 * 查询手机
	 * @return
	 * 
	 */
	public ItemPage<Item> findPhoneList(int page,String type) throws Exception;
	/**
	 * 查询电脑
	 * @return
	 */
	public ItemPage<Item> findCpuList(int page,String type) throws Exception;
	/**
	 * 查询衣服
	 * @return
	 */
	public ItemPage<Item> findClothList(int page,String type) throws Exception;
	/**
	 * 查询家电
	 * @return
	 */
	public ItemPage<Item> findHomeeList(int page,String type) throws Exception;
	/**
	 * 查询食品
	 * @return
	 */
	public ItemPage<Item> findFoodList(int page,String type) throws Exception;
	/**
	 * 查询图书
	 * @return
	 */
	public ItemPage<Item> findBookList(int page,String type) throws Exception;
	/**
	 * 查询医药
	 * @return
	 */
	public ItemPage<Item> findMedicalList(int page,String type) throws Exception;
	/**
	 * 查询鞋子
	 * @return
	 */
	public ItemPage<Item> findShoesList(int page,String type) throws Exception;
}
