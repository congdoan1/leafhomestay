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
    <link href="<spring:url value="/resource/css/host.css"/>" type="text/css" rel="stylesheet">
    <%--    <link rel="stylesheet" href="<spring:url value='/resource/files/auth.css'/>">--%>
    <title><spring:message code="homestay.edit"/></title>
</head>
<body>
<div class="form-container">

    <%--@elvariable id="editHomestay" type="mum.edu.leafhomestay.domain.Homestay"--%>
    <form:form modelAttribute="editHomestay" action="${editHomestay.id}?${_csrf.parameterName}=${_csrf.token}" method="post" enctype="multipart/form-data">

        <fieldset>
            <legend><spring:message code="homestay.edit"/></legend>
            <div class="form-item">
                <label><spring:message code="homestay.title"/></label>
                <form:input type="text" id="title" path="title"/>
                <form:errors path="title" cssClass="form-error-message"/>
            </div>

            <div class="form-item">
                <label><spring:message code="homestay.homestayType"/></label>
                <form:select id="homestayType" path="homestayType"
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
                <form:select id="homestayType" path="bedType"
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
                <form:hidden path="coverImage"/>
                <form:input type="file" id="coverImageData" path="coverImageData"/>
                <form:errors path="coverImageData" cssClass="form-error-message"/>
            </div>

                <%--            <div class="form-item">--%>
                <%--                <label><spring:message code="homestay.amenity"/></label>--%>
                <%--                <c:forEach items="${amenityList}" var="item">--%>

                <%--                    <form:checkbox path="amenities" value="${item.id}" label="${item.name}"/> </c:forEach>--%>
                <%--            </div>--%>

            <div class="form-item">
                <label><spring:message code="homestay.price"/></label>
                <form:input type="number" id="price" path="price"/>
                <form:errors path="price" cssClass="form-error-message"/>
            </div>


            <div class="form-item">
                <form:hidden path="address.id"/>
                <label><spring:message code="address.country"/></label>
                <form:input type="text" id="country" path="address.country"/>
                <form:errors path="address.country" cssClass="form-error-message"/>
            </div>

            <div class="form-item">
                <label><spring:message code="address.state"/></label>
                <form:input type="text" id="state" path="address.state"/>
                <form:errors path="address.state" cssClass="form-error-message"/>
            </div>

            <div class="form-item">
                <label><spring:message code="address.city"/></label>
                <form:input type="text" id="state" path="address.city"/>
                <form:errors path="address.city" cssClass="form-error-message"/>
            </div>

            <div class="form-item">
                <label><spring:message code="address.street"/></label>
                <form:input type="text" id="country" path="address.street"/>
                <form:errors path="address.street" cssClass="form-error-message"/>
            </div>

            <div class="form-item">
                <label><spring:message code="address.zipCode"/></label>
                <form:input type="text" id="zipCode" path="address.zipCode"/>
                <form:errors path="address.zipCode" cssClass="form-error-message"/>
            </div>


            <div class="form-item submitBtn">
                <input type="submit" value='<spring:message code ="homestay.save"/>'>
            </div>


        </fieldset>
    </form:form>

</div>


</body>
</html>
