package com.fedex.view;

import com.fedex.pojo.OrderMaster;

public class OrderAppTest {

	public static void main(String[] args) {

		OrderApp app = new OrderApp();

		OrderMaster order = app.getRate(20, "BANGALORE", "MUMBAI");
		// OrderMaster order1=app.getRate(30, "BANGALORE", "MUMBAI");

		System.out.println("ID: " + order.getItemId() + ", Price: " + order.getPrice());
		// System.out.println("ID: " + order1.getItemId() + ", Price: " +
		// order1.getPrice());

	}

}
