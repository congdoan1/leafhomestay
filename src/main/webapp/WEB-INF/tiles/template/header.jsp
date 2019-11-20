<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags" %>

<link href="<spring:url value="/resource/css/header.css"/>" rel="stylesheet" type="text/css">

<header id="header-wrapper">
    <div id="header" class="container">
        <div id="logo">
            <h1><a href="<spring:url value="/home" />">
                <img src="<spring:url value="/resource/images/logo.png" />" alt="Leaf Homestay Logo">
            </a></h1>
        </div>
        <div id="menu">
            <ul>
                <security:authorize access="isAuthenticated()">
                    <li><a href="<spring:url value="/homestays/wishlist" />"><spring:message code="navigation.wishlist"/></a></li>
                    <li><a href="<spring:url value="#" />"><security:authentication property="principal.username"/></a>
                    </li>
                </security:authorize>
                <security:authorize access="isAnonymous()">
                    <li><a href="<spring:url value="/home" />"><spring:message code="navigation.host"/></a></li>
                    <li><a href="<spring:url value="/signup" />"><spring:message code="navigation.signup"/></a>
                    </li>
                    <li><a href="<spring:url value="/login" />"><spring:message code="navigation.signin"/></a></li>
                </security:authorize>
            </ul>
        </div>
    </div>
</header>
