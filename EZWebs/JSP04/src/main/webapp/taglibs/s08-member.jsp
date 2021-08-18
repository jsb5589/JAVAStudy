<%@ page language="java" contentType="text/html; charset=UTF-8"
	import="java.util.*, members.*"
	isELIgnored="false"
    pageEncoding="UTF-8"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core" %>

<%
	request.setCharacterEncoding("UTF-8");
%>

    
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Taglib - 멤버조회</title>
</head>
<body>
	<h1>커스텀 태그 라이브러리</h1>
	<p>멤버 조회</p>
	<p>이동경로: url-link.jsp -> member.jsp </p>
	<hr>
	<table border="1" align="center">
		<tr align="center" bgcolor="lightblue">
			<td width="8%"><b>아이디</b></td>
			<td width="10%"><b>이름</b></td>
			<td width="10%"><b>비밀번호</b></td>
			<td width="20%"><b>전자메일</b></td>
		</tr>
<c:choose>	
<c:when test="${empty param.mid}">
		<tr align="center">
			<td colspan="4">아이디가 없습니다.</td>
		</tr>
</c:when>
<c:otherwise>
		<tr align="center">
			<td><c:out value="${param.mid}"/></td>
			<td><c:out value="${param.mname}"/></td>
			<td><c:out value="${param.pwd}"/></td>
			<td><c:out value="${param.email}"/></td>
		</tr>
</c:otherwise>		
</c:choose>
	</table>
</body>
</html>