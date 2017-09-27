<%@ page language="java" import="java.util.*,java.text.*" pageEncoding="utf-8"%>
<%@taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
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
		$("#nextpage").click(function(){
			var page = $("#page").val();
			var page = page*1+1;
			window.location.href="/toSeeUser?page="+page;
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
        	<div id="table" style="margin-left:100px;margin-top:70px;">
        		<table border="1" cellspacing="0" bordercolor="#ADD8E6"  style="width:600px;height:200px">
        			<th>订单号</th>
        			<th>所属会员</th>
        			<th>订单金额</th>
        			<th>下单时间</th>
        			<th>支付状态</th>
        			<th>操作</th>
        		<c:forEach items="${orderList}" var="order">
        			<tr>
        				<td >${order.orderId}</td>
        				<td >${order.name}</td>
        				<td >${order.sumPrice}</td>
        				<td ><fmt:formatDate value="${order.orderTime}" pattern="yyyy-MM-dd HH:mm"/></td>
        				<td ><c:if test="${order.payMode==1}"><font color="green">已支付</font></c:if>
        				<c:if test="${order.payMode!=1}"><font color="red">未支付</font></c:if></td>
        				<td style="width:90px">
        					<a href="/toUpdateOrder?orderId=${order.orderId}" style="text-decoration: none;color:black;">修改</a>|
        					<a href="/toDeleteOrder?orderId=${order.orderId}" style="text-decoration: none;color:black;">删除</a>
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