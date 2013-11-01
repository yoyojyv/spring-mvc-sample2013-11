<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>

<% // 현재의 context path %>
<c:set var="CONTEXT_PATH" value="<%=request.getContextPath()%>" scope="request"/>

<script src="${CONTEXT_PATH}/resources/javascripts/jquery-1.10.1.min.js"></script>
<script type="text/javascript">

  $(function() {
    $("#deleteButton").click(function() {
      $("#boardForm").submit();
    });
  });

</script>



<p>
상세 페이지
</p>
${board}

<br/>

<form id="boardForm" method="post" action="${CONTEXT_PATH}/board/delete">
  <input type="hidden" value="${board.id}" name="id" />
  <input type="button" value="delete" id="deleteButton" />
</form>


