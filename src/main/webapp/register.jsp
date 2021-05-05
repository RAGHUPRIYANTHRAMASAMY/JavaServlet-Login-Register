<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
	
	<script src="https://kit.fontawesome.com/c5a0bea4a7.js" crossorigin="anonymous"></script>
    <link href="https://fonts.googleapis.com/css2?family=Pacifico&display=swap" rel="stylesheet">
    <link href="https://fonts.googleapis.com/css2?family=Lobster&display=swap" rel="stylesheet">

    <link rel="stylesheet" href="./Register.css">
    <title>Register</title>
    
</head>
<body>
	
	<div id="Navigation">
    
        <span id="Home"><i class="fas fa-home"></i><a href="home.jsp">HOME</a></span>
        <span id="right">
            <span id="aboutUs"><a href="http://">About Us</a></span>
            <span id="Contact"><a href="mailto:">Contact</a></span>
        </span>
    
    </div>

    <div id="SignUp">
        <h3>Register Your Credentials</h3>
        <form action="register" method="post">

            <div>
                <input type="text" name="username" 
                id="username" placeholder="UserName" required>
            </div>

            <div>
                <input type="password" name="password" 
                id="password" placeholder="Password" required>
            </div>

            <div>
                <input type="email" name="email" 
                id="email" placeholder="Email" required>
            </div>
            <div>
                <input type="number" name="phone" 
                id="phone" placeholder="Phone" required>
            </div>

            <div>
                <button type="submit">Register</button>
            </div>

        </form>

        <hr>

        <span>
            <p>SignUp Using</p>
        </span>
        <div id="Lodo">
            <a href="http://"><img width="50px" height="30px"
                    src="https://diversevc.com/wp-content/uploads/2020/12/G.png"
                    alt="" srcset=""></a>
            <a href="http://"><img width="50px" height="40px"
                    src="https://www.vippng.com/png/detail/5-54604_facebook-icon-transparent-png-whatsapp-icon-png.png" alt=""
                    srcset=""></a>
            <a href="http://"><img width="50px" height="40px"
                src="https://txregionalcouncil.org/wp-content/uploads/2019/04/2-27646_twitter-logo-png-transparent-background-logo-twitter-png.jpg"
                alt="" srcset=""></a>
        </div>

    </div>
	
</body>
</html>