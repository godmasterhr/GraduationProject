<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<script type="text/javascript" src="../staticFile/js/jquery-1.4.2.js"></script>
<link rel="stylesheet" href="../staticFile/css/itemInfo.css"/>
<link rel="stylesheet" href="../staticFile/css/index.css"/>
<link rel="stylesheet" href="../staticFile/css/head.css"/>
<link rel="stylesheet" href="../staticFile/css/foot.css"/>
<script type="text/javascript">
	$(function(){
		$("#del").click(function(){
			var num = $("#num").val();
			if(num==1){
				return;
			}else{
				$("#num").val(num*1-1);
			}
		});
		$("#add").click(function(){
			var num = $("#num").val();
			$("#num").val(num*1+1);
		});	
		
		$("#addCart").click(function(){
			var itemId = "${item.id}";
			var num = $("#num").val();
			window.location.href="/toCart?itemId="+itemId+"&num="+num;
		})
	})
</script>
</head>
<body>
<%@include file="head.jsp" %>
<div id="itemInfo_body">
	<div id="itemInfo_img">
		<img src="getImage?itemUrl=${item.itemUrl}"/>
	</div>
	<div id="itemInfo_info">
		<div id="itemInfo_title">
		<font size="4">${item.title}</font>
		</div>
		<div id="itemInfo_sellpoint">
		<font size="3">${item.sellPoint}</font>
		</div>
		<div id="itemInfo_price">
		<font size="1" color="#969696">E_Mall价:</font>&nbsp;<font color="red" size="5">￥${item.price}</font>
		</div>
		<div id="itemInfo_toSell">
		<font size="1" color="#969696">促&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;销:&nbsp;</font><font size="2">&nbsp;满99.00元即赠热销商品，赠完即止，请在购物车点击领取，支持七天无理由退款!</font>
		</div>
		<div id="itemInfo_num">
		<font size="1" color="#969696">数&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;量:&nbsp;&nbsp;&nbsp;
		<img id="del" src="../staticFile/img/itemInfo/del.jpg" align="middle" width="30px" height="30px"  onclick="del()"/>&nbsp;&nbsp;
		<input id="num" type="text" value="1" style="width:40px; height:25px;"/>&nbsp;&nbsp;
		<img id="add"  src="../staticFile/img/itemInfo/add.jpg" align="middle" width="30px" height="30px"onclick="add()"/>
		</div>
		<div id="itemInfo_addCart">
		<img id="addCart" src="../staticFile/img/itemInfo/1.jpg"  width="200"  height="70" >
		</div>
	</div>
</div>
<%@include file="foot.jsp" %> 
</body>
</html>