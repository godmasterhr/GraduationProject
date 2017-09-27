package com.e_mall.www.service;

import java.util.List;
import java.util.Map;

import com.e_mall.www.pojo.Item;
import com.e_mall.www.pojo.OrderInfo;
import com.e_mall.www.pojo.Orders;
import com.e_mall.www.pojo.User;

public interface OrderService {
	
	/**
	 * 添加订单(包括订单项)
	 */
	public void addOrders(Map<Item,Integer> cart,User user);
	
	/**
	 * 根据用户id查询订单
	 * @param userId
	 * @return
	 */
	public List<Orders> findOrderIdByUserId(String userId);
	
	/**
	 * 根据订单id查询所有的订单项
	 * @param orderId
	 * @return
	 */
	public List<OrderInfo> findOrderInfoByOrderId(String orderId);
	
	/**
	 * 去支付
	 * @param orderId
	 */
	public void pay(String orderId);
}
