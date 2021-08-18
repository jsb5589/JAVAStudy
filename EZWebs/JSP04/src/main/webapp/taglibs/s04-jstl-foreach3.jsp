<%@ page language="java" contentType="text/html; charset=UTF-8"
	import="java.util.*, members.*"
	isELIgnored="false"
    pageEncoding="UTF-8"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core" %>

<%
	List memberx = new ArrayList();
	MemberVO m1 = new MemberVO("1000", "일인자", "1234", "1000@ez.co.kr");
	MemberVO m2 = new MemberVO("2000", "이인자", "2222", "2000@ez.co.kr");
	MemberVO m3 = new MemberVO("3000", "사오정", "3333", "3000@ez.co.kr");
	MemberVO m4 = new MemberVO("4000", "오징어", "4444", "400@ez.co.kr");
	memberx.add(m1);
	memberx.add(m2);
	memberx.add(m3);
	memberx.add(m4);
%>

<c:set var="members" value="<%=memberx%>" />
    
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Taglib - jstl</title>
</head>
<body>
	<h1>커스텀 태그 라이브러리</h1>
	<p>반복문(forEach) - ArrayList 사용 </p>
	<p>배열 객체를 만든 후 set으로 값을 세팅 후 참조를 해야한다. </p>
	<p>forEach의 items에서 하나씩 꺼내서 member 변수에 대입 </p>
	<hr>
	<table border="1" align="center">
		<tr align="center" bgcolor="lightblue">
			<td width="8%"><b>아이디</b></td>
			<td width="10%"><b>이름</b></td>
			<td width="10%"><b>비밀번호</b></td>
			<td width="20%"><b>전자메일</b></td>
		</tr>
		<!-- items는 배열에서 하나씩 꺼내서 member 변수에 대입 -->
		<c:forEach var="member" items="${members}" >
			<tr align="center">
				<td>${member.mid}</td>
				<td>${member.pwd}</td>
				<td>${member.mname}</td>
				<td>${member.email}</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>