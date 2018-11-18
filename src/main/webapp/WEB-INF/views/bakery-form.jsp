<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="/BakeryList">

		<p class="form-group">
			<label for="name">Name</label> <input class="form-control" id="name"
				name="name" required minlength="2" autocomplete="off">
		</p>
		<p class="form-group">
			<label for="description">Description</label> <input
				class="form-control" id="name= " description" required>
		</p>
		<p class="form-group">
			<label for="price">Price</label> <input class="form-control"
				id="price" name="price">
		</p>

		<button type="submit" class="btn btn-primary">Submit</button>
		<p></p>

	</form>

</body>
</html>