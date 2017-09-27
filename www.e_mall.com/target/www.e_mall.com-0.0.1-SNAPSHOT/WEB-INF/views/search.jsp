<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page trimDirectiveWhitespaces="true" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Cache-Control" content="max-age=300" />
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>${key} - 商品搜索 - E_Mall</title>
<link rel="stylesheet" type="text/css" href="../staticFile/css/base.css" media="all" />
<link rel="stylesheet" type="text/css" href="../staticFile/css/psearch20131008.css" media="all" />
<script type="text/javascript" src="/js/jquery-1.2.6.min.js"></script>
</head>
<body>
<script type="text/javascript" src="/js/base-2011.js" charset="utf-8"></script>
<!-- header start -->
<jsp:include page="head.jsp" />
<!-- header end -->
<div class="w main">
	<div class="crumb">全部结果&nbsp;&gt;&nbsp;<strong>"${key}"</strong></div>
<div class="clr"></div>

<div class="m psearch " id="plist">
<ul class="list-h clearfix" tpl="2">
<c:forEach items="${item}" var="item">
<li class="item-book" bookid="11078102">
	<div class="p-img">
		<a target="_blank" href="http://www.e_mall.com/toItemInfo?id=${item.id}">
			<img width="160" height="160" data-img="1" src="getImage?itemUrl=${item.itemUrl}" />
		</a>
	</div>
	<div class="p-name">
		<a target="_blank" href="http://www.e_mall.com/toItemInfo?id=${item.id}">
			${item.title}
		</a>
	</div>
	<div class="p-price">
		<i>E_Mall价：</i>
		<strong>￥<fmt:formatNumber groupingUsed="false" maxFractionDigits="2" minFractionDigits="2" value="${item.price}"/></strong>
	</div>
	<div class="service">由 E_Mall 发货</div>
	<div class="extra">
		<span class="star"><span class="star-white"><span class="star-yellow h5">&nbsp;</span></span></span>
	</div>
</li>
</c:forEach>
</ul></div>

<div class="m clearfix" id="bottom_pager">
<div  id="pagin-btm" class="pagin fr" clstag="search|keycount|search|pre-page2">
	<a href="toSearch?key=${key}&page=1&rows=12"" class="next">上一页<b></b></a>
	<a href="toSearch?key=${key}&page=1&rows=12" class="current">1</a>
	<a href="toSearch?key=${key}&page=2&rows=12">2</a>
	<a href="toSearch?key=${key}&page=3&rows=12">3</a>
	<a href="toSearch?key=${key}&page=4&rows=12">4</a>
	<a href="toSearch?key=${key}&page=5&rows=12">5</a>
	<span class="text">…</span>
	<a href="toSearch?key=${key}&page=2&rows=12" class="next">下一页<b></b></a>
	<span class="page-skip"><em>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</em></span>
</div>
</div>
</div>
<!-- footer start -->
<jsp:include page="foot.jsp" />
<!-- footer end -->
<script type="text/javascript" src="/js/jquery.hashchange.js"></script>
<script type="text/javascript" src="/js/search_main.js"></script>
</body>
</html>