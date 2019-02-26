<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
<meta http-equiv="Content-Style-Type" content="text/css"/>
<meta http-equiv="Content-Script-Type" content="text/javascript"/>
<meta http-equiv="imagetoolbar" content="no"/>
<meta name="description" content=""/>
<meta name="keywords" content=""/>
<title>Home画面</title>
<style type="text/css">
	body{
		margin:0;
		padding:0;
		line-height:1.6;
		letter-spacing:1px;
		font-family:Verdana,Helvetica,sans-serif;
		font-size:12px;
		color:#333;
		background:#fff;
		background-color:#E0F8F7;
	}

	table{
		text-align:center;
		margin:0 auto;
	}
	/* ========Ssite LAYOUT======== */
	#top{
		width:780px;
		margin:30px auto;
		border:1px solid #333;
		background-color:#81F7F3;
	}
	#header{
		width:100%;
		height:80px;
		background-color:black;
	}
	#main{
		widht:100%;
		height:500px;
		text-align:center;
	}
	#footer{
		width:100%;
		height:80px;
		background-color:black;
		clear:both;
	}
	#text-center{
		display:inline-block;
		text-align:center;
	}
	#management{
		text-align:center;
		margin-right:10px;
	}
</style>
</head>
<body>
	<div id="header">
		<div id="pr">
		</div>
	</div>
	<div id="main">
		<div id="top">
			<p>Home</p>
		</div>
		<div id="text-center">
			<s:form action="HomeAction">
				<s:if test="#session.id==null">
				<s:submit value="ログイン･商品購入"/>
				</s:if>
				<s:if test="#session.id!=null">
				<s:submit value="商品購入"/>
				</s:if>
			</s:form>
			<s:if test="#session.id!=null">
				<p>マイページは
					<a href='<s:url action="MyPageAction"/>'>こちら</a></p>
				<p>ログアウトする場合は
					<a href='<s:url action="LogoutAction"/>'>こちら</a></p>
				</s:if>
		</div>
	</div>
	<s:if test='#session.admin=="1"'>
	<div id="management">
		<s:form action="AdminAction">
			<s:submit value="管理者TOPへ"/>
		</s:form>
	</div>
	</s:if>
	<div id="footer">
		<div id="pr">
		</div>
	</div>
</body>
</html>