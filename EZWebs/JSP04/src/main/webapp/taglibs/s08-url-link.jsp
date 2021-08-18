<%@ page language="java" contentType="text/html; charset=UTF-8"
	import="java.util.*, members.*"
	isELIgnored="false"
    pageEncoding="UTF-8"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core" %>

<c:url var="memberurl" value="s08-member.jsp">
	<c:param name="mid" value="7070"/>
	<c:param name="mname" value="북두칠성"/>
	<c:param name="pwd" value="0707"/>
	<c:param name="email" value="7070@star.com"/>
</c:url> 

<%
	request.setCharacterEncoding("UTF-8");
%>


    
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Taglib - Redirect</title>
</head>
<body>
	<h1>커스텀 태그 - url</h1>
	<hr>
	<a href="${memberurl}">멤버조회</a>
</body>
</html>