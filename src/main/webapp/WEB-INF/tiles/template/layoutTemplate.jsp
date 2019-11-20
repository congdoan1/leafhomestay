<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <c:set var="title"><tiles:getAsString name="title"/></c:set>
    <title><spring:message code="${title}"/></title>
    <link href="<spring:url value="/resource/css/main.css"/>" rel="stylesheet" type="text/css">
</head>
<body>
<div>
    <div>
        <tiles:insertAttribute name="header"/>
    </div>

    <div>
        <tiles:insertAttribute name="body"/>
    </div>

    <div>
        <tiles:insertAttribute name="footer"/>
    </div>
</div>
</body>
</html>
