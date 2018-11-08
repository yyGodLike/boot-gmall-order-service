package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.alibaba.dubbo.config.annotation.Reference;
import com.atguigu.bean.UserAddressVO;
import com.atguigu.order.IOrderService;
import com.atguigu.user.IUserService;

@Service
public class orderServiceImpl implements IOrderService{
	
	@Reference
	private IUserService userService;

	@Override
	public List<UserAddressVO> doCreateOrder(Integer userId) {
		
		List<UserAddressVO> addressList = userService.getUserAddressByUserId(userId);
		return addressList;
	}

}
