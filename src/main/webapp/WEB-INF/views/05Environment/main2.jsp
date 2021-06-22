<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="../resources/css/bootstrap.css"/>
<script src="../resources/jquery/jquery-3.6.0.js"></script>
	
<title>Insert title here</title>
</head>
<body>
<div class="container">
	<h2>XML 파일에 프로퍼티 파일을 명시한 후 외부파일 읽어오기</h2>
	<h3>메인 관리자 정보</h3>
	
	<ul>
		<li>아이디 : ${mainUserId }</li>
		<li>패스워드 : ${mainUserPw }</li>
	</ul>
	
	<h3>서브 관리자 정보</h3>
	
	<ul>
		<li>아이디 : ${subUserId }</li>
		<li>패스워드 : ${subUserPw }</li>
	</ul>
</div>
</body>
</html>