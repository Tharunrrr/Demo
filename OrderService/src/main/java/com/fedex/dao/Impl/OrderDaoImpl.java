package com.fedex.dao.Impl;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import com.fedex.dao.OrderDao;
import com.fedex.dbUtil.DbUtil;
import com.fedex.pojo.OrderMaster;

public class OrderDaoImpl implements OrderDao {
	private Connection conn;
	public OrderMaster getRate(int weight, String source, String destination) {
		OrderMaster orderMaster = new OrderMaster();
		conn = DbUtil.getConnection();
		try {
			String h = "select itemid,price from order_master where weight=? and source=? and destination=?";
			PreparedStatement st = conn.prepareStatement(h);
			st.setInt(1, weight);
			st.setString(2, source);
			st.setString(3, destination);

			ResultSet rs = st.executeQuery();
			if (rs.next()) {

				orderMaster.setItemId(rs.getInt(1));
				orderMaster.setPrice(rs.getInt(2));

			}
		}

		catch (SQLException e) {
			e.printStackTrace();
		}
		DbUtil.closeConnection();
		return orderMaster;
	}

}
