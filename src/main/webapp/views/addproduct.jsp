<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="module.jsp" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
</head>
<body>
<div class="container mt-3">
	<div class="row">
		<div class="col-md-6 offset-md-3">
			<h1 class="text-center md-3">Fill the product details</h1>
			<div class="alert alert-danger" role="alert">
  							<form:errors path="product.*" />
  						</div>
			<form action="handle-product" method="post">
				<div class="form-group">
					<label for="productname">Product Name</label>
					<input type="text" class="form-control" id="name" name="name" placeholder="Enter the pruduct name" required>
				</div>
				<div class="form-group">
					<label for="description">Product Description</label>
					<textarea rows="5" class="form-control" name="description" id="description" placeholder="Enter the product description" required></textarea>
				</div>
				<div class="form-group">
					<label for="price">Product Price</label>
					<input type="text" class="form-control" id="price" name="price" placeholder="Enter the pruduct price" required>
				</div>
				<div class="container text-center">
					<a href="${pageContext.request.contextPath}/" class="btn btn-outline-danger">Back</a>
					<button class="btn btn-outline-primary" type="submit">Add</button>
				</div>
			</form>
		</div>
	</div>
</div>
</body>
</html>