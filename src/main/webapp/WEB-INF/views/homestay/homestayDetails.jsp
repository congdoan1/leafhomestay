<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>

<link href="<spring:url value="/resource/css/homestay-details.css"/>" type="text/css" rel="stylesheet">

<body>
<div class="cover">
    <img src="<spring:url value="/resource/images/${homestay.coverImage}"/>" alt="cover">
</div>
<div class="content">
    <div id="information">
        <div>
            <h2>${homestay.title}</h2>
            <c:if test="${not empty homestay.address}">
                <p class="address">
                        ${homestay.address.street}, ${homestay.address.city}, ${homestay.address.state} ${homestay.address.zipCode}
                </p>
            </c:if>
            <p class="type">${homestay.homestayType.name}</p>
            <p id="overview">${homestay.overview}</p>
        </div>

        <div>
            <h3>Amenities</h3>
            <p>Amenities and services at the accommodation</p>
        </div>
    </div>
    <div id="booking-container">
        <h3>$${homestay.price} / night</h3>
        <div class="form">
            <div class="form-inside">
                <spring:url value="/homestays/${homestay.id}/booking" var="bookinbg_url"/>
                <form:form modelAttribute="booking" action="${bookinbg_url}" method="get">
                    <div>
                        <label for="dateFrom">Checkin Date</label><br>
                        <form:input id="dateFrom" class="form-control date" path="checkInDate" type="date"/>
                        <label for="dateTo">Checkout Date</label><br>
                        <form:input id="dateTo" class="form-control  date" path="checkOutDate" type="date"/>
                    </div>
<%--                    <form:input id="numberOfGuest" class="form-control number-of-guest" path="numberOfGuest" type="text"/>--%>
                    <div>
                        <input type="submit" value="Book Now" class="button">
                    </div>

                    <div class="host">
                        <h3>${homestay.owner.firstName} ${homestay.owner.lastName}</h3>
                    </div>
                </form:form>
            </div>
        </div>
    </div>
</div>
</body>
</html>
