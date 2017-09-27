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
<script type="text/javascript" src="../staticFile/js/jquery-1.4.2.js"></script>
<script type="text/javascript">
	$(function(){
		$("#seeNotice").click(function(){
			window.location.href="/toSeeNotice";
		})
		
		
	})
</script>

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
      
        	
        	<div id="table" style="margin-left:90px;margin-top:70px">
        		<table border="1" cellspacing="0" bordercolor="#ADD8E6"  style="width:600px;height:200px">
        			<th>公告id</th>
        			<th>公告标题</th>
        			<th>操作</th>
        		<c:forEach items="${noticeList}" var="notice">
        			<tr>
        				<td>${notice.noticeId}</td>
        				<td><a  style="text-decoration: none; color:black" href="/seeNoticeInfo?noticeId=${notice.noticeId}">${notice.noticeTitle}</a></td>
        				<td style="width:100px"> 
        				<a href ="/toUpdateNotice?noticeId=${notice.noticeId}" style="text-decoration: none;color:black">更新</a> | 
        				<a href ="/toDeleteNotice?noticeId=${notice.noticeId}" style="text-decoration: none;color:black">删除</a>
        				
        				</td>
        			</tr>
        		</c:forEach>	
        			
        		</table>
        	</div>
        	
        	
      </div>

    </div>
</div>

<!-- foot盒子 -->
<jsp:include page="foot.jsp"/>
</body>
</html>