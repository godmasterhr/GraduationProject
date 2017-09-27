<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>购物车</title>
<link  rel="stylesheet" href="../staticFile/css/cart.css" >
<script type="text/javascript" src="../staticFile/js/jquery-1.4.2.js"></script>
<script type="text/javascript">
$(function(){
	$("#delNum").click(function(){
		var id = $("#prodId").val();
		var number = $("#num").val();
		if(number==1){
			return;
		}else{
			$("#num").val(number*1-1);
		}
		var number = $("#num").val();
		window.location.href="/cartNum?num="+number+"&itemId="+id;
	});
	$("#addNum").click(function(){
		var id = $("#prodId").val();
		var number = $("#num").val();
		$("#num").val(number*1+1);
		var number = $("#num").val();
		window.location.href="/cartNum?num="+number+"&itemId="+id;
	});	
	
})


</script>
</head>
<body>
<jsp:include page="head.jsp"></jsp:include>
<div id="cart">
<!-- 标题信息 -->
		<div id="title">
			<input name="allC" type="checkbox" value="" onclick=""/>
			<span id="title_checkall_text">全选</span>
			<span id="title_name">商品</span>
			<span id="title_price">单价（元）</span>
			<span id="title_buynum">数量</span>
			<span id="title_money">小计（元）</span>
			<span id="title_del">操作</span>
		</div>
<!-- 商品信息 -->
<c:set var="money" scope="page" value="0"/>
	<c:forEach items="${cart}" var="entry">
		<div id="prods">
			<input name="prodC" type="checkbox" value="" onclick=""/>
			<input id="prodId" value="${entry.key.id}" style="display:none">
			<img src="getImage?itemUrl=${entry.key.itemUrl}" width="90" height="90" />
			<span id="prods_name">${entry.key.title }</span>
			<span id="prods_price">${entry.key.price }</span>
			<span id="prods_buynum"> 
				<a href="javascript:void(0)" id="delNum"  >-</a>
				<input id="num" type="text" value="${entry.value}" size="4" >
				<a href="javascript:void(0)" id="addNum" >+</a>
			</span>
			<c:set  var="money" value="${money+entry.value*entry.key.price }" scope="page"/>
			<span id="prods_money">${entry.value*entry.key.price }</span>
			<span id="prods_del"><a href="/delCart?itemId=${entry.key.id}">删除</a></span>
		</div>
	</c:forEach>
	<!-- 总计条 -->
		<div id="total">
			<div id="total_1">
				<input name="allC" type="checkbox" value=""> 
				<span>全选</span>
				<a id="del_a" href="#">删除选中的商品</a>
				<span id="span_1">总价：</span>
				<span id="span_2">${money}</span>
			</div>
			<div id="total_2">	
				<a id="goto_order" href="/addOrder">去结算</a>
			</div>
		</div>
</div>		
<jsp:include page="foot.jsp"></jsp:include>
</body>
</html>