<%@ page language="java" contentType="text/html; charset=UTF-8"
	import="java.util.*"
	isELIgnored="false"
    pageEncoding="UTF-8"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core" %>

<%
	List listx = new ArrayList();
	listx.add("hello");
	listx.add("world");
	listx.add("Welcome!");
%>    

<c:set var="lists" value="<%=listx%>" />
    
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Taglib - jstl</title>
</head>
<body>
	<h1>커스텀 태그 라이브러리</h1>
	<p> 반복문(forEach) </p>
	<hr>
	<c:forEach var="data" items="${lists}" varStatus="loop">
		<p>[${data}]: index(${loop.index}), count(${loop.count}), first(${loop.first}), last(${loop.last})</p>
	</c:forEach>
</body>
</html>