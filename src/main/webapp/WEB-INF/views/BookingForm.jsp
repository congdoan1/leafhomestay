<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<!DOCTYPE HTML>
<html>

<link href='<spring:url value="/resource/css/BookingForm.css"/>' rel="stylesheet" type="text/css">

<body>
<div id="global">
    <form:form modelAttribute="booking" action="booking" method="post">

        <fieldset>
            <legend>Booking Form</legend>
            <form:errors path="*" cssStyle="color : red;"/>

            <p><spring:message code="homestay"/> <span>${booking.homestay.title}</span></p>

            <p><spring:message code="checkInDate"/> <form:input type="date" path="checkInDate"
                                                                cssClass="form-control"/></p>
            <form:errors path="checkInDate" cssStyle="color : red;"/>

            <p><spring:message code="checkOutDate"/> <form:input type="date" path="checkOutDate"
                                                                 cssClass="form-control"/></p>
            <form:errors path="checkOutDate" cssStyle="color : red;"/>

            <p><spring:message code="price"/> $${booking.homestay.price} / night</p>

            <p id="buttons">
                <input id="submit" type="submit" value="Book">
            </p>
        </fieldset>
    </form:form>
</div>
</body>
</html> 