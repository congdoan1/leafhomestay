<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<!DOCTYPE HTML>
<html>

<body>
<div id="global">
    <form:form modelAttribute="payment" action="paymentform" method="post">
        <fieldset>
            <legend>Payment</legend>

            <form:errors path="*" cssStyle="color : red;"/>

            <p><spring:message code="bookingId"/> <form:input path="booking.id" readonly="true"/></p>

            <p><spring:message code="totalAmount"/> <form:input path="totalAmount" readonly="true"/></p>

            <p><spring:message code="paymentDate"/> <form:input type="date" path="date" readonly="true"/></p>
            <form:errors path="paymentDate" cssStyle="color : red;"/>

            Payment Type?
            <input type="radio" name="paymentType" value="1"/>Visa
            <input type="radio" name="paymentType" value="2"/>Master-Card
            <input type="radio" name="paymentType" value="3"/>PayPal

            </p>
            <p>
                Card Number:<input type="text" name="cardNumber" required
                                   placeholder="**** **** **** ****"/>
            <p> expire Date:<input type="date" name="expireDate" required pattern="yyyy/mm/dd"
                                   placeholder="yyyy/mm/dd"/>
                security Code:<input type="text" name="sCode" required
                />
            </p>
            </p>
            <p id="buttons">
                <input id="submit" type="submit" value="submit">
            </p>
        </fieldset>
    </form:form>
</div>
</body>
</html>