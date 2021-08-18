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
	<p> 토큰 반복문(forTokens) </p>
	<hr>
	<c:set var="lists" value="hello, world, hi, welcome" />
	<c:forTokens var="token" items="${lists}" delims=",">
		<p>${token}</p>
	</c:forTokens>
</body>
</html>