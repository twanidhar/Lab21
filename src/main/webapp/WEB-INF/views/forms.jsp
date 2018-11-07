<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
			First Name: <input name= "FirstName" />
		</p>
		<p>
			Last Name: <input name= "LastName" />
		</p>
		<p> Email: <input name= "Email" />
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