package cn.e_mall.spider.mapper;

import java.sql.Connection;
import java.sql.PreparedStatement;

import cn.e_mall.spider.pojo.Item;
import cn.e_mall.spider.util.JDBCUtils;

public class ItemMapperImpl implements ItemMapper{
	Connection conn = null;
	PreparedStatement ps=null;
	public void addItem(Item item) {
		try {
			 conn = JDBCUtils.getConnection();
			String sql = "insert into item values(?,?,?,?,?,?,?)";
			 ps = conn.prepareStatement(sql);
			ps.setString(1, item.getId());
			ps.setString(2, item.getTitle());
			ps.setString(3, item.getSellPoint());
			ps.setString(4, item.getItemUrl());
			ps.setDouble(5, item.getPrice());
			ps.setString(6, item.getItemType());
			ps.setInt(7, item.getNum());
			ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			JDBCUtils.close(conn, ps, null);
		}
		
	}

}
