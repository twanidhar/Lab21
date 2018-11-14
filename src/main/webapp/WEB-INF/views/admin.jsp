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
<!-- With boostrap, pages should generally be surrounded with a container element. -->
	<div class="container">
		<h1>Bakery List</h1>
		
		
		
		<table class="table">
			<thead>
			<tr>
				<th>Name</th><th>Description</th><th>Price</th><th>Action</th>
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
					<td>${food.name}</td><td>${food.description}</td><td>${food.price}</td>
					<td>
						<a href="/admin/edit?id=${ food.id }" class="btn btn-light btn-sm">Edit</a>
						<a href="/food/delete?id=${ food.id }" class="btn btn-light btn-sm">Delete</a>
					</td>
				</tr>
			</c:forEach>
			</tbody>
		</table>
		
		</div>
		
		
		<!-- <div>
		<form action="add-bakery">
		<p>
		Name:<input name= "name"></input>
		Description:<input name= "description"></input>
		Price:<input name= "price"></input> 
		<button type="submit">Add</button>
		</p>
		</form>
		</div> -->
		
		
		
	
</body>
</html>