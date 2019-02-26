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
<title>ユーザー情報変更画面</title>

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
		height:auto;
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
	.red{
		color:red;
	}
	.update{
		width:auto;
		height:auto;
		padding:20px;
		text-align:center;
		display:inline;
	}
	.update_code{
		border:1px solid black;
		width:400px;
		height:auto;
		margin:5px auto;
		border-radius:5px;
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
			<p>ユーザー情報変更</p>
		</div>
		<div>
			<h3>下記のユーザー情報を変更します。</h3>
		<br>ユーザー番号:<span class="date"><s:property value="id"/>番</span>
		<br>ユーザーID:<span class="date"><s:property value="loginId"/></span>
		<br>現在のパスワード:<span class="date"><s:property value="loginPassword"/></span>
			<span class="red">*変更が可能です</span>
		<br>現在のユーザー名:<span class="date"><s:property value="userName"/></span>
			<span class="red">*変更が可能です</span>
		<br>登録日:<span class="date"><s:property value="insert_date"/></span>
		<br>更新日:<span class="date"><s:property value="updated_date"/></span>
		<br>管理者権限:<span class="date"><s:property value="message"/></span>

	<div class="update">
		<div class="update_code">
		<s:form action="UserInfoUpdatePasswordAction">
		<h3>パスワードの変更</h3>
		<br>新しいパスワード:<s:textfield name="newLoginPassword"/>
		<input type="hidden" value='<s:property value="LoginPassword"/>' name="oldLoginPassword">
		<s:submit value="パスワード変更"/>
		</s:form>
		</div>

		<div class="update_code">
		<s:form action="UserInfoUpdateUserNameAction">
		<h3>ユーザー名の変更</h3>
		<br>新しいユーザー名:<s:textfield name="newUserName"/>
		<input type="hidden" value='<s:property value="userName"/>' name="oldUserName">
		<s:submit value="ユーザー名変更"/>
		</s:form>
		</div>
	</div>

		<div id="text-right">
			<p>前画面へ戻る場合は<a href='<s:url action="UserInfoUpdateAction"/>'>こちら</a></p>
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