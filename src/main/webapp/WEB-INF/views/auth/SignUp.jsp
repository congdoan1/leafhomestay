<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"  %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="input" uri="http://www.springframework.org/tags/form" %>

<html>
<head>
    <link rel="stylesheet" href="<spring:url value='/resource/files/auth.css'/>">
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Sign-Up</title>
</head>
<body>
<div class="backgroundImage"> <img src="<spring:url value='/resource/files/background.jpg' />" alt="background"> </div>
<div class="form-container signup">
    <h1 class="logoText">Leaf</h1>

    <form:form modelAttribute="User">
        <div class="form-item">
            <form:input id="email" path="email" type="text" placeholder="Email"/>
            <form:errors path="email" cssClass="text-danger"/>
        </div>

        <div class="form-item">
            <div class="flex flexRow justifySpaceBetween">
                <div class="seperator">
                    <form:input id="firstName" path="firstName" type="text" placeholder="Firstname"/>
                    <form:errors path="firstName" cssClass="text-danger"/>
                </div>
                <div class="marginLeft5px">
                    <form:input id="lastName" path="lastName" type="text" placeholder="Lastname"/>
                    <form:errors path="lastName" cssClass="text-danger"/>
                </div>
            </div>
        </div>

        <div class="form-item">
            <div class="flex flexRow justifySpaceBetween">
                <div class="seperator">
                    <form:input path="dob" type="date" name="" id="datePicker" placeholder="Date of birth"/>
                    <form:errors path="dob" cssClass="text-danger"/>
                </div>
                <div class="marginLeft5px">
                    <form:select path="gender">
                        <form:option value="0">Male</form:option>
                        <form:option value="1">Female</form:option>
                    </form:select>
                    <form:errors path="gender" cssClass="text-danger"/>
                </div>
            </div>
        </div>

        <div class="form-item">
            <form:input id="password" path="password" type="password" placeholder="Passoword"/>
            <form:errors path="password" cssClass="text-danger"/>
        </div>

        <div class="form-item">
            <form:input path="matchingPassword" type="password" id="matchingPassword" placeholder="Confirm password"/>
            <form:errors cssClass="text-danger"/>
        </div>

        <div class="form-item">
            <div class="rememberMeContainer buttomText flexRow flexStart">
                <form:radiobutton id="rolehost" name="role" value="ROLE_HOST" path="selectedRole"/> <label for="rolehost"> Host </label> <br>
                <form:radiobutton id="roleguest" name="role" value="ROLE_GUEST" path="selectedRole"/> <label for="roleguest"> Guest </label> <br>
                <form:errors path="roles" cssClass="text-danger"/>
            </div>
        </div>

        <div class="form-item">
            <input type="submit" value="Sign up">
        </div>

        <div class="form-item buttomText">
            <a href="<spring:url value="/Auth/SignIn" />"> <p>Already have an account?</p> </a>
        </div>
    </form:form>
</div>
</body>
</html>
