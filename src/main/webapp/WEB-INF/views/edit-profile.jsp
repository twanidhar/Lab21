<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Edit Profile</title>
<link rel="stylesheet" href="/theme.css" />
</head>
<body>
<form action="/edit-profile" method="post">
		<p>
			<label for="firstName">First Name:</label>
			<input id="firstName" name="firstName" value=${ User.firstName }>
		</p>
		<p>
			<label for="lastName">Last Name:</label>
			<input id="lastName" name="lastName" value=${ User.lastName }>
		</p>
		<p>
			<button type="submit">Save Changes</button>
			<a href="/">Cancel</a>
		</p>
	</form>
</body>
</html>