<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>Dee Development Enginner</title>
<meta name="viewport" content="width=device-width, initial-scale=1">

</head>
<body>

	<%@ include file="upperHeader.jsp"%>

	<div class="container">

		<div class="panel panel-info">
			<div class="panel-heading"> Login Details.........</div>
			<div class="panel-body">
	
				<ul>
					<li> Id: <b>${all.alienId }</b></li>
					<li>Fullname : <b>${all.fullname }</b></li>
					<li>EMail: <b>${all.email }</b></li>
					<li>Gender : <b>${all.gender }</b></li>
					<li>Specialization: <b>${all.specialization }</b></li>
					
				</ul>
				<p class="lead">
                    <a class="btn btn-primary btn-sm" href="Customer_verf" role="button">Verify  customer</a>
                   <br>  <a class="btn btn-primary btn-sm" href="NewCustomer" role="button">New customer</a>
</p>
			</div>
		</div>

	</div>
</body>
</html>





