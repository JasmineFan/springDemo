<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="/SpringDemo/doRegister" method="POST">
		<label>id</label> <input name="id">
		<label>name</label>  <input name="username">
		<label>password</label>  <input name="password">
		<label>state</label>  <input name="state">
		<input type="submit">
	</form>
</body>
</html>