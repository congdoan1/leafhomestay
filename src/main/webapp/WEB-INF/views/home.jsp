<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags" %>

<html>

<link href="<spring:url value="/resource/css/home.css"/>" type="text/css" rel="stylesheet">

<body>
<header id="header-wrapper">
    <div id="header" class="container">
        <div id="logo">
            <h1><a href="<spring:url value="/home" />">
                <img src="<spring:url value="/resource/images/logo.png"/>" alt="Leaf Homestay Logo">
            </a></h1>
        </div>
        <div id="menu">
            <ul>
                <security:authorize access="isAuthenticated()">
                    <security:authorize access="hasRole('ROLE_HOST')">
                        <li><a href="<spring:url value="/host/homestays" />"><spring:message code="navigation.homestays"/></a>
                        </li>
                        <li><a href="<spring:url value="/host/booking" />"><spring:message
                                code="navigation.booking"/></a></li>
                    </security:authorize>
                    <security:authorize access="hasRole('ROLE_GUEST')">
                        <li><a href="<spring:url value="/homestays/wishlist" />"><spring:message
                                code="navigation.wishlist"/></a></li>
                        <li><a href="<spring:url value="/booking" />"><spring:message code="navigation.booking"/></a>
                        </li>
                    </security:authorize>
                    <li><a href="<spring:url value="#" />"><security:authentication property="principal.username"/></a>
                    </li>
                    <li>
                        <spring:url value="/logout" var="logout_url" />
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
    <div id="search-container" class="container">
        <div class="title">
            <h2>Leaf Homestay</h2>
        </div>
        <div class="form">
            <div class="form-inside">
                <h3>Book a room in a home</h3>
                <form action="search" method="get">
                    <div>
                        <input class="form-control" name="location"
                               placeholder="Where do you want to go?" type="text" id="search_location"
                               required/>
                    </div>
                    <div class="date-control">
                        <input class="form-control date" name="dateFrom"
                               placeholder="From" type="date" required/>
                        <input class="form-control date" name="dateTo"
                               placeholder="To" type="date" required/>
                        <select class="form-control number-of-guest" name="numberOfGuest">
                            <c:forEach items="${[1,2,3,4,5,6,7]}" var="item">
                                <option value="${item}">${item}</option>
                            </c:forEach>
                        </select>
                    </div>
                    <div>
                        <input type="submit" class="button" value="Search"/>
                    </div>
                </form>
            </div>
        </div>
    </div>
</header>
</body>
</html>
