<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>


<% // 현재의 context path %>
<c:set var="CONTEXT_PATH" value="<%=request.getContextPath()%>" scope="request"/>

<p>
리스트 페이지
</p>

<ul>

  <c:if test="${empty boardList}">
  <li>리스트 없음</li>
  </c:if>

  <c:forEach items="${boardList}" var="board">
  <li>
    ${board.id} | ${board.subject} | ${board.contents}
  </li>
  </c:forEach>



</ul>