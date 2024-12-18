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
    <style>
   
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
            <h2 class="m-4">공지사항 목록</h2>
            <br>

						<c:if test="${ not empty loginUser && loginUser.status eq 'A'}">
            <!-- 로그인후 상태일 경우만 보여지는 글쓰기 버튼-->
            <a class="btn btn-secondary" style="float:right" href="${ contextPath }/notice/regist.do">글쓰기</a>
            <br>
            </c:if>
            <br>
            <table id="noticeList" class="table table-hover" align="center">
                <thead>
                  <tr>
                    <th width="100px">번호</th>
                    <th width="400px">제목</th>
                    <th width="120px">작성자</th>
                    <th>작성일</th>
                  </tr>
                </thead>
                <tbody>
                	<c:choose>
                		<c:when test="${ empty list }">
                			<tr>
                				<td colspan="6">조회된 게시글이 없습니다.</td>
                				
                			</tr>
                		</c:when>
                		<c:otherwise>
                			<c:forEach var="n" items="${ list }">
			                    <tr onclick='location.href="${contextPath}/notice/detail.do?no=${ n.noticeNo }";'>
			                        <td>${ n.noticeNo }</td>
			                        <td>${ n.noticeTitle }</td>
			                        <td>${ n.noticeWriter }</td>
			                        <td>${ n.registDt }</td>
			                        
			                    </tr>
		                   </c:forEach>
                    </c:otherwise>
                   </c:choose>
                </tbody>
            </table>
            <br>

            <ul id="paging_area" class="pagination d-flex justify-content-center"> <!-- 이전버튼 -->
               
                <li class="page-item ${ pi.currentPage == 1 ? 'disabled' : '' }">
               		 <a class="page-link" href="${ contextPath }/notice/list.do?page=${pi.currentPage-1}">Previous</a>
                </li>
                
               <c:forEach var="p" begin="${ pi.startPage }" end="${ pi.endPage }"> <!-- 페이지 번호 생성 -->
		             <li class="page-item ${ pi.currentPage == p ? 'active' : '' }">
		                <a class="page-link" href="${ contextPath }/notice/list.do?page=${p}">${ p }</a>
		             </li>
          		 </c:forEach>

                
                <li class="page-item ${ pi.currentPage == pi.maxPage ? 'disabled' : '' }"> <!--  다음버튼 -->
                	<a class="page-link" href="${ contextPath }/notice/list.do?page=${pi.currentPage+1}">Next</a>
                </li>
            </ul>
           
            <br clear="both"><br>
            

          </div>
    
        </section>
        <!-- Section end -->
    
        <!-- Footer start -->
        <jsp:include page="/WEB-INF/views/common/footer.jsp"/>
        <!-- Footer end -->
    
    </div>





</body>
</html>