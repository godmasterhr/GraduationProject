package cn.e_mall.spider.mapper;

import cn.e_mall.spider.pojo.Item;

public interface ItemMapper {
	
	/**
	 * 添加商品到数据库
	 * @param item
	 */
	public void addItem(Item item);
}
