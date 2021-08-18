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
	<title>Taglib - Redirect</title>
</head>
<body>

<c:redirect url="s07-member.jsp">
	<c:param name="mid" value="${param.mid}"/>
	<c:param name="mname" value="${param.mname}"/>
	<c:param name="pwd" value="${param.pwd}"/>
	<c:param name="email" value="${param.email}"/>
</c:redirect>

</body>
</html>