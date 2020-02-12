package com.fedex.view;

import com.fedex.dao.OrderPlacingDao;
import com.fedex.dao.Impl.OrderPlacingDaoImpl;
import com.fedex.pojo.OrderPlacing;

public class OrderPlacingApp {

//	public static void main(String[] args) {
//		OrderPlacingDao orderDao = new OrderPlacingDaoImpl();
//		System.out.println("OrderPlacing Service");
//
//		OrderPlacing p2 = new OrderPlacing();
//	
//		p2.setOrderId(13);
//		p2.setDate("2019-11-03");
//		p2.setTime("06:48:23");
//		p2.setQuantity(1);
//		p2.setItemId(2);
//		p2.setPrice(300);
//		orderDao.insertOrder(p2);
//
//		
//	
//		System.out.println("Record Inserted: " 
//		        + "OrderID: " + p2.getOrderId() 
//		        + "\nDate: " + p2.getDate()
//		        + "\nTime: "+ p2.getTime()		     
//		        +"\nQuantity: " + p2.getQuantity() 
//		        +"\nItemID: " + p2.getItemId()
//		        +"\nPrice: "+ p2.getPrice());
//		
//		
//
//	}

	public OrderPlacing insertOrder(OrderPlacing po) {
		OrderPlacingDao order = new OrderPlacingDaoImpl();
		System.out.println("Welcome to OrderService");
		OrderPlacing orders = order.insertOrder(po);
		return orders;

	}

}
