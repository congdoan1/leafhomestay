<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%--
  Created by IntelliJ IDEA.
  User: Dell
  Date: 11/20/2019
  Time: 4:49 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Error</title>
</head>
<body>


<img src="<spring:url value="/resource/images/logo.png"  htmlEscape="true" />" alt="Page not found  JSP!!!"  />

<H2 class="form-error">${errorMessage}</H2>
<H3> ${url}</h3>


</body>
</html>
