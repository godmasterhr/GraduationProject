<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE HTML>
<html>
  <head>
    <title></title>
    <link href="../staticFile/css/prodList.css" rel="stylesheet" type="text/css">
    <link href="../staticFile/css/page.css" rel="stylesheet" type="text/css">
    <script type="text/javascript">
    	function changePageA(page,type){
    		var pageL = ${page.pages};
    		if(page<=1){
    			window.location.href="/toItemList?page=1&type="+type;
    		}else{
    			window.location.href="/toItemList?page="+page+"&type="+type;
    		}
    	}
    	function changePage(type){
    		var page = document.getElementById("jump").value;
    		var reg = /^[1-9][0-9]*$/;
    		if(!reg.test(page)){
    			alert("请您输入正确的页面");
    			obj.value = "${page.pageNum}";
    			return;
    		}
    	window.location.href="/toItemList?page="+page+"&type="+type;
    	}
    </script>
  </head>
  <body>
	<%@include file="head.jsp" %> 
   <div id="content">
   
	<div id="prod_content">
	
	<c:forEach items="${page.list }" var="prod">
		<c:set var="type" value="${prod.itemType}" scope="page"></c:set>
		<div id="prod_div">
			<a href="/toItemInfo?id=${prod.id}">
			<img src="getImage?itemUrl=${prod.itemUrl}"></img>
			</a>
			<div id="prod_name_div">
			 <a href="../staticFile/servlet/ProdInfoServlet?id=${prod.id}">
				${prod.title }
			</a>
			</div>
			<div id="prod_price_div">
				￥${prod.price }元
			</div>
			<div>
				<div id="gotocart_div">
					<a href="/toCart?itemId=${prod.id}&num=1">加入购物车</a>
				</div>					
				<div id="say_div">
					库存：${prod.num}
				</div>					
			</div>
		</div>
	</c:forEach>
	</div>
	<div style="clear: both"></div>
	<div id="fy_div">
	
	共<span style="color:red">【${page.total }】</span>条记录 共<span style="color:red">【${page.pages}】</span>页
	<a href="javascript:void(0)" onclick="changePageA(1,${type})">首页</a>
	<a href="javascript:void(0)" onclick="changePageA(${page.prePage},${type})">上一页</a>
	<a href="javascript:void(0)" onclick="changePageA(${page.nextPage},${type})">下一页</a>
	<a href="javascript:void(0)" onclick="changePageA(${page.pages},${type})">尾页</a>
	跳转到<input id="jump" type="text" value="${page.pageNum}" onblur="changePage(${type})"/>页
	</div>
</div>
  <%@include file="foot.jsp" %> 
  </body>
</html>
