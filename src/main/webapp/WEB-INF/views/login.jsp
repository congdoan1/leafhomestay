<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
    <link rel="stylesheet" href="<spring:url value='/resource/files/auth.css'/>">
    <title>Sign-In</title>
</head>
<body>
<div class="backgroundImage"> <img src="<spring:url value='/resource/files/background.jpg' />" alt="background"> </div>
<div class="form-container signin">
    <h1 class="logoText">Leaf</h1>

    <form method="post" action="processLogin">
        <div class="form-item">
            <input type="text" name="email" id="email" placeholder="Email">
        </div>

        <div class="form-item">
            <input type="password" name="password" id="password" placeholder="Password">
        </div>

        <div class="form-item submitBtn">
            <input type="submit" value="Login">
        </div>

        <div class="form-item buttomText flexRow">
            <div class="rememberMeContainer">
                <input type="checkbox" id="rememberMe">
                <label for="rememberMe"> Remember me </label>
            </div>

            <a href="<spring:url value="/login/register" />"> <p>Don't have an account?</p> </a>
        </div>



    </form>
</div>
</body>
</html>
