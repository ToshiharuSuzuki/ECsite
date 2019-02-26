<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
<meta http-equiv="Content-Style-Type" content="text/css"/>
<title>ヘッダー</title>
<style type="text/css">
#header{
	width:100%;
	height:80px;
	background-color:blue;
	line-height:80px;
}
#header-title{
	font-weight:bold;
	font-size:30px;
	margin-left:20px;
	color:white;
}
</style>
</head>
<body>
<div id="header">
<div id="header-title">◇ECサイト◇</div>
<div id="header-menu">
<ul>
<s:form id="form" name="form">
	<s:if test='#session.containsKey("id")'>
	<li><s:select name="categoryId" list="#session.mCategoryDtoList" listValue="categoryName" class="cs-div" id="categoryId"/></li>
	</s:if>
</s:form>
</ul>
</div>
</div>
</body>
</html>