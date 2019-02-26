package com.internousdev.Ssite.action;

import java.sql.SQLException;

import com.internousdev.Ssite.dao.ItemListDeleteCompleteDAO;
import com.opensymphony.xwork2.ActionSupport;

public class ItemListDeleteCompleteAction extends ActionSupport{
	private String message;
	public String execute() throws SQLException{
		String result=ERROR;
		ItemListDeleteCompleteDAO itemListDeleteCompleteDAO=new ItemListDeleteCompleteDAO();
		int res=itemListDeleteCompleteDAO.deleteItemList();
		if(res>0){
			setMessage("商品情報を全て削除しました。");
		}else{
			setMessage("商品情報の削除に失敗しました。");
		}
		result = SUCCESS;
		return result;
	}
	public String getMessage(){
		return message;
	}
	public void setMessage(String message){
		this.message=message;
	}

}
