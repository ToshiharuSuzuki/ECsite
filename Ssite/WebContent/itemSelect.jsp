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
<title>ItemSelect画面</title>
<style type="text/css">
/* ========TAG LAYOUT======== */
	body{
		margin:0;
		padding:0;
		line-height:1.6;
		letter-spacing:1px;
		font-family:Verdana,Helvetica,sans-serif;
		font-size:12px;
		color:#333;
		background:#fff;
	}

	table{
		text-align:center;
		margin:0 auto;
	}
	/* ========ID LAYOUT======== */
	#top{
		width:780px;
		margin:30px auto;
		border:1px solid #333;
	}
	#header{
		width:100%;
		height:80px;
		background-color:black;
	}
	#main{
		width:100%;
		height:auto important!;
		min-height:500px;
		text-align:center;
	}
	#footer{
		width:100%;
		height:80px;
		background-color:black;
		clear:both;
	}

	#items{
		display:block;
		text-align:centeer;
	}
	#itemList{
		border:1px solid black;
		width:150px;
		height:auto;
		padding-top:20px;
		padding-left:5px;
		padding-right:5px;
		paddong-bottom:10px;
		margin-top:10px;
		text-align:center;
		display:inline-block;
	}
	}
	#text-link{
		clear:both;
		text-align:center;
	}
	#itemserch{
		text-align:center;
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
			<p>商品一覧</p>
		</div>
		<div>
			<h3>現在販売中の商品</h3>
			<div id="itemserch">
				<s:form action="HomeAction">
				<input type="text" name="itemSerch" value="">
				<s:submit value="検索"/>
				</s:form>
			</div>
			<div id="items">
					<s:iterator value="buyItemList">
					<div id="itemList">
					<s:form action="ItemSelectAction">
						商品名:
						<s:property value="itemName"/><br>
						<input type="hidden" value='<s:property value="itemName"/>' name="itemName">
						価格:
						<s:property value="itemPrice"/>円<br>
						在庫数:
						<s:property value="itemStock"/>個
						<input type="hidden" value='<s:property value="id"/>' name="item_id">
						<s:submit value="購入申請"/><br><br>
					</s:form>
					</div>
					</s:iterator>

			<br/>
			</div>
			<div id="text-link">
				<p>Homeへ戻る場合は
					<a href='<s:url action="GoHomeAction"/>'>こちら</a></p>
				<p>マイページへは
					<a href='<s:url action="MyPageAction"/>'>こちら</a></p>
			</div>
		</div>
	</div>
	<div id="footer">
		<div id="pr">
		</div>
	</div>
</body>
</html>