package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.atguigu.bean.UserAddressVO;
import com.atguigu.order.IOrderService;

@Controller
public class OrderController {
	
	@Autowired
	private IOrderService orderService;
	
	@ResponseBody
	@RequestMapping("/doCreateOrder")
	public List<UserAddressVO> doCreateOrder(@RequestParam("userId")Integer userId){
		
		return orderService.doCreateOrder(userId);
	
	}
	
	
}
