<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-type" content="text/html; charset=UTF-8" />
		<link rel="stylesheet" href="../staticFile/css/index.css"/>
		<link rel="stylesheet" href="../staticFile/css/head.css"/>
		<link rel="stylesheet" href="../staticFile/css/foot.css"/>
		<title>欢迎光临E-MALL电子商城</title>
		<script type="text/javascript">
			function search(){
				var input= document.getElementById("search");
				var key = input.value;
				window.location.href="/toSearch?key="+key+"&page=1&rows=12";
			}
		
		</script>
	</head>
	<body>

	<!--e_mall首页头部-->
<div id="head">
	<div id="line1">
	<c:if test="${user==null}">
		<div id="content">
			<a href="/toLogin">登陆</a>&nbsp;&nbsp;|&nbsp;&nbsp;<a href="/toRegist">注册</a>
			<a id="right1" href="/tonotice" >商城公告</a>
		</div>
	</c:if>
	<c:if test="${user!=null}">
		<div id="content">
			欢迎回来，${sessionScope.user.name}&nbsp;&nbsp;|&nbsp;&nbsp;<a href="/toUserInfo">个人信息</a>
			&nbsp;&nbsp;|&nbsp;&nbsp;<a href="/toLogOut">注销</a>
		<c:if test="${sessionScope.user.userName=='admin'}">&nbsp;&nbsp;<a href="http://manage.e_mall.com:8081/index">后台管理</a></c:if>
			<a id="right2" href="/tonotice" >商城公告</a>
		</div>
	</c:if>
	</div>
	
	<div id="line2">
		<img src="./staticFile/img/head/logo.jpg" alt="logo" id="logo"/>
		<span class="search">
			<input id="search" type="text" name="#" class="search_inp"/>
			<input  type="button" value="搜索" class="search_btn"    onclick="search()"/>
		</span>
		<span class="my_order_cart">
				<a href="/order">我的订单</a> |
				<a href="/cart">我的购物车</a>
		</span>
	
	</div>


	<div id="line3">
		<div id="content">
			<ul>
				<li><a href="/index">首页</a></li>
				<li><a href="/toItemList?page=1&type=1">手机数码</a></li>
				<li><a href="/toItemList?page=1&type=2">电脑平板</a></li>
				<li><a href="/toItemList?page=1&type=3">服装服饰</a></li>
				<li><a href="/toItemList?page=1&type=8">运动鞋靴</a></li>
				<li><a href="/toItemList?page=1&type=4">家用电器</a></li>
				<li><a href="/toItemList?page=1&type=5">食品材料</a></li>
				<li><a href="/toItemList?page=1&type=6">图书杂志</a></li>
				<li><a href="/toItemList?page=1&type=7">医疗保健</a></li>
				
			</ul>
		</div>
	</div>
</div>

	</body>
</html>
