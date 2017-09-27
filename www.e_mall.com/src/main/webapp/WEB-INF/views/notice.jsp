<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>商城公告</title>
<link  rel="stylesheet" href="../staticFile/css/notice.css" >
</head>
<body>
<jsp:include page="head.jsp"></jsp:include>
<div id="notice">
	<div id="context">
		<h1>商城公告</h1>
		<table>
		<c:forEach  items="${noticeList}" var="notice" varStatus="i">
		<tr><td>${i.index+1}、<a href="/noticeInfo?noticeId=${notice.noticeId}">${notice.noticeTitle}</a></td></tr>
		</c:forEach>
		</table>
	</div>
</div>
<jsp:include page="foot.jsp"></jsp:include>
</body>
</html>