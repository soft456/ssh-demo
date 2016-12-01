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

<title>edit</title>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

<script type="text/javascript">
	function saveForm() {
		document.getElementById("operateType").value = "updatePost";
		document.forms[0].submit();
	}
	function toList() {
		document.getElementById("operateType").value = "list";
		document.forms[0].submit();
	}
</script>

</head>

<body>

	<form action="account.do" method="post">
		<input type="hidden" id="operateType" name="operateType" value="">
		<input type="hidden" id="id" name="id" value="${data.id}"> 用户
		ID :<input type="text" size="40" name="userId" readonly="readonly"
			value="${data.userId}"><br /> 用户手机:<input type="text"
			size="40" name="userMobile" value="${data.userMobile}"><br />
		用户邮箱:<input type="text" size="40" name="userEmail"
			value="${data.userEmail}"><br /> 用户密码:<input type="text"
			size="40" name="userPwd" value="${data.userPwd}"><br />
		真实姓名:<input type="text" size="40" name="userRealname"
			value="${data.userRealname}"><br /> 其他备注:<input type="text"
			size="40" name="demo" value="${data.demo}"><br /> <input
			type="button" name="btnSaveForm" value="保存" onClick="saveForm()" />
		<input type="reset" name="btnBack" value="重置" /> <input type="button"
			value="返回" onclick="toList();" />


	</form>


</body>
</html>
