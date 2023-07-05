<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>

<!-- 
	매퍼 → DAO → Service → Controller 순서로 작업되었고, 다음은 JSP입니다.
	회원기능은 모두 member폴더에 통합하여 보관하며, 회원가입용 페이지인 signup.jsp를 작성합니다.
	모든 jsp파일을 하나하나 입력하지말고 home.jsp를 복사한 뒤 <div id="container_box"> ~ </div> 내부만 수정하는 방식으로 합니다.
	이런식으로 모든 페이지가 똑같이 구성되어있다면 추가/편집이 용이하기 때문에 매우 편리합니다. 더 나아가서 타일즈(tiles)를 이용하는 방법도 있는데, 타일즈는 나중에 사용하겠습니다.
 -->
<html>
<head>
	<title>/views/member/signup.jsp</title>
</head>
<body>
	<section id="container">
		<div id="container_box">	
			<section id="content">
				<form role="form" method="post" autocomplete="off">
					<div class="input_area">
			     		<label for="userId">아이디</label>
			     		<input type="email" id="userId" name="userId" placeholder="example@email.com" required="required" />        
			    	</div>
			    
			    	<div class="input_area">
			     		<label for="userPass">패스워드</label>
			     		<input type="password" id="userPass" name="userPass" required="required" /> <!-- required 필수입력 -->
			     	</div>
				    
				    <div class="input_area">
				     	<label for="userName">닉네임</label>
				     	<input type="text" id="userName" name="userName" placeholder="닉네임을 입력해주세요" required="required" />        
				    </div>
				    
				    <div class="input_area">
				     	<label for="userPhon">연락처</label>
				     	<input type="text" id="userPhon" name="userPhon" placeholder="연락처를 입력해주세요" required="required" />        
				    </div>
				    
				    <button type="submit" id="signup_btn" name="signup_btn">회원가입</button>
			    
			   </form>     
			</section>
		</div>
	</section>
</body>
</html>
