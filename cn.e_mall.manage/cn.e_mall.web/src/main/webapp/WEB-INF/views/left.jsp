<%@ page language="java" import="java.util.*,java.text.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<html>
<link href="staticFile/css/Style.css" rel="stylesheet" type="text/css" />
<script type="text/javascript" src="../staticFile/js/jquery-1.4.2.js"></script>
<head>
<script type="text/javascript">
	$(function(){
		$("#itemManage").click(function(){
			window.location.href="/toItemManage";
		});
		
		$("#userManage").click(function(){
			window.location.href="/toUserManage";
		});
		
		$("#orderManage").click(function(){
			window.location.href="/toOrderManage";
		});
		
		$("#noticeManage").click(function(){
			window.location.href="/toNoticeManage";
		});
		
		$("#return").click(function(){
			window.location.href="/toWWW";
			});
		
	})

</script>


</head>

<!-- 主页 body -->
<body>

<!-- 登录导航 -->
      <div class="daohang">
       		  <br>
         	<span style="font-family: '楷体';font-size:25px;font-weight: bold">
	         	<center>尊敬的管理员,您好！<br>
	         	欢迎您使用E_Mall后台管理系统！</center>
	         	-----------------------
         	</span>
         	
         	<div id="itemManage" class="button">
         		<span style="font-family: '楷体';font-size:22px;font-weight: bold;color:green">
         			商品管理
         		</span>
         	</div>
         	
         	</br></br>
         	
         	<div id="userManage" class="button">
         		<span style="font-family: '楷体';font-size:22px;font-weight: bold;color:green">
         			会员管理
         		</span>
         	</div>
         	
         	</br></br>
         	
         	<div id="orderManage" class="button">
         		<span style="font-family: '楷体';font-size:22px;font-weight: bold;color:green">
         			订单管理
         		</span>
         	</div>
         	
         	</br></br>
         	
         	<div id="noticeManage" class="button">
         		<span style="font-family: '楷体';font-size:22px;font-weight: bold;color:green">
         			公告管理
         		</span>
         	</div>
         	
         	</br></br>
         	
         	<div id="return" class="button">
         		<span style="font-family: '楷体';font-size:22px;font-weight: bold;color:green">
         			返回前台
         		</span>
         	</div>
         
      
      
      </div>
  
</body>
</html>