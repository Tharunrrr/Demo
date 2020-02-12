package com.fedex.dao;

import com.fedex.pojo.OrderPlacing;

public interface OrderPlacingDao {
	public OrderPlacing insertOrder(OrderPlacing po);
	public OrderPlacing fetchOrder(int orderId);

}
