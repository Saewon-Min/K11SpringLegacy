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
    <h2>파일업로드 폼</h2>
    
    <!-- 첨부파일을 업로드 할 경우 method는 무조건 post로 해야한다
    get으로 지정할 경우 파일이 아닌 파일명만 전달된다. -->
    <form name="fileFrm" method="post" action="uploadAction.do" 
               enctype="multipart/form-data">
   	 
    <table class="table table-bordered" style="width:500px;">
   	 <colgroup>
   		 <col width="20%" />
   		 <col width="*" />   		 
   	 </colgroup>
   	 <tr>
   		 <th>제목</th>
   		 <td>
   			 <input type="text" name="title"
   				 value="제목입니다." />
   		 </td>   		 
   	 </tr>
   	 <tr>
   		 <th>첨부파일1</th>
   		 <td>
   			 <input type="file" name="userfile1" />
   		 </td>   		 
   	 </tr>
   	 <tr>
   		 <th>첨부파일2</th>
   		 <td>
   			 <input type="file" name="userfile2" />
   		 </td>   		 
   	 </tr>
   	 <tr>
   		 <td colspan="2" style="text-align:center;">
   			 <button type="submit" class="btn btn-danger">파일업로드</button>
   		 </td>   		 
   	 </tr>
    </table>
    </form>
</div>
</body>


</html>