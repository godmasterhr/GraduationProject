<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE HTML>
<html>
  <head>	
    <title>订单列表页</title>
    <link href="../staticFile/css/orderList.css" rel="stylesheet" type="text/css">
  </head>
<body >
 <%@include file="head.jsp" %> 
 <c:forEach items="${orderList}" var="order">
<dl class="Order_information" >
			<dt>
				<h3>订单信息</h3>
			</dt>
			<dd>
				 订单编号：${order.orderId }<br/>
				 下单时间：<fmt:formatDate value="${order.orderTime }" pattern="yyyy-MM-dd HH:mm:ss"/><br /> 
				 订单金额：${order.sumPrice}<br/> 
				 收货地址：${order.address}<br/> 
				支付状态：<c:if test="${order.payMode=='0' }"><font color="red">未支付</font><br/></c:if>
				<c:if test="${order.payMode=='1' }"><font color="green">已支付</font><br/></c:if>
				支付方式：<a href="/toPay?orderId=${order.orderId }">在线支付</a>
			</dd>
		</dl>
	
		<table width="1200" border="0" cellpadding="0"
			cellspacing="1" style="background:#d8d8d8;color:#333333;margin-left:80px">
			<tr>
				<th width="276" height="30" align="center" valign="middle" bgcolor="#f3f3f3">商品图片</th>
				<th width="247" align="center" valign="middle" bgcolor="#f3f3f3">商品名称</th>
				<th width="231" align="center" valign="middle" bgcolor="#f3f3f3">商品单价</th>
				<th width="214" align="center" valign="middle" bgcolor="#f3f3f3">购买数量</th>
				<th width="232" align="center" valign="middle" bgcolor="#f3f3f3">小计</th>
			</tr>
	<c:forEach items="${order.itemMap}" var="entry">
			<tr>
				<td align="center" valign="middle" bgcolor="#FFFFFF">
					<img src="getImage?itemUrl=${entry.key.itemUrl }" width="90" height="105">
				</td>
				<td align="center" valign="middle" bgcolor="#FFFFFF">${entry.key.title }</td>
				<td align="center" valign="middle" bgcolor="#FFFFFF">${entry.key.price }元</td>
				<td align="center" valign="middle" bgcolor="#FFFFFF">${entry.value }件</td>
				<td align="center" valign="middle" bgcolor="#FFFFFF">${entry.value*entry.key.price }元</td>
			</tr>
	</c:forEach>
		</table>
		<div class="Order_price">￥${order.sumPrice}元</div>
</c:forEach>
  <%@include file="foot.jsp" %>
  </body>
</html>
