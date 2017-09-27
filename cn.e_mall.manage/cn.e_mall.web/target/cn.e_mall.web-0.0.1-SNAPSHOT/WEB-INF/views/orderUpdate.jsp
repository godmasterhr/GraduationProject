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
      	<form action="/updateOrder" method="post">
      		<table  border="1" cellspacing="0" bordercolor="#ADD8E6"  style="width:500px;height:200px;margin-left:200px;">
      			<tr>
      				<td>订单号:</td>
      				<td><input type="text" name="orderId" readonly="readonly"   value="${order.orderId}"/></td>
      			</tr>
      				<tr>
      				<td>所属会员:</td>
      				<td><input type="text" name="name"  value="${order.name}"/></td>
      			</tr>
      				<tr>
      				<td>订单金额:</td>
      				<td>	<input type="text" name="sumPrice" readonly="readonly"  value="${order.sumPrice}"/></td>
      			</tr>
      				<tr>
      				<td>下单时间:</td>
      				<td><input type="text" name="" readonly="readonly" style="width:200px;height:25px;" value="<fmt:formatDate value="${order.orderTime}" pattern="yyyy-MM-dd HH:mm:ss"/>"/></td>
      			</tr>
      				<tr>
      				<td>支付状态(1已支付,0未支付):</td>
      				<td><input type="text" name="payMode" style="width:200px;height:25px;" value="${order.payMode}"/></td>
      			</tr>
      				<tr>
      				<td colspan="2" align="center">	<input type="submit" value="修改订单"></td>
      			</tr>
      		
      		</table>
			
		</form>
      </div>

    </div>
</div>

<!-- foot盒子 -->
<jsp:include page="foot.jsp"/>
</body>
</html>