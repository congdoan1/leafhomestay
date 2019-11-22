<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>

<link href="<spring:url value="/resource/css/booking.css"/>" type="text/css" rel="stylesheet">

<body>
<div class="list-homestay">
    <table>

        <c:forEach items="${bookings}" var="item">
            <div class="booking">
                <h4>Booking Id: ${item.id}</h4>
                <h4>Total Amount: ${item.totalPrice}</h4>
            </div>

        </c:forEach>

    </table>


</div>


</body>
</html>
