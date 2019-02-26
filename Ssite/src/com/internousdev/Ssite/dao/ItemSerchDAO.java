package com.internousdev.Ssite.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.internousdev.Ssite.dto.BuyItemDTO;
import com.internousdev.Ssite.util.DBConnector;

public class ItemSerchDAO {
	private DBConnector dbConnector=new DBConnector();
	private Connection connection=dbConnector.getConnection();
	private  ArrayList<BuyItemDTO> buyItemList=new ArrayList<BuyItemDTO>();

	public ArrayList<BuyItemDTO> getBuyItemInfo(String itemSerch)throws SQLException{
		String sql="SELECT id,item_name,item_price,item_stock FROM item_info_transaction WHERE item_name LIKE ?";
		try{
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			preparedStatement.setString(1, '%'+itemSerch+'%');
			ResultSet resultSet=preparedStatement.executeQuery();
			while(resultSet.next()){
				BuyItemDTO dto=new BuyItemDTO();
				dto.setId(resultSet.getInt("id"));
				dto.setItemName(resultSet.getString("item_name"));
				dto.setItemPrice(resultSet.getString("item_price"));
				dto.setItemStock(resultSet.getString("item_stock"));
				buyItemList.add(dto);
			}
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			connection.close();
		}
		return buyItemList;
	}

}
