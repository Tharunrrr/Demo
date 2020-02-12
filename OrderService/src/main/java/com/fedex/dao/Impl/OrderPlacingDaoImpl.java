package com.fedex.dao.Impl;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import com.fedex.dao.OrderPlacingDao;
import com.fedex.dbUtil.DbUtil;
import com.fedex.pojo.OrderPlacing;
public class OrderPlacingDaoImpl implements OrderPlacingDao {
	private Connection conn;
	public OrderPlacing insertOrder(OrderPlacing po) {
		conn = DbUtil.getConnection();
		try {
			String s2 = "insert into placing_order(order_id,date,time,quantity,itemid,price)values(?,?,?,?,?,?)";
			PreparedStatement ps = conn.prepareStatement(s2);
			ps.setInt(1, po.getOrderId());
			ps.setString(2, po.getDate());
			ps.setString(3, po.getTime());
			ps.setInt(4, po.getQuantity());
			ps.setInt(5, po.getItemId());
			ps.setInt(6, po.getPrice());
			System.out.println("Prep Statement: " + ps.toString());
			ps.executeUpdate();
			System.out.println("record inserted");

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return fetchOrder(po.getOrderId());
	}

	public OrderPlacing fetchOrder(int orderId) {
		OrderPlacing placingOrderR = new OrderPlacing();
		try {
			String s1 = "select * from  placing_order where order_id=?";

			PreparedStatement pst = conn.prepareStatement(s1);
			pst.setInt(1, orderId);

			ResultSet rs = pst.executeQuery();

			if (rs.next()) {
				placingOrderR.setOrderId(rs.getInt(1));
				placingOrderR.setDate(rs.getString("Date"));
				placingOrderR.setTime(rs.getString("time"));
				placingOrderR.setQuantity(rs.getInt(4));
				placingOrderR.setItemId(rs.getInt(5));
				placingOrderR.setPrice(rs.getInt(6));
			}

		} catch (Exception e) {

			e.printStackTrace();
		}
		DbUtil.closeConnection();
		return placingOrderR;
	}

}
