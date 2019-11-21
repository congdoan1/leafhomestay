<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<!DOCTYPE HTML>
<html>

<body>
<div id="global">
    <fieldset>
        <legend>Payment Success</legend>
        <h3>You are successfully paid! <br>
            Thank  you for using our website.
              </h3>
        <p><spring:message code="bookingId"/> ${payment.booking.id}</p>

        <p><spring:message code="totalAmount"/> ${payment.totalAmount}</p>

        <p><spring:message code="paymentDate"/> ${payment.paymentDate}</p>
        Payment Type: <c:choose>
        <c:when test="${payment.paymentType == 1}">Visa</c:when>
        <c:when test="${payment.paymentType == 2}">Master</c:when>
        <c:when test="${payment.paymentType == 3}">Paypal</c:when>
        <c:otherwise>No</c:otherwise>
    </c:choose>

        <div><a href="<spring:url value='/booking'/>">Go to booking</a></div>
    </fieldset>
</div>
</body>
</html>