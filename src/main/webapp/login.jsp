<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>

	<meta charset="ISO-8859-1">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">

    <link rel="shortcut icon" href="img/favicon.png" type="image/x-icon">
    <script src="https://kit.fontawesome.com/c5a0bea4a7.js" crossorigin="anonymous"></script>
    
    <link rel="stylesheet" href="Login.css">
	<title>Login</title>
	
</head>
<body>
	
	<div id="Navigation">

        <span id="Home"><i class="fas fa-home"></i><a href="home.jsp">HOME</a></span>
        <span id="right">
            <span id="aboutUs"><a href="http://">About Us</a></span>
            <span id="Register"><a href="register.jsp">Register</a></span>
            <span id="Contact"><a href="mailto:">Contact</a></span>
        </span>

    </div>

    <div id="UserLogin">

        <form action="login" method="post">

            <h3 id="h3">LOGIN</h3>

            <div>
                <input type="text" name="Username" id="Username" placeholder="Username" required>
            </div>

            <div>
                <input type="password" name="Password" id="Password" placeholder="Password" required>
            </div>

            <div>
                <input type="checkbox" name="" id="Remember" checked>
                <label for="Remember"> Remember Me</label>
            </div>

            <div>
                <button type="submit" id="login">LOGIN</button>
            </div>

            <div>
                <span id="forget"><a href="http://">Forget Password?</a></span>
            </div>

            <div id="newUser">
                <span>New User? </span><a href="register.jsp"> Register</a>
            </div>

        </form>

    </div>
	
</body>
</html>