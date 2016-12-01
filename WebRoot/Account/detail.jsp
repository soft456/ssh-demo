<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>add</title>
<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

</head>

<body>

	<form action="account.do" method="post">
		<input type="hidden" id="operateType" name="operateType" value="list">		
						
			用户 ID :${data.userId}<br />
			真实姓名:${data.userRealname}<br />
			用户手机:${data.userMobile}<br />
			用户邮箱:${data.userEmail}<br />
			用户密码:${data.userPwd}<br />
			其他备注:${data.demo}<br />
			
			 <input type="submit" value="返回" />

	</form>


</body>
</html>
