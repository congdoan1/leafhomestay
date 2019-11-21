<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Dell
  Date: 11/19/2019
  Time: 9:46 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link href="<spring:url value="/resource/css/host.css"/>" type="text/css" rel="stylesheet">
    <title>Title</title>
</head>
<body>
<div class="form-container">
    <div class="homestay-detail-title"><spring:message code="homestay.title"/></div>
    <div class="homestay-detail-item"> ${homestay.title}</div>

    <div class="homestay-detail-title"><spring:message code="homestay.homestayType"/></div>
    <div class="homestay-detail-item"> ${homestay.homestayType.name}</div>

    <div class="homestay-detail-title"><spring:message code="homestay.overview"/></div>
    <div class="homestay-detail-item"> ${homestay.overview}</div>

    <div class="homestay-detail-title"><spring:message code="homestay.numberOfRoom"/></div>
    <div class="homestay-detail-item"> ${homestay.numberOfRoom}</div>

    <div class="homestay-detail-title"><spring:message code="homestay.area"/></div>
    <div class="homestay-detail-item"> ${homestay.area}</div>

    <div class="homestay-detail-title"><spring:message code="homestay.bedType"/></div>
    <div class="homestay-detail-item"> ${homestay.bedType.name}</div>

    <div class="homestay-detail-title"><spring:message code="homestay.numberOfBed"/></div>
    <div class="homestay-detail-item"> ${homestay.numberOfBed}</div>

    <div class="homestay-detail-title"><spring:message code="homestay.numberOfBathroom"/></div>
    <div class="homestay-detail-item"> ${homestay.numberOfBathroom}</div>

    <div class="homestay-detail-title"><spring:message code="homestay.maximumGuest"/></div>
    <div class="homestay-detail-item"> ${homestay.maximumGuest}</div>


    <div class="homestay-detail-title"><spring:message code="homestay.price"/></div>
    <div class="homestay-detail-item"> ${homestay.price}</div>

    <div class="homestay-detail-title"><spring:message code="homestay.address.country"/></div>
    <div class="homestay-detail-item"> ${homestay.address.country}</div>

    <div class="homestay-detail-title"><spring:message code="homestay.address.state"/></div>
    <div class="homestay-detail-item"> ${homestay.address.state}</div>

    <div class="homestay-detail-title"><spring:message code="homestay.address.city"/></div>
    <div class="homestay-detail-item"> ${homestay.address.city}</div>

    <div class="homestay-detail-title"><spring:message code="homestay.address.street"/></div>
    <div class="homestay-detail-item"> ${homestay.address.street}</div>

    <div><a href="<spring:url value='/host'/>"> Dash board</a></div>
</div>

</body>
</html>
