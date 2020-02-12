package com.fedex.dao;

import java.util.ArrayList;

import com.fedex.pojo.OrderPlacing;

public interface ListingOrderDao {
	
		 public ArrayList<OrderPlacing> getOrders(int itemid,String date);

}

