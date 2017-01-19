<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Product Details</title>
<link href="<c:url value="/resources/css/bootstrap.min.css" />"
	rel="stylesheet">
<link href="<c:url value="/resources/css/style.css" />" rel="stylesheet">
<%--  <script src="<c:url value="/resources/js/jquery.1.10.2.min.js" />"></script> --%>
<script src="<c:url value="/resources/js/bootstrap.min.js" />"></script>

</head>
<body>
	<div class="container">


		<header> </header>
		<h3>Product Detail</h3>
		<div class="boxed">
		<form method="post" action="processOrder">
			<table class="table table-bordered">
				<tr>
				<th>Product</th>	<td><h3>${product.name}</h3></td>
				</tr>
				<tr>
				<th>Description</th><td>	<p>${product.description}</p></td>
				</tr>
				<tr>
				<th>Unit Price</th><td>	<p>${product.unitPrice}USD</p></td>
				</tr>
				<tr>
				<th>In Stock</th><td>	<p>Availabe ${product.unitsInStock} units in stock</p></td>
				</tr>
				<tr>
				<th>Quantity</th><td>	<input type="text" name="qty" placeholder="Quantity" /></td>
				</tr>
				<tr>
				<th></th><td>	<input type="submit" value="Order"	class="btn btn-success "></td>
				</tr>
				
			</table>
			</form>
		</div>
	</div>

</body>
</html>