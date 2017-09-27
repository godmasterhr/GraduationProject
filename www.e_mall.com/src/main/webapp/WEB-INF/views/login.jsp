<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-type" content="text/html; charset=UTF-8" />
		<link rel="stylesheet" href="../staticFile/css/login.css"/>
		<title>E_Mall欢迎您登陆</title>
		<script type="text/javascript">
			function zhuce(){
				window.location.href="/toRegist";
			}
		</script>
	</head>
	<body>
		<h1>欢迎登陆E_Mall</h1>
		<form action="/login" method="POST">
			<table>
				<tr>
					<td colspan="2" style="color: red; font-size:14px; text-align:center;">
						${error}
					</td>
				</tr>
				<tr>
					<td class="tdx">用户名:</td>
					<td><input type="text" name="userName" value="${cookie.remember.value}"/></td>
				</tr>
				<tr>
					<td class="tdx">密码:</td>
					<td><input type="password" name="passWord"/></td>
				</tr>
				<tr>
					<td colspan="2">
					<input type="checkbox" name="remember" value="true" 
						<c:if test="${cookie.remember.value!=null }"> checked="checked" </c:if>
					/>记住用户名
						<input type="checkbox" name="autologin" value="true"/>30天内自动登陆
					</td>
				</tr>
				<tr>
					<td colspan="2">
						<div id="button">
							<input type="submit" value="登陆"/>
							<input type="zhuce" value="     注册" onclick="zhuce()"/>
						</div>
					</td>
				</tr>
			</table>
		</form>		
	</body>
</html>