package com.internousdev.Ssite.action;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.Ssite.dao.BuyItemDAO;
import com.internousdev.Ssite.dao.ItemSerchDAO;
import com.internousdev.Ssite.dto.BuyItemDTO;
import com.opensymphony.xwork2.ActionSupport;

public class HomeAction extends ActionSupport implements SessionAware{
	public Map<String,Object> session;
	private String itemSerch;
	private BuyItemDAO buyItemDAO=new BuyItemDAO();
	private ItemSerchDAO itemSerchDAO=new ItemSerchDAO();
	private ArrayList<BuyItemDTO> buyItemList=new ArrayList<BuyItemDTO>();

	public String execute()throws SQLException{
		String result="login";
		if(session.containsKey("id")){
			if(buyItemList!=null){
			buyItemList=buyItemDAO.getBuyItemInfo();
			}
			result=SUCCESS;
			if(itemSerch!=null){
				buyItemList=itemSerchDAO.getBuyItemInfo(itemSerch);
			}
		}
		return result;
	}

	@Override
	public void setSession(Map<String,Object> session){
		this.session=session;
	}
	public Map<String,Object> getSession(){
		return this.session;
	}
	public ArrayList<BuyItemDTO> getBuyItemList(){
		return this.buyItemList;
	}
	public String getItemSerch(){
		return itemSerch;
	}
	public void setItemSerch(String itemSerch){
		this.itemSerch=itemSerch;
	}
}
