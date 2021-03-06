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
<title>管理者権限なし画面</title>

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
	}

	table{
		text-align:center;
		margin:0px;
		float:left
	}
	/* ========Ssite LAYOUT======== */
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
	#manage{
		padding:30px;
		text-align:center;
		display:inline-block;
	}
	#box{
		width:300px;
		margin:20px;;
		height:50px;
		border:1px solid black;
		padding-top:10px;
		display:inline-block;
		text-align:center;
	}
	#link{
		clear:both;
	}
	.command{
		clear:both;
		text-align:center;
		display:inline-block;
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
			<p>管理者権限無効</p>
		</div>
		<h3>管理者権限がありません。</h3>
	<div id="link">
		<p>Homeへ戻る場合は<a href='<s:url action="GoHomeAction"/>'>こちら</a></p>
		<p>マイページは<a href='<s:url action="MyPageAction"/>'>こちら</a></p>
	</div>
	</div>
	<div id="footer">
		<div id="pr">
		</div>
	</div>
</body>
</html>