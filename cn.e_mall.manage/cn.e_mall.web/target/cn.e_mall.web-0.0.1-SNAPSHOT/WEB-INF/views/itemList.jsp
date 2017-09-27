<%@ page language="java" import="java.util.*,java.text.*" pageEncoding="utf-8"%>
<%@taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core"%>
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
		$("#prepage").click(function(){
			var prepage = ${pageInfo.prePage};
			var type = $("#type").val();
			if(prepage==0)prepage=1;
			window.location.href="/seeItem?type="+type+"&page="+prepage;
		})
		$("#nextpage").click(function(){
			var nextpage =  ${pageInfo.nextPage};
			var type = $("#type").val();
			window.location.href="/seeItem?type="+type+"&page="+nextpage;
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
      
        	
        	<div id="table" style="margin-left:90px;margin-top:70px">
        		<table border="1" cellspacing="0" bordercolor="#ADD8E6"  style="width:600px;height:200px">
        			<th>商品名称</th>
        			<th>单价</th>
        			<th>操作</th>
        		<c:forEach items="${pageInfo.list}" var="item">
        			<tr>
        				<td>${item.title}</td>
        				<td>${item.price}</td>
        				<td style="width:100px"> 
        				<a href ="/toUpdateItem?itemId=${item.id}" style="text-decoration: none;color:black">更新</a> | 
        				<a href ="/toDeleteItem?itemId=${item.id}" style="text-decoration: none;color:black">删除</a>
        				</td>
        			</tr>
        		</c:forEach>	
        		</table>
        		<input id="type" hidden="true" value="${pageInfo.list[0].itemType}">
        		<span style="margin-left:490px"><a id="prepage" href="#" style="text-decoration: none;">上一页</a> <a id="nextpage" href="#" style="text-decoration: none;">下一页</a></span>
        	</div>
        	
        	
      </div>

    </div>
</div>

<!-- foot盒子 -->
<jsp:include page="foot.jsp"/>
</body>
</html>