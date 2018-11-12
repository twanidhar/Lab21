<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Registration</title>
</head>
<body>
<p>Please fill the form to register!</p>

	<form action="/registration">
		<p>
			First Name: <input id="firstname" name= "FirstName"required minlength="2" maxlength="20"  />
		</p>
		<p>
			Last Name: <input name= "LastName" pattern="[A-Z][a-z]*" />
		</p>
		<p> Email: <input name= "Email" type = "Email" />
		</p>
		<p> Phone Number: <input name = "PhoneNumber" type = "phonenumber"/>
		</p>
		<p> Password: <input name = "Password" type = "password"/> 
		</p>
		
		
		<p>
			<button>Register</button>
		</p>
		
	</form>
	<p>
	<form action = "/home">
	
	<p>
	<button>Home Page</button>
	</p>
	</form>

</body>
</html>