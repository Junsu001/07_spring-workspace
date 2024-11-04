<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="contextPath" value="${pageContext.request.contextPath}" />  
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

 <!-- Bootstrap 사용을 위한 CDN -->
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.7.1/jquery.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/js/bootstrap.bundle.min.js"></script>
    <!-- ------------------------- -->
    <title>Document</title>
    <style>
        #reply_area tbody>tr>th:nth-child(1){width:120px}
    </style>
</head>
<body>

	 <div class="container p-3">

        <!-- Header, Nav start -->
        <jsp:include page="/WEB-INF/views/common/header.jsp"/>
        <!-- Header, Nav end -->
    
        <!-- Section start -->
        <section class="row m-3" style="min-height: 500px">
    
          <div class="container border p-5 m-4 rounded">
            <h2 class="m-4">게시글 상세</h2>
            <br>

            <a class="btn btn-secondary" style="float:right" href="${ contextPath }/notice/list.do">목록으로</a>
            <br><br>
            <table align="center" class="table">
                <tr>
                    <th width="120">제목</th>
                    <td colspan="3">${ n.noticeTitle }</td>
                </tr>
                <tr>
                    <th>작성자</th>
                    <td width="400">${ n.noticeWriter }</td>
                    <th width="120">작성일</th>
                    <td>${ n.registDt }</td>
                </tr>
                <tr>
                    <th>첨부파일</th>
                    <td colspan="3">
                     <c:forEach var="at" items="${ n.attachList }">
                        <a href="${contextPath}${ at.filePath }/${ at.filesystemName }" download="${ at.originalName }">${ at.originalName }</a>
                     		<br>
                     </c:forEach>
                    </td>
                </tr>
                <tr>
                    <th>내용</th>
                    <td colspan="3"></td>
                </tr>
                <tr>
                    <td colspan="4"><p style="height:150px">${ n.noticeContent }</p></td>
                </tr>
            </table>
            <br>

          
          </div>
    
        </section>
        <!-- Section end -->
    
        <!-- Footer start -->
         <jsp:include page="/WEB-INF/views/common/footer.jsp"/>
        <!-- Footer end -->
    
    </div>

</body>
</html>