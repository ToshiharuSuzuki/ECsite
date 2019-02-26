package com.internousdev.Ssite.action;

import java.sql.SQLException;

import com.internousdev.Ssite.dao.UserInfoUpdateConfirmDAO;
import com.internousdev.Ssite.dto.UserInfoUpdateConfirmDTO;
import com.opensymphony.xwork2.ActionSupport;

public class UserInfoUpdateConfirmAction extends ActionSupport{
	private UserInfoUpdateConfirmDAO dao=new UserInfoUpdateConfirmDAO();
	private UserInfoUpdateConfirmDTO dto=new UserInfoUpdateConfirmDTO();
	private int id;
	private String loginId;
	private String loginPassword;
	private String userName;
	private String insert_date;
	private String updated_date;
	private String admin_flg;
	private String message;
	public String execute()throws SQLException{
		String ret=ERROR;

		dto=dao.select(loginId,loginPassword);

		if(loginId.equals(dto.getLoginId())){
			if(loginPassword.equals(dto.getLoginPassword())){
				ret= SUCCESS;
				setId(dto.getId());
				setUserName(dto.getUserName());
				setInsert_date(dto.getInsert_date());
				setUpdated_date(dto.getUpdated_date());
				setAdmin_flg(dto.getAdmin_flg());
				if(insert_date==null){
					setInsert_date("登録日データ無し");
				}
				if(updated_date==null){
					setUpdated_date("更新日データ無し");
				}
				if(admin_flg==null){
					setMessage("管理者権限無し");
				}else if(admin_flg!=null){
					setMessage("管理者権限有り");
				}
			}
		}
		return ret;
	}

	public int getId(){
		return id;
	}
	public void setId(int id){
		this.id=id;
	}

	public String getLoginId(){
		return loginId;
	}
	public void setLoginId(String loginId){
		this.loginId=loginId;
	}
	public String getLoginPassword(){
		return loginPassword;
	}
	public void setLoginPassword(String loginPassword){
		this.loginPassword=loginPassword;
	}
	public String getUserName(){
		return userName;
	}
	public void setUserName(String userName){
		this.userName=userName;
	}
	public String getInsert_date(){
		return insert_date;
	}
	public void setInsert_date(String insert_date){
		this.insert_date=insert_date;
	}
	public String getUpdated_date(){
		return updated_date;
	}
	public void setUpdated_date(String updated_date){
		this.updated_date=updated_date;
	}
	public String getAdmin_flg(){
		return admin_flg;
	}
	public void setAdmin_flg(String admin_flg){
		this.admin_flg=admin_flg;
	}
	public String getMessage(){
		return message;
	}
	public void setMessage(String message){
		this.message=message;
	}
}

