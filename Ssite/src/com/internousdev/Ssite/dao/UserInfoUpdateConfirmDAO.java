package com.internousdev.Ssite.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.internousdev.Ssite.dto.UserInfoUpdateConfirmDTO;
import com.internousdev.Ssite.util.DBConnector;

public class UserInfoUpdateConfirmDAO {
	private DBConnector dbConnector=new DBConnector();
	private Connection connection=dbConnector.getConnection();
	private UserInfoUpdateConfirmDTO dto=new UserInfoUpdateConfirmDTO();

	public UserInfoUpdateConfirmDTO select(String loginId,String loginPassword)throws SQLException{
		String sql="SELECT * FROM login_user_transaction WHERE login_id=? AND login_pass=?";

		try{
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			preparedStatement.setString(1, loginId);
			preparedStatement.setString(2, loginPassword);
			ResultSet resultSet=preparedStatement.executeQuery();

			if(resultSet.next()){
				dto.setId(resultSet.getInt("id"));
				dto.setLoginId(resultSet.getString("login_id"));
				dto.setLoginPassword(resultSet.getString("login_pass"));
				dto.setUserName(resultSet.getString("user_name"));
				dto.setInsert_date(resultSet.getString("insert_date"));
				dto.setUpdated_date(resultSet.getString("updated_date"));
				//未解決バグ･･･admin_flgが引き出せていない？
				dto.setAdmin_flg(resultSet.getString("admin_flg"));
			}
		}catch(SQLException e){
			e.printStackTrace();
		}finally{
			connection.close();
		}
		return dto;
	}

}
