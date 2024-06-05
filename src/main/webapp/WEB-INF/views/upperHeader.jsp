<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<title>Dee Development Engineer</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js"></script>
</head>
<div class="container-fluid">
	<nav class="navbar navbar-default">
		<div class="container">
			<!-- Brand and toggle get grouped for better mobile display -->
			<div class="navbar-header">
				<button type="button" class="navbar-toggle collapsed"
					data-toggle="collapse" data-target="#bs-example-navbar-collapse-1"
					aria-expanded="false">
					<span class="sr-only">Toggle navigation</span> <span
						class="icon-bar"></span> <span class="icon-bar"></span> <span
						class="icon-bar"></span>
				</button>
				<a class="navbar-brand" href="${RootContext}/home"><b><font
						color="blue" size="5px">Dee Development</font>&nbsp; <font color="Blue"
						size="5px">Engineer</font></b></a>
			</div>

			<!-- Collect the nav links, forms, and other content for toggling -->
			<div class="collapse navbar-collapse"
				id="bs-example-navbar-collapse-1">
				<ul class="nav navbar-nav">
					<li class="active"><a href="index">Home <span
							class="sr-only">(current)</span></a></li>
					<li><a href="About">About Us</a></li>
					<li><a href="ContactUS">Contact Us</a></li>
					<li><a href="Customer_verf">verify Customer</a>
					<li><a href="NewCustomer">New Customer</a>
					<li><a href="NewTicket">New Ticket</a>
					<li><a href="Ticketheader">Ticket header</a>
					<li><a href="NewDetails">New Details</a>	
					<li><a href="ticketdetails">ticket details</a>
					<li><a href="NewSample">New Sample</a>
					<li><a href="Sample_test">Sample Test</a>
					<li><a href="Newlab">New Lab</a>
					<li><a href="Lab_ver">Lab test</a>
					<li><a href="newtest">New Test Details</a>
					<li><a href="test_details">Test Details</a>
					<li><a href="Report">Report</a>
					
					
		
					
					
					

					<form class="navbar-form navbar-left">
						<div class="form-group">
							<input type="text" class="form-control" placeholder="Search">
						</div>
						<button type="submit" class="btn btn-default">Submit</button>
					</form>
					<li>Welcome : <b>${all.fullname }</b></li>

					<li><a href="logout">Logout</b></a></li>
				</ul>

			</div>
			<!-- /.navbar-collapse -->
		</div>
		<!-- /.container-fluid -->
	</nav>
</div>


</html>  
