package com.fedex.dao.Impl;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import com.fedex.dao.ListingOrderDao;
import com.fedex.dbUtil.DbUtil;
import com.fedex.pojo.OrderPlacing;
public class ListingOrderDaoImpl implements ListingOrderDao {
	private Connection conn;	

	public ArrayList<OrderPlacing> getOrders(int itemid,String date){
		ArrayList<OrderPlacing> orders=new ArrayList<>();
		conn = DbUtil.getConnection();

		try {
			String h = "select * from placing_order where itemid=? and date=? ";
			PreparedStatement pst = conn.prepareStatement(h);
			pst.setInt(1, itemid);
			pst.setString(2, date);
			ResultSet rs = pst.executeQuery();
			while (rs.next()) {
				OrderPlacing l1=new OrderPlacing();
				l1.setOrderId(rs.getInt(1));
				l1.setDate(rs.getString("date"));
				l1.setTime(rs.getString("time"));
				l1.setQuantity(rs.getInt(4));
				l1.setItemId(rs.getInt(5));
				l1.setPrice(rs.getInt(6));
				orders.add(l1);
			}
		} 
		catch (SQLException e) {
			e.printStackTrace();
		}
		DbUtil.closeConnection();
		return orders;

	}

}
