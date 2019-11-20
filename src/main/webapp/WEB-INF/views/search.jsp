<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>

<link href="<spring:url value="/resource/css/search.css"/>" type="text/css" rel="stylesheet">

<body>
<div id="content">
    <c:forEach items="${homestays}" var="homestay">
        <c:set var="url" value="/homestays/${homestay.id}"/>
        <a href="<spring:url value="${url}"/>">
            <div class="homestay">
                <img src="${homestay.coverImage}" alt="home">
                <div class="detail">
                    <h4>${homestay.title}</h4>
                    <span>${homestay.overview}</span>
                </div>
            </div>
        </a>
    </c:forEach>
</div>
</body>
</html>