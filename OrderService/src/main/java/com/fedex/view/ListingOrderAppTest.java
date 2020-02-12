package com.fedex.view;

import java.util.ArrayList;

import com.fedex.pojo.OrderPlacing;

public class ListingOrderAppTest {

	public static void main(String[] args) {
		ListingOrderApp app = new ListingOrderApp();
		ArrayList<OrderPlacing> orderlist = app.getOrderList(2, "2019-12-08");
		System.out.println(
				"OrderID: " + "  " + " " + "Date: " + "  " + "  " + " " + " " + " " + " " + " " + " " + "Time: " + "  "
						+ " " + " " + " " + "  " + " " + " " + "Quantity: " + "  " + "ItemId:" + "  " + " " + "Price:");
		for (OrderPlacing order : orderlist) {
			System.out.println(order.getOrderId() + "  " + " " + " " + "  " + " " + " " + " " + " " + " "
					+ order.getDate() + " " + " " + " " + "  " + " " + " " + order.getTime() + "" + " " + "  " + " "
					+ " " + " " + " " + order.getQuantity() + " " + " " + " " + " " + "  " + " " + " " + " " + " "
					+ order.getItemId() + " " + " " + " " + " " + "  " + " " + " " + " " + order.getPrice());

		}

	}
}
