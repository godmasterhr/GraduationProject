<%@ page language="java" import="java.util.*,java.text.*" pageEncoding="utf-8"%>
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
		$("#delUser").click(function(){
			var page = $("#page").val();
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
        	
        	<div style="margin-left:100px;margin-top:50px;background:pink;width:320px;height:250px;
        	     font-size:20px;font-family: '楷体'";>
        	     <br>
        		简介：<br>
        		&nbsp;&nbsp;对会员(用户)进行操作，可以查看用户信息，并可实现删除功能!
        	
        	</div>
        	<input id="page" hidden="hidden" type="text" value="1" style="width:20px"/>
      </div>

    </div>
</div>

<!-- foot盒子 -->
<jsp:include page="foot.jsp"/>
</body>
</html>