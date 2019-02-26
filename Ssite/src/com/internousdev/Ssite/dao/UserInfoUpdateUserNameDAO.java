package com.internousdev.Ssite.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.internousdev.Ssite.util.DBConnector;
import com.internousdev.Ssite.util.DateUtil;

public class UserInfoUpdateUserNameDAO {
	private DBConnector db=new DBConnector();
	private Connection con=db.getConnection();
	private DateUtil dateUtil=new DateUtil();
	public void userInfoUpdateUserName(String oldUserName,String newUserName)throws SQLException{
		String sql="UPDATE login_user_transaction SET user_name=?,updated_date=? WHERE user_name=?";

		try{
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setString(1, newUserName);
			ps.setString(2, dateUtil.getDate());
			ps.setString(3, oldUserName);
			ps.executeUpdate();
		}catch(SQLException e){
			e.printStackTrace();
		}finally{
			con.close();
		}
	}

}
