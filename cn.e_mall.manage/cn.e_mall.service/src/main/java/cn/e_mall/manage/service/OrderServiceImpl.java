package cn.e_mall.manage.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.e_mall.manage.mapper.OrderMapper;
import cn.e_mall.manage.pojo.Orders;

@Service
public class OrderServiceImpl implements OrderService{
	
	@Autowired
	private OrderMapper orderMapper;

	@Override
	public List<Orders> findOrderList(int page) {
		int row = 7;
		int start=(page-1)*row;
		return orderMapper.findOrderList(start,row);
	}

	@Override
	public Orders findOrderById(String orderId) {
		return orderMapper.findOrderById(orderId);
	}

	@Override
	public void updateOrder(Orders order) {
		orderMapper.updateOrder(order);
	}

	@Override
	public void toDeleteOrder(String orderId) {
		orderMapper.toDeleteOrder(orderId);
	}

}
