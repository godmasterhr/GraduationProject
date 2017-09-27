package cn.e_mall.manage.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import cn.e_mall.manage.pojo.Orders;

public interface OrderMapper {

	public List<Orders> findOrderList(@Param("start") int start,@Param("row") int row);

	public Orders findOrderById(String orderId);

	public void updateOrder(Orders order);

	public void toDeleteOrder(String orderId);

}
