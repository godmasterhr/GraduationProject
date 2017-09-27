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
		$("#seeItem").click(function(){
			var type = $("#type").val();
			window.location.href="/seeItem?type="+type+"&page=1";
		})
		$("#addItem").click(function(){
			var type = $("#type").val();
			window.location.href="/toaddItem";
		})
		
		
		
	})

</script>
</head>

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
     	 <span id="" class="sbutton" style="margin-top:70px;margin-left:90px;">
        		<span style="font-family: '楷体';font-size:20px;font-weight: bold;color:green">
        			<select id="type" name="type" style="width:100px;" size="1">
        				<option value="1">手机数码</option>
        				<option value="2">电脑平板</option>
        				<option value="3">服装服饰</option>
        				<option value="8">运动鞋靴</option>
        				<option value="4">家用电器</option>
        				<option value="5">食品材料</option>
        				<option value="6">图书杂志</option>
        				<option value="7">医疗保健</option>
        			</select>
        		</span>
        	</span>
      		<span id="seeItem" class="sbutton" style="margin-top:70px;margin-left:30px;">
        		<span style="font-family: '楷体';font-size:20px;font-weight: bold;color:green">
        			查看商品
        		</span>
        	</span>
        	
        	<span id="addItem" class="sbutton" style="margin-top:70px;margin-left:30px;">
        		<span style="font-family: '楷体';font-size:20px;font-weight: bold;color:green">
        			添加商品
        		</span>
        	</span>
        	
        	<div style="margin-left:100px;margin-top:50px;background:pink;width:320px;height:250px;
        	     font-size:20px;font-family: '楷体'";>
        	     <br>
        		简介：<br>
        		&nbsp;&nbsp;对商品进行操作，可以查看商品信息，添加商品，并可修改商品信息，删除商品!
        	
        	</div>
      </div>

    </div>
</div>

<!-- foot盒子 -->
<jsp:include page="foot.jsp"/>
</body>
</html>