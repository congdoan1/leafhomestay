<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %> 
<!DOCTYPE HTML>
<html >
<head>
<title>Payment Form</title>

</head>
<body>
<h3> Payment Information</h3>
<div id="global">
<form:form modelAttribute="payment" action="paymentform" method="post" >
    <fieldset>
        <legend>Payment </legend>
  		<p>ID: <input type="number" name="id"/></p>
  		
  		
  		<p><spring:message code="totalAmount"/>
					<input type="text" name="totalAmount" />
				</p>
				<form:errors path="totalAmount" cssStyle="color : red;" /> 
				
				
  		<p><spring:message code="paymentDate"/>
  		<input type="date" name="paymentDate"/></p>
  		<form:errors path="paymentDate" cssStyle="color : red;" />
  		
  		
  		<p><spring:message code="paymentType"/>
  		  <!-- <input type="radio" name="gender" value="Cash"> Cash:
            <input type="radio" name="gender" value="Card"> Card: -->
  		 <form:errors path="paymentType" cssStyle="color : red;" />
  		         
  		         
                <div class="block_border">
                    
                    <p>
                    <!-- <fieldset id="field">
                        <legend> credit cards</legend> -->
                        Payment Type?
                        <input type="radio" name="ok" value="visa" />:Visa
                        <input type="radio" name="ok" value="masterCard" />:Master-Card
                        <input type="radio" name="ok" value="payPal" />:PayPal

                    <!-- </fieldset> -->
                    </p>
                    <p>
                        Card Number:<input type="text" name="cardNumber" required
                                           placeholder="**** **** **** ****" />
                    <p> expire Date:<input type="date" name="expireDate" required pattern="yyyy/mm/dd"
                                           placeholder="yyyy/mm/dd" />
                        security Code:<input type="text" name="sCode" required
                        />
                    </p>
                    </p>
                </div> 
  		
		
        <p id="buttons">
            <input id="submit" type="submit"   value="submit">
        </p>
    </fieldset>
</form:form>
</div>
</body>
</html>