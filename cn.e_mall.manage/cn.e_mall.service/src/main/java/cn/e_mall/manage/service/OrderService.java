package cn.e_mall.manage.service;

import java.util.List;

import cn.e_mall.manage.pojo.Orders;

public interface OrderService {

	public List<Orders> findOrderList(int page);

	public Orders findOrderById(String orderId);

	public void updateOrder(Orders order);

	public void toDeleteOrder(String orderId);

}
