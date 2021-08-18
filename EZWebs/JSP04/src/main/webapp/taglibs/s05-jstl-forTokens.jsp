<%@ page language="java" contentType="text/html; charset=UTF-8"
	import="java.util.*"
	isELIgnored="false"
    pageEncoding="UTF-8"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core" %>
    
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
	<c:forEach var="cnt" begin="0" end="10" step="1" varStatus="loop">
		<p>cnt(${cnt}): index(${loop.index}), count(${loop.count}), first(${loop.first}), last(${loop.last})</p>
	</c:forEach>
</body>
</html>