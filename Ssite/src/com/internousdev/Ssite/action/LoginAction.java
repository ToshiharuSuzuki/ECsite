package com.internousdev.Ssite.action;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.Ssite.dao.BuyItemDAO;
import com.internousdev.Ssite.dao.LoginDAO;
import com.internousdev.Ssite.dto.BuyItemDTO;
import com.internousdev.Ssite.dto.LoginDTO;
import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport implements SessionAware{
	private String loginUserId;
	private String loginPassword;
	public Map<String,Object> session;
	private LoginDAO loginDAO=new LoginDAO();
	private LoginDTO loginDTO=new LoginDTO();
	private BuyItemDAO buyItemDAO=new BuyItemDAO();
	private ArrayList<BuyItemDTO> buyItemList=new ArrayList<BuyItemDTO>();
	private BuyItemDTO buyItemDTO=new BuyItemDTO();
	public String execute()throws SQLException{
		String result=ERROR;
		loginDTO=loginDAO.getLoginUserInfo(loginUserId,loginPassword);
		session.put("loginUser", loginDTO);
		session.put("login_user_id", loginDTO.getLoginId());
		session.put("id", buyItemDTO.getId());
		session.put("admin", loginDTO.getAdmin());

		if(((LoginDTO)session.get("loginUser")).getLoginFlg()){
			result=SUCCESS;
			buyItemList=buyItemDAO.getBuyItemInfo();

			if(session.get("admin")!=null){
				result="admin";

				return result;
			}
			return result;

		}
		return result;
	}
	public String getLoginUserId(){
		return loginUserId;
	}
	public void setLoginUserId(String loginUserId){
		this.loginUserId=loginUserId;
	}
	public String getLoginPassword(){
		return loginPassword;
	}
	public void setLoginPassword(String loginPassword){
		this.loginPassword=loginPassword;
	}
	@Override
	public void setSession(Map<String,Object> session){
		this.session=session;
	}

	public ArrayList<BuyItemDTO> getBuyItemList(){
		return this.buyItemList;
	}

}
