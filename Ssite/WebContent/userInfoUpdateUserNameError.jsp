<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
<meta http-equiv="Content-Style-Type" content="text/css"/>
<meta http-equiv="Content-Script-Type" content="text/javascript"/>
<meta name="description" content=""/>
<meta name="keywords" content=""/>
<title>ユーザー名変更失敗</title>

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
/* ========ID LAYOUT=========*/
	#top{
		width:780px;
		margin:30px auto;
		border:1px solid #333;
		background-color:#E6E6E6;
	}
	#header{
		width:100%;
		height:80px;
		background-color:black;
	}
	#main{
		width:100%;
		height:500px;
		text-align:center;
	}
	#footer{
		width:100%;
		height:80px;
		background-color:black;
		clear:both;
	}
	#text-right{
		display:inline-block;
		text-align:right;
	}
	.date{
		color:blue;
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
			<p>パスワード変更失敗</p>
		</div>
		<div>
			<h3>ユーザー名の変更に失敗しました。</h3>
			<p>新しいユーザー名を入力してください。</p>
		<div id="text-right">
			<p>ユーザー情報変更画面へ戻る場合は<a href='<s:url action="UserInfoUpdateAction"/>'>こちら</a></p>
			<p>管理者TOPへ戻る場合は<a href='<s:url action="AdminAction"/>'>こちら</a></p>
		</div>
		</div>
	</div>
	<div id="footer">
		<div id="pr">
		</div>
	</div>
</body>
</html>