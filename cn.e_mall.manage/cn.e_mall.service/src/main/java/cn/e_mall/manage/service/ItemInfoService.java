package cn.e_mall.manage.service;

import cn.e_mall.manage.pojo.Item;

public interface ItemInfoService {
	/**
	 * 根据商品id查询商品详细信息
	 * @return
	 */
	public Item findItemById(String id);

	public void saveItem(Item item);

	public void updateItem(Item item, boolean b);

	public void deleteItemById(String itemId);

	public void updateNum(String id, int i);
}
