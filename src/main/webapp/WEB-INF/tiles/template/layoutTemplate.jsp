<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <c:set var="title"><tiles:getAsString name="title"/></c:set>
    <title><spring:message code="${title}"/></title>
    <style type="text/css">@import url("<spring:url value="/resource/css/main.css"/>");</style>
</head>
<body>
<div>
    <header id="header-wrapper">
        <div id="header" class="container">
            <div id="logo">
                <h1><a href="<spring:url value="/home" />">
                    <img src="<spring:url value="/resource/images/logo.png" />" alt="Leaf Homestay Logo">
                </a></h1>
            </div>
            <div id="menu">
                <ul>
                    <tiles:insertAttribute name="navigation"/>
                </ul>
            </div>
        </div>
        <div id="search" class="container">
            <div class="title">
                <h2>Leaf Homestay</h2>
            </div>
            <div class="form">
                <div class="form-inside">
                    <h4>Book a room in a home</h4>
                    <form>
                        <input class="form-control" name="location"
                               placeholder="Where do you want to go?" type="text" id="search_location"
                               autocomplete="off">
                        <div class="date-control">
                            <input class="form-control date" name="dateFrom"
                                   placeholder="From" type="text" id="date-from">
                            <input class="form-control date" name="dateTo"
                                   placeholder="To" type="text" id="date-to">
                            <input class="form-control number-of-guest" name="numberOfGuest"
                                   type="text" id="number-of-guest">
                        </div>
                    </form>
                </div>
            </div>
        </div>
    </header>

    <%--    <div>--%>
    <%--        <h1>--%>
    <%--            <c:set var="heading"><tiles:getAsString name="heading"/></c:set>--%>
    <%--            <spring:message code="${heading}"/>--%>
    <%--        </h1>--%>
    <%--    </div>--%>

    <div>
        <tiles:insertAttribute name="body"/>
    </div>

    <div>
        <tiles:insertAttribute name="footer"/>
    </div>
</div>
</body>
</html>
