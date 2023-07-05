<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>/views/test/fortune.jsp</title>
</head>
<body>
	<div class="container">
		<p>
			오늘의 운세 : <strong>${fortuneToday }</strong>
			<a href="/hello/">인덱스로 가기</a>
		</p>
	</div>
</body>
</html>