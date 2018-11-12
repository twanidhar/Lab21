<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Bakery</title>
</head>
<body>
<h1>Bakery List</h1>

	<form>
		<input name="category" phaceholder="Category" />
		<button>Filter</button>
	</form>
	<table>

		<tr>
			<th>Name</th>
			<th>Description</th>
			<th>Price</th>
		</tr>
		<c:forEach var="BakeryItem" items="${BakteryItem}">
			<tr>
				<td>${BakeryItem.name}</td>
				<td>${BakeryItem.description}</td>
				<td>${BakeryItem.price}</td>
			</tr>
		</c:forEach>

	</table>
	<a href = "/list-bakery">Add BakeryItem</a>

</body>
</html>