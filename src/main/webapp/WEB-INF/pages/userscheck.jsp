<%@ taglib prefix="spring" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <title>Title</title>
    </head>
    <body>
        <spring:form modelAttribute="userFromServer" method="post" action="/form/users/check">
            login:<spring:input path="login"/><br/>
            password:<spring:input path="password"/><br/>
            <spring:button>validate</spring:button>
        </spring:form>
    </body>
</html>