<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table>
		<c:forEach items="${list}" var="user" >
			<tr>
				<td><label>id:</label>${user.id}</td>
				<td><label>name:</label> ${user.username}</td>
				<td><label>password:</label> ${user.password}</td>
				<td><label>state:</label> ${user.state}</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>