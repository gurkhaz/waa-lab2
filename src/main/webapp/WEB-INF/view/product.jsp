<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Product List</title>
<link href="<c:url value="/resources/css/bootstrap.min.css" />"
	rel="stylesheet">
<link href="<c:url value="/resources/css/style.css" />" rel="stylesheet">
<%--  <script src="<c:url value="/resources/js/jquery.1.10.2.min.js" />"></script> --%>
<script src="<c:url value="/resources/js/bootstrap.min.js" />"></script>

</head>
<body>

	<div class="container">


		<header> </header>
		<h3>Product List</h3>
		<table class="table table-bordered">
			<thead>
				<tr>
					<th>Product</th>
					<th>Description</th>
					<th>Unit Price</th>
					<th>Stock</th>
					<th></th>
				</tr>
			</thead>

			<c:forEach items="${products}" var="product">
				<tr>
					<div class="boxed">
						<td><a href="getProduct/${product.productId}">
								${product.name} </a></td>
						<td><p>${product.description}</p></td>
						<td><p>${product.unitPrice}USD</p></td>
						<td><p>Availabe ${product.unitsInStock} units in stock</p></td>
						<td><a href="getProduct/${product.productId}"
							class="btn btn-success btn-block">Detail</a>
					</div>
				</tr>
			</c:forEach>
		</table>

	</div>
</body>
</html>