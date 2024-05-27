<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>

<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/1000hz-bootstrap-validator/0.11.9/validator.min.js"></script>
<script
	src="https://cdn.rawgit.com/PascaleBeier/bootstrap-validate/v2.1.3/dist/bootstrap-validate.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/1000hz-bootstrap-validator/0.11.9/validator.js"></script>
</head>
<body>
	<%@include file="header.jsp"%>
	<div class="container">
		<div class="jumbotron text-xs-center">
			<h1 class="display-3">Thank You!</h1>
			<p class="lead">
				<strong>Your Successfully Registered TICKET_NO : ${lastInsertedTICKET_NO}
					&nbsp; </strong> 
			</p>
			<hr>

			<p class="lead">
				<a class="btn btn-primary btn-sm" href="Sample_test" role="button">Verification</a>
			</p>
		</div>
	</div>
</body>
</html>