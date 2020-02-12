package com.fedex.view;

import com.fedex.pojo.OrderPlacing;

public class OrderPlacingAppTest {

	public static void main(String[] args) {
		OrderPlacingApp app = new OrderPlacingApp();
		OrderPlacing po = new OrderPlacing();
		po.setOrderId(10);
		po.setDate("2019-11-03");
		po.setTime("06:48:23");
		po.setQuantity(3);
		po.setItemId(1);
		po.setPrice(450);
		app.insertOrder(po);

	}

}
