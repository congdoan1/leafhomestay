<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>

<link href="<spring:url value="/resource/css/host.css"/>" type="text/css" rel="stylesheet">

<body>
<div>
    <form action="<spring:url value='/host/add'/>" method="get">
        <input type="submit" class="button" value="<spring:message code="addHomestay.button.title"/>">
    </form>
</div>

<div class="list-homestay">
    <table>

        <c:forEach items="${bookings}" var="item">
            <tr>
                <td>
                    <div class="detail">
                        <h3>Booking Id: ${item.id}</h3>
                        <h3>Total Amount: ${item.totalPrice}</h3>
                    </div>
                </td>
            </tr>

        </c:forEach>

    </table>


</div>


</body>
</html>
