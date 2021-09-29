<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html lang="en">
<head>
<title>Smart Watch Store</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
</head>
<body>

	<c:import url="/WEB-INF/jsp/menu.jsp" />


	<div class="container">
		<c:if test="${not empty mensagem}">			
			<div class="alert alert-success">
				<strong>Sucesso!</strong> ${mensagem}
			</div>
		</c:if>

		<c:if test="${not empty relogios}">
			<h2>Listagem de produtos: ${relogios.size()}</h2>
			
			<table class="table table-striped">
				<thead>
					<tr>
						<th>Id</th>
						<th>Produto</th>
						<th>Ano de Fabricação</th>
						<th></th>
						<th></th>
					</tr>
				</thead>
				<tbody>
					<c:forEach var="relogio" items="${relogios}">
						<tr>
							<td>${relogio.id}</td>
							<td>${relogio.marca}</td>
							<td>${relogio.anoFabricacao}</td>
							<td><a href="/relogio/${relogio.id}/excluir">Excluir</a></td>
							<td><a href="/relogio/consultar">Detalhar</a></td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</c:if>
		<form>
			<button formaction="/relogio">Incluir um novo produto</button>
		</form>
		<c:if test="${empty relogios}">
			<h2>Não existe produtos cadastrados!!!</h2>
		</c:if>
	</div>
</body>
</html>
