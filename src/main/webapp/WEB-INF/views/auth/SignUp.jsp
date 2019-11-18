<%@ taglib prefix="spring" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <link rel="stylesheet" href="<spring:url value='/resource/files/auth.css'/>">
    <link rel="stylesheet" href="<spring:url value=""/>">
    <title>Sign-Up</title>
</head>
<body>
<div class="backgroundImage"> <img src="<spring:url value='/resource/files/background.jpg' />" alt="background"> </div>
<div class="form-container signup">
    <h1 class="logoText">Leaf</h1>

    <form action="">
        <div class="form-item">
            <input type="text" name="" id="" placeholder="Username">
        </div>

        <div class="form-item">
            <input type="text" name="" id="1" placeholder="Email address">
        </div>

        <div class="form-item">
            <input type="password" name="" id="2" placeholder="Password">
        </div>

        <div class="form-item">
            <input type="password" name="" id="3" placeholder="Password confirm">
        </div>

        <div class="form-item submitBtn">
            <input type="submit" value="Sign up">
        </div>

        <div class="form-item buttomText">
            <a href="<spring:url value="/Auth/SignIn" />"> <p>Already have an account?</p> </a>
        </div>
    </form>
</div>
</body>
</html>
