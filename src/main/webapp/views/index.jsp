<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>  
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<%@include file="./module.jsp" %>  
</head>
<body>
	<div class="container mt-3">
		<div class="row">
			<div class="col-md-12">
				<h1 class="text-center md-3">Welcome to Product App</h1>
				
				<table class="table table-striped mt-3">
				  <thead>
				    <tr>
				      <th scope="col">ID</th>
				      <th scope="col">Product name</th>
				      <th scope="col">Product Description</th>
				      <th scope="col">Price</th>
				      <th scope="col">Action</th>
				    </tr>
				  </thead>
				  <tbody>
				  <c:forEach items="${products}" var="p">
				    <tr>
				      <th scope="row">pro${p.id}</th>
				      <td>${p.name}</td>
				      <td>${p.description}</td>
				      <td style="font-weight: bold;">${p.price}</td>
				      <td>
				      <a href="delete/${p.id}"><i class="fas fa-trash text-danger"></i></a>
				      <a href="updateproduct/${p.id}" style="padding-left: 12px;"><i class="fas fa-pen-nib"></i></a>
					  </td>
				    </tr>
				    </c:forEach>
				  </tbody>
				</table>
				<div class="container text-center">
				  	<a href="addproduct" class="btn btn-outline-success">Add Product</a>
				  </div>
				
			</div>
		</div>
	</div>
</body>
</html>