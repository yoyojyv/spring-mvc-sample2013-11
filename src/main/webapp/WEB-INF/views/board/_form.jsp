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
    $("#saveButton").click(function() {
      $("#boardForm").submit();
    });
  });

</script>

<sf:form action="${CONTEXT_PATH}/board/save" commandName="board" id="boardForm">

  <sf:hidden path="id" />
  subject: <sf:input path="subject" /> <br/>
  contents: <sf:input path="contents" /> <br/>

  <input type="button" value="save" id="saveButton" />

</sf:form>