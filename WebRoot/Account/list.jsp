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

<title>My JSP 'index.jsp' starting page</title>
<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

<script type="text/javascript">
	function detail(userId) {
		document.getElementById("operateType").value = "detail";
		document.getElementById("userId").value = userId;
		document.forms[0].submit();
	}
	function add() {
		document.getElementById("operateType").value = "add";
		document.forms[0].submit();
	}
	function update(userId) {
		document.getElementById("operateType").value = "update";
		document.getElementById("userId").value = userId;
		document.forms[0].submit();
	}
	function del(userId) {
		document.getElementById("operateType").value = "delete";
		document.getElementById("userId").value = userId;
		document.forms[0].submit();
	}
</script>

</head>

<body>

	<form action="account.do" method="post">
		<input type="hidden" id="operateType" name="operateType" value="">
		<input type="hidden" id="userId" name="userId" value=""> <input
			type="button" value="添加" onclick="add(${account.userId});">

		<hr />
		---- 用户ID ---- 邮箱 ---- 手机 ----
		<hr />

		<c:forEach var="account" items="${data.listAccount}">
    	---- ${account.userId} ---- ${account.userEmail} ---- ${account.userMobile} ---- 
    	<input type="button" value="详情"
				onclick="detail('${account.userId}');">&nbsp;
    	<input type="button" value="修改"
				onclick="update('${account.userId}');">&nbsp;
    	<input type="button" value="删除" onclick="del('${account.userId}');">&nbsp;
    	<br />
		</c:forEach>
	</form>


</body>
</html>
