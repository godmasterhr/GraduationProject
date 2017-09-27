package com.e_mall.www.service;

import com.e_mall.www.pojo.Item;

public interface ItemInfoService {
	/**
	 * 根据商品id查询商品详细信息
	 * @return
	 */
	public Item findItemById(String id);
	
	public void updateNum(String id,int i);
}
