<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>/views/home.jsp</title>
</head>
<body>
	<div class="containet">
		<h1>�ε��� ������ �Դϴ�.</h1>
		<ul>
			<li><a href="/hello/fortune">������ � </a></li>
		</ul>
		<h2>��������</h2>
		<ul>
		
			<c:forEach var="tmp" items="${requestScope.noticeList }">
				<li>${tmp }</li>
			</c:forEach>
		</ul>
	</div>
</body>	
</html>