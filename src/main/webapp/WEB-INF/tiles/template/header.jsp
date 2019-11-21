<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

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
                <li><a href="<spring:url value="?language=en" />"><spring:message
                        code="language.en"/></a>
                </li>
                <li><a href="<spring:url value="?language=vi" />"><spring:message
                        code="language.vi"/></a></li>
                <security:authorize access="isAuthenticated()">
                    <security:authorize access="hasRole('ROLE_HOST')">
                        <li><a href="<spring:url value="/host/homestays" />"><spring:message
                                code="navigation.homestays"/></a>
                        </li>
                        <li><a href="<spring:url value="/#" />"><spring:message
                                code="navigation.booking"/></a></li>
                    </security:authorize>
                    <security:authorize access="hasRole('ROLE_GUEST')">
                        <li><a href="<spring:url value="/homestays/wishlist" />"><spring:message
                                code="navigation.wishlist"/></a></li>
                        <li><a href="<spring:url value="/#" />"><spring:message code="navigation.booking"/></a>
                        </li>
                    </security:authorize>
                    <li><a href="<spring:url value="#" />"><security:authentication property="principal.username"/></a>
                    </li>
                    <li>
                        <spring:url value="/logout" var="logout_url"/>
                        <form:form action="${logout_url}" method="post">
                            <input type="submit" value="Logout">
                        </form:form>
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
