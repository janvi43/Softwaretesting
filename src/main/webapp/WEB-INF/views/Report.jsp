<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page import="java.util.List" %>
<%@ page import="com.Softwaretesting.Dao.modelImplticketheader"%>
<%@ page import ="com.Softwaretesting.Entity.ticketheader"%>


<!DOCTYPE html>
<html>
<head>
    <title>Report</title>
</head>
<body>
    <h1>Report</h1>

    <form action="generate-report" method="post">
        Ticket NO: <input type="text" name="Ticket_NO"><br>
        Ticket Date: <input type="date" name="Ticket_Date"><br>
        Name: <input type="text" name="Name"><br>
        <input type="submit" value="Generate Report">
    </form>
    </body>
</html>