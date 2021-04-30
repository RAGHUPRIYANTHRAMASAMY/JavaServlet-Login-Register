<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="Register" method="post">
		<div>
			UserName: <input type="text" name="uname">
		</div>
		<div>
			Password: <input type="password" name="password">
		</div>
		<div>
			Email: <input type="email" name="email" required>
		</div>
		<div>
			Phone: <input type="number" name="phone">
		</div>
		<input type="submit">
	</form>
</body>
</html>