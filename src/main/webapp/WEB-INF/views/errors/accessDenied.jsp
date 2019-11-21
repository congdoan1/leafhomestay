<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" isErrorPage="true" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<% response.setStatus(403); %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<html>

<body>
<center>
    <img src="<spring:url value="/resource/images/access-denied.png"  htmlEscape="true" />" alt="You"  />

    <H2>${requestScope['javax.servlet.error.message']}</H2>

    <p><button type="button" onclick="location.href='<spring:url value="/home" />'">Home</button></p>
</center>
</body>
</html>