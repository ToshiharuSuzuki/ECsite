package com.internousdev.Ssite.action;

import java.sql.SQLException;

import com.internousdev.Ssite.dao.UserInfoUpdateUserNameDAO;
import com.opensymphony.xwork2.ActionSupport;

public class UserInfoUpdateUserNameAction extends ActionSupport{
	private String oldUserName;
	private String newUserName;
	public String execute()throws SQLException{
		String result=ERROR;

		if(newUserName!=null){
			UserInfoUpdateUserNameDAO dao=new UserInfoUpdateUserNameDAO();
			dao.userInfoUpdateUserName(oldUserName,newUserName);

			result=SUCCESS;
			if(oldUserName==null){
				result=ERROR;
			}
		}
		return result;
	}

	public String getOldUserName(){
		return oldUserName;
	}
	public void setOldUserName(String oldUserName){
		this.oldUserName=oldUserName;
	}
	public String getNewUserName(){
		return newUserName;
	}
	public void setNewUserName(String newUserName){
		this.newUserName=newUserName;
	}

}
