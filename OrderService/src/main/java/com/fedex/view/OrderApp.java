package com.fedex.view;

import com.fedex.dao.OrderDao;
import com.fedex.dao.Impl.OrderDaoImpl;
import com.fedex.pojo.OrderMaster;

public class OrderApp {

	public OrderMaster getRate(Integer weight, String source, String destination) {
		OrderDao orderDao = new OrderDaoImpl();
		System.out.println("Welcome to fedex app");
		OrderMaster order = orderDao.getRate(weight, source, destination);
		return order;

	}

}
