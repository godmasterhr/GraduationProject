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
		$("#seeUser").click(function(){
			window.location.href="/toSeeUser?page=1";
		});
		$("#nextpage").click(function(){
			var page = $("#page").val();
			var page = page*1+1;
			window.location.href="/toDelUser?page="+page;
		})
		$("#delUser").click(function(){
			window.location.href="/toDelUser?page=1";
		});
		
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
      
     		<span id="seeUser" class="sbutton" style="margin-top:70px;margin-left:90px;">
        		<span style="font-family: '楷体';font-size:20px;font-weight: bold;color:green">
        			查看会员
        		</span>
        	</span>
        	
        	
        	<span id="delUser" class="sbutton" style="margin-top:70px;margin-left:30px;">
        		<span style="font-family: '楷体';font-size:20px;font-weight: bold;color:green">
        			删除会员
        		</span>
        	</span>
        	<div id="table" style="margin-left:90px">
        		<table border="1" cellspacing="0" bordercolor="#ADD8E6"  style="width:600px;height:200px">
        			<th>用户ID</th>
        			<th>用户名</th>
        			<th>姓名</th>
        			<th>操作</th>
        			
        		<c:forEach items="${userList}" var="user">
        			<tr>
        				<td style="width:300px">${user.userId}</td>
        				<td style="width:20px">${user.userName}</td>
        				<td style="width:30px">${user.name}</td>
        				<td style="width:30px;text-align: center">
        				<a style="text-decoration: none; color:black" href="/delUser?userId=${user.userId}" >删除</a>
        				</td>
        			</tr>
        		</c:forEach>	
        			
        		</table>
        	<span style="margin-left:490px">第<input id="page"  readonly="readonly"   type="text" value="${page}" style="width:20px"/>页     <a id="nextpage" href="#" style="text-decoration: none;">下一页</a></span>
        	</div>
        	
        	
      </div>

    </div>
</div>

<!-- foot盒子 -->
<jsp:include page="foot.jsp"/>
</body>
</html>