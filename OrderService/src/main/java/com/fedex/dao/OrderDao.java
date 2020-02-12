package com.fedex.dao;

import com.fedex.pojo.OrderMaster;

public interface OrderDao {
	
		 public OrderMaster  getRate(int weight,String source,String destination); 
	
	}



