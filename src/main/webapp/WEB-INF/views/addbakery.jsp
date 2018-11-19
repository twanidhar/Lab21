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
 <form action="/list-bakery"></form>
        <h1>Bakery Items</h1>
       
       <form action="/admin/add-bakery" method="post">
        <table class="table">
            <tr>
                <th scope="row">Name</th>
                <td><input type="text" name="name" autofocus/></td>
            </tr>
            <tr>
                <th scope="row">Description</th>
                <td><input type="text" name="description" /></td>
            </tr>
             <tr>
                <th scope="row">Price</th>
                <td><input type="text"name="price" /></td>
            </tr>
            </table>
            <p>
            <a href= "/admin/menu">Bakery Menu</a>
            </p>
            <button type="submit" class="btn btn-primary">Submit</button>
            </form>
</body>
</html> 