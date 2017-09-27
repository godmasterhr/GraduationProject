<%@ page language="java" import="java.util.*,java.text.*" pageEncoding="utf-8"%>
<%@taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<html>
<link href="staticFile/css/Style.css" rel="stylesheet" type="text/css" />
<script type="text/javascript" src="../staticFile/js/jquery-1.4.2.js"></script>
<script type="text/javascript">
</script>
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
      <br> <br> <br> <br>
      	<table style="margin-left:64px;">
      	<form action="/addItem" method="post" enctype="multipart/form-data">
      			<tr>
      				<td>商品种类:</td>
      				<td><select id="type" name="itemType" style="width:100px;" size="1">
        				<option value="1">手机数码</option>
        				<option value="2">电脑平板</option>
        				<option value="3">服装服饰</option>
        				<option value="8">运动鞋靴</option>
        				<option value="4">家用电器</option>
        				<option value="5">食品材料</option>
        				<option value="6">图书杂志</option>
        				<option value="7">医疗保健</option>
        			</select>
      				</td>
      			</tr>
      			<tr>
      				<td>商品图片:</td>
      				<td><input  type="file" name="file"/></td>
      			</tr>
      			<tr>
      				<td>商品标题:</td>
      				<td><input type="text" name="title" style="width:550;height:25px;" /></td>
      			</tr>
      			<tr>
      				<td>商品卖点:</td>
      				<td><input type="text" name="sellPoint" style="width:550;height:25px;" /></td>
      			</tr>
      			<tr>
      				<td>商品单价:</td>
      				<td><input type="text" name="price" style="width:550;height:25px;"/></td>
      			</tr>
      			<tr>
      				<td>商品库存:</td>
      				<td><input type="text" name="num" style="width:550;height:25px;" /></td>
      			</tr>
      			<tr>
      				<td colspan ='2'><center><input type="submit" value="添加商品"></center></td>
      			</tr>
		</form>
		</table>
      		
      </div>

    </div>
</div>

<!-- foot盒子 -->
<jsp:include page="foot.jsp"/>
</body>
</html>