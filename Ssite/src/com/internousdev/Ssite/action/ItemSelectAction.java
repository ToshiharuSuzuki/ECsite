package com.internousdev.Ssite.action;

import java.sql.SQLException;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.Ssite.dao.ItemSelectDAO;
import com.internousdev.Ssite.dto.ItemSelectDTO;
import com.opensymphony.xwork2.ActionSupport;

public class ItemSelectAction extends ActionSupport implements SessionAware{

	private int item_id;
	private ItemSelectDAO dao=new ItemSelectDAO();
	private ItemSelectDTO dto=new ItemSelectDTO();
	public Map<String,Object> session;

	public String execute() throws SQLException {

		dto = dao.select(item_id);

		if(item_id!=0){
			session.put("id", dto.getId());
			session.put("buyItem_name", dto.getItemName());
			session.put("buyItem_price", dto.getItemPrice());
		}
		return SUCCESS;
	}

	public int getItem_id() {
		return item_id;
	}

	public void setItem_id(int item_id) {
		this.item_id = item_id;
	}

	public void setSession(Map<String,Object> session){
		this.session=session;
	}


}
