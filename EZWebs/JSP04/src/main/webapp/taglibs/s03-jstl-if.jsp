<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core" %>

<%
	request.setCharacterEncoding("UTF-8");
%>

<c:set var="idx" value="1234" scope="page" />
<c:set var="name" value="${'홍길동'}" scope="page" />
<c:set var="age" value="${30}" scope="page" />
    
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Taglib - jstl</title>
</head>
<body>
	<h1>커스텀 태그 라이브러리</h1>
	<p> 조건식(if) </p>
	<hr>
	<c:if test="${not empty id}">
		<p>id: ${id}</p>
	</c:if>
	<c:if test="${age > 19}">
		<p>${name}은 성인입니다</p>
		<p>age: ${age}</p>
	</c:if>
</body>
</html>