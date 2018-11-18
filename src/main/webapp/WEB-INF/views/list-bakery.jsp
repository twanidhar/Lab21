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
<h1>Freshly Made</h1>

	<%-- form>
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
<h1>Bakery List</h1> --%>

		<table class="table">
			<thead>
				<tr>
					<th>Name</th>
					<th>Description</th>
					<th>Price</th>
					<th>Action</th>
				</tr>
			</thead>
			<tbody>
				<%-- c:forEach is loops through the items and repeats the content for each one.
			     Think of this as:   for (Food food : foods) { ... }
			--%>
				<c:forEach items="${BakeryItem}" var="food">
					<tr>
						<%-- Access properties of the java bean using simple . notation.
					     This actually calls the getters behind the scenes. --%>
						<td>${food.name}</td>
						<td>${food.description}</td>
						<td>${food.price}</td>
						<td>
							<a href="/cart?id=${ food.id }" class="btn btn-light btn-sm">Add Item to Cart</a>
						</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
		<div>
		<a href="/cart" /></a>
		<button type="submit" class="btn btn-light btn-sm">View Cart</button>
	</div>
</body>
</html>