<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Dell
  Date: 11/19/2019
  Time: 9:50 AM
  To change this template use File | Settings | File Templates.
--%>
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

        <c:forEach items="${homestayList}" var="item">
            <tr>
                <td>
                    <div class="image">
                        <img src="<spring:url value="/resource/images/${item.coverImage}" />"
                             alt="home stay image"/></div>
                    <div class="detail">
                        <h3> ${item.title}</h3>

                        <div><a href="<spring:url value='/host/edit/${item.id}'/>"> Edit</a></div>

                    </div>
                </td>
            </tr>

        </c:forEach>

    </table>


</div>


</body>
</html>
