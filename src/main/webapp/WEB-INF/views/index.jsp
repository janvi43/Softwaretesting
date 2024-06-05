<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Dee Development - ${title }</title>
</head>
<body>

	<%@include file="header.jsp"%>

	<c:if test="${userclicksignform == true }">
		<%@include file="signform.jsp"%>
	</c:if>


	<c:if test="${userClickloginPage== true }">
		<%@include file="loginPage.jsp"%>
	</c:if>

	<c:if test="${userClickContact== true }">
		<%@include file="ContactUS.jsp"%>
	</c:if>

	<c:if test="${userClickAbout== true }">
		<%@include file="About.jsp"%>
	</c:if>
	<c:if test="${userClickogout== true }">
		<%@include file="logout.jsp"%>
	</c:if>
		<c:if test="${userclickNewCustomer== true }">
		<%@include file="NewCustomer.jsp"%>
	</c:if>
	
	<c:if test="${userClickCustomer_verf== true }">
		<%@include file="Customer_verf.jsp"%>
	</c:if>
	<c:if test="${userclickNewTicket== true }">
		<%@include file="NewTicket.jsp"%>
	</c:if>
		<c:if test="${userClickTicketheader== true }">
		<%@include file="Ticketheader.jsp"%>userclickNewTicket
	</c:if>
		
	
		<c:if test="${userclickNewDetails== true }">
		<%@include file="NewDetails.jsp"%>
	</c:if>
		<c:if test="${userClickticketdetails== true }">
		<%@include file="ticketdetails.jsp"%>
	</c:if>
		
		<c:if test="${userClickNewSample== true }">
		<%@include file="NewSample.jsp"%>
	</c:if>

		<c:if test="${userClickSample_test== true }">
		<%@include file="Sample_test.jsp"%>
	</c:if>
	<c:if test="${userClickNewlab== true }">
		<%@include file="Newlab.jsp"%>
		</c:if>
	<c:if test="${userClickLab_ver== true }">
		<%@include file="Lab_ver.jsp"%>
	</c:if>
	<c:if test="${userClicknewtest== true }">
		<%@include file="newtest.jsp"%>
	</c:if>
	<c:if test="${userClicktest_details== true }">
		<%@include file="test_details.jsp"%>
	</c:if>

<c:if test="${userclickReport== true }">
		<%@include file="Report.jsp"%>
	</c:if>	
</body>
</html>
    