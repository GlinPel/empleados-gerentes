<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>

<html>
<head>
<meta charset="UTF-8">
<title>Querys paises</title>
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">
</head>
<body>
	<div class="container mt-5">
		<div class="row">
			<h4>Insertar valores en la base de datos para obtener resultados de gerentes y empleados</h4>
		</div>
		<div class="row mt-5">
			<h2>Empleados -> Gerentes</h2>
			<table class="table">
			  <thead>
			    <tr>
			      <th scope="col">Empelados</th>
			      <th scope="col">Gerente</th>
			    </tr>
			  </thead>
			  <tbody>
			  	<c:forEach var="item" items="${empleadosGerente}">
			  		<tr>
				      <td><c:out value="${ item[0] }"/></td>
				      <td><c:out value="${ item[1] }"/></td>
				    </tr>
			  	</c:forEach>
			  </tbody>
			</table>
		</div>
		<div class="row">
			<h2>Gerentes -> Empleados</h2>
			<table class="table">
			  <thead>
			    <tr>
			      <th scope="col">Gerente Nombre</th>
			      <th scope="col">Gerente Apellido</th>
			      <th scope="col">Empleado Nombre</th>
			      <th scope="col">Empleado Apellido</th>
			    </tr>
			  </thead>
			  <tbody>
			  	<c:forEach var="item" items="${gerenteEmpleados}">
			  		<tr>
				      <td><c:out value="${ item[0] }"/></td>
				      <td><c:out value="${ item[1] }"/></td>
				      <td><c:out value="${ item[2] }"/></td>
				      <td><c:out value="${ item[3] }"/></td>
				    </tr>
			  	</c:forEach>
			  </tbody>
			</table>
		</div>
		
	</div>
	
</body>
</html>