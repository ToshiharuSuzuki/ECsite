package com.internousdev.Ssite.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.internousdev.Ssite.util.DBConnector;
import com.internousdev.Ssite.util.DateUtil;

public class UserInfoUpdatePasswordDAO {
	private DBConnector db=new DBConnector();
	private Connection con=db.getConnection();
	private DateUtil dateUtil=new DateUtil();

	public void userInfoUpdatePassword(String oldLoginPassword,String newLoginPassword)throws SQLException{
		String sql="UPDATE login_user_transaction SET login_pass=?,updated_date=? WHERE login_pass=?";

		try{
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setString(1, newLoginPassword);
			ps.setString(2, dateUtil.getDate());
			ps.setString(3, oldLoginPassword);
			ps.executeUpdate();
		}catch(SQLException e){
			e.printStackTrace();
		}finally{
			con.close();
		}
	}
}
