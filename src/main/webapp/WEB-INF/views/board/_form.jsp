<sf:form action="${CONTEXT_PATH}/board/save" commandName="board">

  <sf:hidden path="id" />
  subject: <sf:input path="subject" /> <br/>
  contents: <sf:input path="contents" /> <br/>

  <input type="submit" value="save" />

</sf:form>