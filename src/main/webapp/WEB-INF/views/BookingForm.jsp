<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %> 
<!DOCTYPE HTML>
<html >
<head>
<link href='<spring:url value="/resource/css/BookingForm.css"/>' rel="stylesheet" type="text/css">

<title>Booking Form</title>



</head>
<body>
<%--   <img alt="this a image"  src='<spring:url value="/resource/images/leaf_image.jpg"/>'/>
 --%><div id="global">
<form:form modelAttribute="book" action="Book_form" method="post" >
     
        <h3>Booking Form </h3>
        <form:errors path="*" cssStyle="color : red;" /> 
        
  		<p>ID: <input type="number" name="id"/></p>
  		
  		
  		<p><spring:message code="user.userId"/>
					<input type="text" name="user.userd" />
				</p>
				<form:errors path="user.userd" cssStyle="color : red;" /> 
				
				<p><spring:message code="booking.Id"/>
					<input type="text" name="booking.Id" />
				</p>
				<form:errors path="booking.Id" cssStyle="color : red;" />
				
  		<p><spring:message code="checkInDate"/>
  		<input type="date" name="checkInDate"/></p>
  		<form:errors path="checkInDate" cssStyle="color : red;" />
  		
  		<p><spring:message code="checkOutDate"/>
  		 <input type="date" name="checkOutDate"/></p>
  		 <form:errors path="checkOutDate" cssStyle="color : red;" />
  		 
  		<p><spring:message code="totalPrice"/>
  		 <input type="number" name="totalPrice"/></p>
  		 <form:errors path="totalPrice" cssStyle="color : red;" />
  		 
  		 <p><spring:message code="homestay.Id"/>
  		 <input type="text" name="homestay.Id"/></p>
  		 <form:errors path="homestay.Id" cssStyle="color : red;" />
  		 
  		 <p><spring:message code="payment"/>
  		 <input type="number" name="payment"/></p>
  		<form:errors path="payment" cssStyle="color : red;" />
		
        <p id="buttons">
            <input id="submit" type="submit"   value="submit">
        </p>
   
</form:form>
</div>
</body>
</html> 