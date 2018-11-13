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
		<input name="category" placeholder="Category" />
		<button>Filter</button>
	</form>
	<table>
		<thead>
		<tr>
			<th>Name</th>
			<th>Description</th>
			<th>Price</th>
		</tr>
		</thead>
		<tbody>
		<c:forEach items="${BakeryItem}" var="item">
			<tr>
				<td>${item.name}</td>
				<td>${item.description}</td>
				<td>${item.price}</td>
			</tr>
		</c:forEach>
		</tbody>
	</table>
	<!-- <a href = "/BakeryList"> BakeryList</a> -->

</body>
</html>