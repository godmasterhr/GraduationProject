package cn.e_mall.manage.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.e_mall.manage.pojo.Orders;
import cn.e_mall.manage.service.OrderService;

@Controller
public class OrderController {
	
	@Autowired
	private OrderService orderService;

	@RequestMapping("/toOrderManage")
	public String toOrderManage(){
		return "orderManage";
	}
	
	@RequestMapping("/toSeeOrder")
	public String toSeeOrder(int page,Model model){
		List<Orders> orderList = orderService.findOrderList(page);
		model.addAttribute("orderList", orderList);
		return "orderList";
	}	
	
	@RequestMapping("/toUpdateOrder")
	public String toUpdateOrder(String orderId,Model model){
		Orders order = orderService.findOrderById(orderId);
		model.addAttribute("order", order);
		return "orderUpdate";
	}	
	
	@RequestMapping("/updateOrder")
	public String updateOrder(Orders order){
		orderService.updateOrder(order);
		return "redirect:/toSeeOrder?page=1";
	}	
	
	@RequestMapping("/toDeleteOrder")
	public String toDeleteOrder(String orderId){
		orderService.toDeleteOrder(orderId);
		return "redirect:/toSeeOrder?page=1";
	}	
			
}
