package com.fedex.view;

import java.util.ArrayList;

import com.fedex.dao.ListingOrderDao;

import com.fedex.dao.Impl.ListingOrderDaoImpl;

import com.fedex.pojo.OrderPlacing;

public class ListingOrderApp {
	public ArrayList<OrderPlacing> getOrderList(int itemId, String date) {
		ListingOrderDao orderPlacingDao = new ListingOrderDaoImpl();
		System.out.println("Welcome to our Website");
		ArrayList<OrderPlacing> orderlist = orderPlacingDao.getOrders(itemId, date);
		return orderlist;

	}
}
