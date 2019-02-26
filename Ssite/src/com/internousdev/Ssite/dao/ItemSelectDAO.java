package com.internousdev.Ssite.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.internousdev.Ssite.dto.ItemSelectDTO;
import com.internousdev.Ssite.util.DBConnector;

public class ItemSelectDAO {
	private DBConnector db=new DBConnector();
	private Connection con=db.getConnection();
	private ItemSelectDTO dto=new ItemSelectDTO();

	public ItemSelectDTO select(int item_id)throws SQLException{
		String sql="SELECT * FROM item_info_transaction WHERE id=?";
		try{
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setInt(1, item_id);
			ResultSet rs=ps.executeQuery();

			if(rs.next()){
				dto.setId(rs.getInt("id"));
				dto.setItemName(rs.getString("item_name"));
				dto.setItemPrice(rs.getString("item_price"));
			}
		}catch(SQLException e){
			e.printStackTrace();
		}finally{
			con.close();
		}
		return dto;
	}
}
