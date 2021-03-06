<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html; charset=UTF-8" language="java"
pageEncoding="UTF-8"%>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
	<link rel="stylesheet" href="./resources/css/bootstrap.css"/>
	<script src="./resources/jquery/jquery-3.6.0.js"></script>
	<script src="./images/jquery/jquery-3.6.0.js"></script>
	<script type="text/javascript">
	$(function(){
		console.log('jQuery 실행됨');
	});
	
	</script>
</head>
<body>
<div class="container" >
	<h2 style="text-decoration: underline">스프링 MVC 시작하기</h2>

	<!-- 
		Spring MVC 에서는 이미자와 같은 리소스를 사용하기 위해 별도로
		resourses 폴더를 제공한다. 해당 폴더의 매핑은 servlet-context.xml
		에서 변경할 수 있다.
	 -->	
	<h3>resources 폴더 사용하기</h3>


	<img src="./4.png" alt="강아지" /><!-- 이미지 출력되지 않음 -->
	<!-- 
		원래의 폴더명은 resources 이나 아래와 같이 images와 같은
		이름으로 매핑명을 변경할 수 있다. 
	 -->
	<img src="./resources/4.png" alt="강아지" />
	<img src="./images/3.png" alt="뚱이" />
	
	<h3>첫번째 컨트롤러 만들기</h3>
	<ul>
		<li><a href="./home/helloSpring" target="_blank">첫번째 컨트롤러 바로가기
			</a></li>
	</ul>
	
	
	<!-- 컨트롤러 : FormController.java -->
	<h3>form값 처리하기</h3>
	<li>
		<a href="./form/servletRequest?id=kosmo&pw=1234"
			target="_blank">HttpServletReqeust로 폼 값 받기</a>
	</li>
	
	
	<li>
		<a href="./form/requestParam.do?id=kosmo&pw=1234
		&name=홍길동&email=hong@gildong.com" 
			target="_blank">@requestParam 어노테이션 폼값받기</a>
	</li>
	
	
	<li>
		<a href="./form/commandObjGet.do?id=kosmo&pw=1234
		&name=홍길동&email=hong@gildong.com" 
			target="_blank">커맨드(Command) 객체로 한번에 폼값받기</a>
	</li>
	
	
	
	<li>
		<a href="./form/gildong99/코스모" target="_blank">
			pathVariable 어노테이션으로 폼값 받기
		</a>
	</li>
	
	
	
	<!-- 컨트롤러 : RequestMappingController.java -->
	<h3>@RequestMapping 어노테이션 활용</h3>
	<li>
		<a href="./requestMapping/index.do" target="_blank">
		requestMapping 시작페이지 바로가기</a>
	</li>
	
	
	<!-- 컨트롤러 : ValidateController.java -->
	<h3>폼 데이터 검증하기 - Validator</h3>
	<li>
		<a href="validate/memberRegist.do" target="_blank">
		회원가입 바로가기</a>
	</li>
	
	
	<!-- 컨트롤러 : DIController.java -->
	<h3>DI(Dependency Injection) : 의존성 주입</h3>
	<li>
		<a href="di/mydi1.do" target="_blank">
		XML 설정 파일을 통한 빈 생성1(생성자와 setter)</a>
	</li>	
	<li>
		<a href="di/mydi2.do" target="_blank">
		XML 설정 파일을 통한 빈 생성2(다양한 멤버변수)</a>
	</li>
	<li>
		<a href="di/mydi3.do" target="_blank">
		어노테이션을 통한 빈 생성</a>
	</li>
	
	
	
	<!-- 컨트롤러 : EnvironmentController.java -->
	<h3>Environment 객체를 이용한 외부파일 참조하기</h3>
	<li>
		<a href="environment/main1" target="_blank">
		외부파일 참조하기 1 (Environment객체 사용)</a>
	</li>	
	<li>
		<a href="environment/main2" target="_blank">
		외부파일 참조하기 2 (XML설정파일 사용)</a>
	</li>
	<li>
		<a href="environment/main3" target="_blank">
		외부파일 참조하기 3 (어노테이션 사용)</a>
	</li>	



	<!-- 컨트롤러 : FileuploadController.java -->
	<h3>파일업로드</h3>
	<li>
		<a href="./fileUpload/uploadPath.do" target="_blank">
		upload폴더의 물리적 경로 확인하기</a>
	</li>
	<li>
		<a href="./fileUpload/uploadForm.do" target="_blank">
		파일업로드 폼</a>
	</li>
	<li>
		<a href="./fileUpload/uploadList.do" target="_blank">
		파일 목록 보기</a>
	</li>


	<!--  
		세 가지의 어노테이션을 통해 new 키워드없이 객체를
		생성하여 프로그래밍 할 수 있다.
	-->
	<h3>@Controller @Service, @Repository 어노테이션</h3>
	<h4>Auto scan으로 자동으로 생성되는 빈</h4>
	<li>
		<a href="./service/myService.do" target="_blank">myService 바로가기</a>
	</li>
	<li>
		<!--  
			resources 폴더에는 HTML파일을 생성 후 직접 실행할 수 있다.
		-->
		<a href="./resources/lottoForm.html" target="_blank">Lotto 바로가기</a>
	</li>






























</div>



</body>
</html>
