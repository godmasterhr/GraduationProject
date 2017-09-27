<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-type" content="text/html; charset=UTF-8" />
		<link rel="stylesheet" href="../staticFile/css/index.css"/>
		<link rel="stylesheet" href="../staticFile/css/head.css"/>
		<link rel="stylesheet" href="../staticFile/css/foot.css"/>
		<title>欢迎光临E-MALL电子商城</title>
		
	<script type="text/javascript"
		 src="../staticFile/js/jquery-easyui-1.4.1/jquery.min.js">
	</script>
	<script type="text/javascript">
		$(function(){
			$.get("http://manage.e_mall.com/test.json",function(data){
				alert(data.key);
			});
		});
	</script>
	
	</head>
	<body>
	<%@include file="head.jsp" %> 

	<!--e_mall首页身体-->
		<div id="index">
			<div id="line1">
				<img src="../staticFile/img/index/1.jpg"/>
			</div>
			<div id="line2">
				<img id="line2_1" src="../staticFile/img/index/2.jpg"/>
				<img id="line2_2" src="../staticFile/img/index/3.jpg"/>
				<img id="line2_3" src="../staticFile/img/index/4.jpg"/>
			</div>
			<div id="line3">
				<img id="line3_1" src="../staticFile/img/index/5.jpg"/>
				<img id="line3_2" src="../staticFile/img/index/6.jpg"/>
				<img id="line3_3" src="../staticFile/img/index/7.jpg"/>
			</div>
			<div id="line4">
				<img src="../staticFile/img/index/8.jpg"/>
			</div>
			
		</div>

		<%@include file="foot.jsp" %> 
	
	</body>
</html>
