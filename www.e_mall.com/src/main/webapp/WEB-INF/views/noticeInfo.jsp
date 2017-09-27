<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>公告信息</title>
<link  rel="stylesheet" href="../staticFile/css/notice.css" >
</head>
<body>
<jsp:include page="head.jsp"></jsp:include>
<div id="notice">
	<div id="context">
		<h1>${notice.noticeTitle}</h1>
		<br>
		<span>${notice.noticeContent}</span>
	</div>
</div>
<jsp:include page="foot.jsp"></jsp:include>
</body>
</html>