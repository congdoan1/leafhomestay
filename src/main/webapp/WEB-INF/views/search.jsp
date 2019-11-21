<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>

<link href="<spring:url value="/resource/css/search.css"/>" type="text/css" rel="stylesheet">

<body>
<div id="content">
    <div>
        <span id="number-of-nights">${numberOfNights} night${numberOfNights > 1 ? 's' : ''}</span>
    </div>
    <c:forEach items="${homestays}" var="homestay">
        <c:set var="url" value="/homestays/${homestay.id}"/>
        <a href="<spring:url value="${url}"/>">
            <div class="homestay">
                <img src="<spring:url value="/resource/images/${homestay.coverImage}" />" alt="home">
                <div class="detail">
                    <h4>${homestay.title}</h4>
                    <span>${homestay.overview}</span>
                    <div class="bottom">
                        <span class="host">${homestay.owner.firstName} ${homestay.owner.lastName}</span>
                        <span class="price">$${homestay.price} / night</span>
                    </div>
                </div>
            </div>
        </a>
    </c:forEach>
    <c:if test="${empty homestays}">
        <h4 class="empty"><spring:message code="noRecords"/></h4>
    </c:if>
</div>
</body>
</html>