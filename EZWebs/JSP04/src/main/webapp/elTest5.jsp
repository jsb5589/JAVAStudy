<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Expression Language</title>
</head>
<body>
	<h1>Expression Language</h1>
	<p>빈(empty) 연산 null이거나 문자열이 비어 있거나 존재하지 않는 변수이면 true</p>
	<hr>
	<p>
		빈연산자("hello"): ${empty "hello"} <br>
		빈연산자(hello): ${empty hello} <br>
		빈연산자(hello): ${!(empty hello)} <br>
		빈연산자(hello): ${not empty hello} <br>
		빈연산자(""): ${empty ""} <br>
		빈연산자(null): ${empty null} <br>
	</p>
</body>
</html>