package com.internousdev.Ssite.action;

import java.sql.SQLException;

import com.internousdev.Ssite.dao.UserInfoUpdatePasswordDAO;
import com.opensymphony.xwork2.ActionSupport;

public class UserInfoUpdatePasswordAction extends ActionSupport{
	private String oldLoginPassword;
	private String newLoginPassword;
	public String execute()throws SQLException{
		String result=ERROR;

		if(newLoginPassword!=null){
			UserInfoUpdatePasswordDAO dao=new UserInfoUpdatePasswordDAO();
			dao.userInfoUpdatePassword(oldLoginPassword, newLoginPassword);

			result=SUCCESS;
			if(oldLoginPassword==null){
				result=ERROR;
			}
		}
		return result;
	}
	public String getOldLoginPassword(){
		return oldLoginPassword;
	}
	public void setOldLoginPassword(String oldLoginPassword){
		this.oldLoginPassword=oldLoginPassword;
	}
	public String getNewLoginPassword(){
		return newLoginPassword;
	}
	public void setNewLoginPassword(String newLoginPassword){
		this.newLoginPassword=newLoginPassword;
	}

}
