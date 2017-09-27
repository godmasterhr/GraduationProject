<%@ page language="java" import="java.util.*,java.text.*" pageEncoding="utf-8"%>
<%@taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<html>
<link href="staticFile/css/Style.css" rel="stylesheet" type="text/css" />
<head>
<title>新世纪E_Mall电子商城</title>

<!-- 主页 body -->
<body>
<!-- 主页整体盒子 -->
<div class="main">

	<jsp:include page="head.jsp"/>

<!-- 除logo外整体盒子 -->
   <div class="boo">

<jsp:include page="left.jsp"/>

  
  <!--E_Mall 以及图片盒子 -->
      <div class="box">
      <br> <br> <br> <br> <br>
      	<form action="/saveNotice" method="post">
	      	<span style="font-size: 25px;font-weight:bold;margin-left:80px;">公告标题:</span>
	      	<input type="text" name="noticeTitle" style="width:400px;height:25px;"/>
	      	<br><br>
	      	<div style="width:600px;font-size:25px;font-weight:bold;margin-left:80px;">公告内容:</div>
	      	<br>
			<textarea style="margin-left:100px" name="noticeContent" cols="73" rows="15" wrap="VIRTUAL"> 
			</textarea> 
			<input type="submit" value="提交公告">
		</form>
      </div>

    </div>
</div>

<!-- foot盒子 -->
<jsp:include page="foot.jsp"/>
</body>
</html>