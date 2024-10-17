<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="contextPath" value="${pageContext.request.contextPath}"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

		<h3>공지사항 수정 페이지</h3>
	
	<form action="${ contextPath }/notice/update.do" method="post">
	
		제목 : <input type="text" name="title" value="${ notice.title }"> <br>
		내용 : <input type="text" name="content" value="${ notice.content }"> <br>
		
		<input type="hidden" name="no" value="${ notice.no }">
		<button type="submit">수정</button>
	</form>
	
</body>
</html>