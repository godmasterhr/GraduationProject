<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE HTML>
<html>
<head>
	<title>欢迎注册E_Mall</title>
	<meta http-equiv="Content-type" content="text/html; charset=UTF-8" />
	<link rel="stylesheet" href="../staticFile/css/regist.css"/>
	<script type="text/javascript
	" src="../staticFile/js/jquery-1.4.2.js"></script>
	<script type="text/javascript">
		function checkForm(){
			var flag = true;
			//非空校验
			flag = checkNull("userName", "用户名不能为空") && flag;
			flag = checkNull("passWord", "密码不能为空") && flag;
			flag = checkNull("passWord2", "确认密码不能为空") && flag;
			flag = checkNull("name", "姓名不能为空") && flag;
			flag = checkNull("phone", "手机号不能为空") && flag;
			flag = checkNull("email", "邮箱不能为空") && flag;
			flag = checkNull("address", "收货地址不能为空") && flag;
			
			//两次密码是否一致
			flag = checkpassWord("passWord", "两次密码不一致") && flag;
			
			//邮箱格式
			flag = checkEmail("email", "邮箱格式不正确") && flag;
			
			return flag;
		}
		
		//校验邮箱格式
		function checkEmail(name, msg){
			var email = document.getElementsByName(name)[0].value;
			setMsg(name, "");
			checkNull("email", "邮箱不能为空");
			var reg = /^\w+@\w+(\.\w+)+$/;
			if(email != "" && !reg.test(email)){
				setMsg(name, msg);
				return false;
			}
			return true;
		}
		
		//校验两次密码是否一致
		function checkpassWord(name, msg){
			var psw1 = document.getElementsByName(name)[0].value;
			var psw2 = document.getElementsByName(name+"2")[0].value;
			setMsg(name+"2", "");
			checkNull("passWord2", "确认密码不能为空");
			if(psw1 != "" && psw2 != "" && psw1 != psw2){
				setMsg(name+"2", msg);
				return false;
			}
			return true;
		}
		
		//校验输入框是否为空
		function checkNull(name, msg){
			var obj = document.getElementsByName(name)[0];
			var value = obj.value;
			setMsg(name, "");
			if(value == ""){
				setMsg(name, msg);
				return false;
			}
			return true;
		}
		
		//提示消息
		function setMsg(name, msg){
			//alert(msg);
			document.getElementById(name+"_msg").innerHTML = "<font style='color: red;font-size: 14px;'>"+ msg +"</font>";
		}
		
		$(function(){
			var flag= "${flag}";
			if(flag=="true"){
				alert("恭喜你，注册成功！");
				window.location.href="/toLogin";
			}
			
			
		 	$("#userName").blur(function(){
		 		var userName = $("#userName").val();
		 		if(!checkNull("userName", "用户名不能为空")){
					return;
				}
				$("#checkuserName").load("/checkUserName",{"userName":userName});
			}); 
		})
		
		
		
	</script>
</head>
<body>
	<h1>&nbsp;&nbsp;欢迎注册E_Mall</h1>
	<form action="/saveUser" method="POST" onsubmit="return checkForm()">
		<table>
		<div id="s">
			<tr>
			<td class="tds" id="checkuserName" colspan="2" style="font-size: 15px; color: red;text-align: center;">
				<%= request.getAttribute("msg") == null ? "" : request.getAttribute("msg")%>
			</td>
			</tr>
		</div>
			<tr>
				<td class="tds">用户名：</td>
				<td><input id="userName" type="text" name="userName" value="<%= request.getParameter("userName") == null ? "" : request.getParameter("userName") %>" onblur="ajaxCheckuserName(this)">
					<span id="userName_msg"></span>
				</td>
			</tr>
			<tr>
				<td class="tds">密码：</td>
				<td><input type="passWord" name="passWord"  onblur="checkNull('passWord','密码不能为空')">
					<span id="passWord_msg"></span>
				</td>
			</tr>
			<tr>
				<td class="tds">确认密码：</td>
				<td><input type="passWord" name="passWord2"  onblur="checkpassWord('passWord','两次密码不一致')">
					<span id="passWord2_msg"></span>
				</td>
			</tr>
			<tr>
				<td class="tds">姓名：</td>
				<td><input type="text" name="name"  value="<%= request.getParameter("name") == null ? "" : request.getParameter("name") %>"  onblur="checkNull('name','姓名不能为空')">
					<span id="name_msg"></span>
				</td>
			</tr>
			<tr>
				<td class="tds" >手机：</td>
				<td><input type="text" name="phone"  value="<%= request.getParameter("phone") == null ? "" : request.getParameter("phone") %>" onblur="checkNull('phone','手机号不能为空')">
					<span id="phone_msg"></span>
				</td>
			</tr>
			<tr>
				<td class="tds" >邮箱：</td>
				<td><input type="text" name="email"  value="<%= request.getParameter("email") == null ? "" : request.getParameter("email") %>" onblur="checkEmail('email','邮箱格式不正确')">
					<span id="email_msg"></span>
				</td>
			</tr>
			<tr>
				<td class="tds" >收货地址：</td>
				<td><input type="text" name="address"  value="<%= request.getParameter("address") == null ? "" : request.getParameter("address") %>" onblur="checkNull('address','收货地址不能为空')">
					<span id="address_msg"></span>
				</td>
			</tr>
				<tr>
					<td colspan="2">
				&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;		
						<input type="submit" value="注册用户"/>
					</td>
				</tr>
		</table>
	</form>
</body>
</html>

