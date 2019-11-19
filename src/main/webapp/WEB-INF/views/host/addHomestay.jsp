<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Dell
  Date: 11/19/2019
  Time: 9:45 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <%--    <link rel="stylesheet" href="<spring:url value='/resource/files/auth.css'/>">--%>
    <title><spring:message code="homestay.pageTitle"/></title>
</head>
<body>
<div class="form-container">

    <form:form modelAttribute="homestay" action="addhomestay" method="post" enctype="multipart/form-data">
        <fieldset>
            <legend><spring:message code="homestay.pageTitle"/></legend>
            <div class="form-item">
                <label><spring:message code="homestay.title"/></label>
                <form:input type="text" id="title" path="title"/>
                <form:errors path="title" cssClass="form-error-message"/>
            </div>

            <div class="form-item">
                <label><spring:message code="homestay.homestayType"/></label>
                <form:select id="homestayType" path="homestayType.id"
                             items="${homestayTypeList}" itemValue="id" itemLabel="name"/>
                <form:errors path="homestayType" cssClass="form-error-message"/>
            </div>


            <div class="form-item">
                <label><spring:message code="homestay.overview"/></label>
                <form:input type="text" id="overview" path="overview"/>
                <form:errors path="overview" cssClass="form-error-message"/>
            </div>

            <div class="form-item">
                <label><spring:message code="homestay.numberOfRoom"/></label>
                <form:input type="number" id="numberOfRoom" path="numberOfRoom"/>
                <form:errors path="numberOfRoom" cssClass="form-error-message"/>
            </div>


            <div class="form-item">
                <label><spring:message code="homestay.area"/></label>
                <form:input type="number" id="area" path="area"/>
                <form:errors path="area" cssClass="form-error-message"/>
            </div>

            <div class="form-item">
                <label><spring:message code="homestay.bedType"/></label>
                <form:select id="homestayType" path="bedType.id"
                             items="${bedTypeList}" itemValue="id" itemLabel="name"/>
                <form:errors path="homestayType" cssClass="form-error-message"/>
            </div>


            <div class="form-item">
                <label><spring:message code="homestay.numberOfBed"/></label>
                <form:input type="number" id="numberofbed" path="numberOfBed"/>
                <form:errors path="numberOfBed" cssClass="form-error-message"/>
            </div>

            <div class="form-item">
                <label><spring:message code="homestay.numberOfBathroom"/></label>
                <form:input type="number" id="numberofbed" path="numberOfBathroom"/>
                <form:errors path="numberOfBathroom" cssClass="form-error-message"/>
            </div>

            <div class="form-item">
                <label><spring:message code="homestay.maximumGuest"/></label>
                <form:input type="number" id="maximumguest" path="maximumGuest"/>
                <form:errors path="maximumGuest" cssClass="form-error-message"/>
            </div>

            <div class="form-item">
                <label><spring:message code="homestay.coverImage"/></label>
                <form:input type="file" id="maximumguest" path="coverImage"/>
                <form:errors path="coverImage" cssClass="form-error-message"/>
            </div>

            <div class="form-item">
                <label><spring:message code="homestay.amenity"/></label>
                <c:forEach items="${amenityList}" var="item">

                    <form:checkbox path="amenities" value="${item}" label="${item.name}"/>
                </c:forEach>
                    <%--                <form:checkboxes path="amenities" items="amenityList" itemValue="id" itemLabel="name"/>--%>

            </div>

            <div class="form-item">
                <label><spring:message code="homestay.price"/></label>
                <form:input type="number" id="price" path="price"/>
                <form:errors path="price" cssClass="form-error-message"/>
            </div>

            <div class="form-item submitBtn">
                <input type="submit" value='<spring:message code ="homestay.save"/>'>
            </div>


        </fieldset>
    </form:form>

</div>


</body>
</html>
