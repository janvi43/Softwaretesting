<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ page import="com.Softwaretesting.Dao.modelImplticketheader" %>
<%@ page import ="com.Softwaretesting.Entity.ticketheader" %>
<!DOCTYPE html>
<html>
<head>
    <title>Report Results</title>
    <style>
        body {
            font-family: Arial, sans-serif;
        }
        h2 {
            text-align: center;
        }
        table {
            width: 80%;
            margin: 20px auto;
            border-collapse: collapse;
        }
        th, td {
            border: 1px solid #ddd;
            padding: 8px;
            text-align: center;
        }
        th {
            background-color: #f2f2f2;
        }
        ul {
            list-style-type: none;
            padding: 0;
        }
        li {
            margin: 5px 0;
        }
    </style>
</head>
<body>
    <h2>Report Details</h2>
    <c:if test="${not empty tickets}">
    <c:forEach var="all" items="${tickets}">
        
            <ul>
                <li>Ticket NO:<b><b>${all.getTicket_NO()}</b></b></li>
                <li>Ticket Date:<b><b>${all.getTicket_Date()}</b></b></li>
                <li>Name:<b><b>${all.getName()}</b></b></li>
            </ul>
                      
               
         <table align="center">
  <tr>
  <th> Line NO</th>
    <th>Sample No</th>
    <th>Sample Description</th>
    <th>Sample Status</th>
  </tr>
  <c:forEach var="detail" items="${all.details}">
  <c:forEach var="samples" items="${all.sample }">
<c:forEach var="Labtest" items="${all.labtests}">
     <c:forEach var="testda" items ="${all.testdetail }">
 
    <tr>
      <td align="center">${detail.LINE_NO}</td>
      <td align="center">${detail.sample_NO}</td>
      <td align="center">${detail.sample_Description}</td>
      <td align="center">${detail.sample_Status}</td>
    </tr>
   
    <tr>
    <th> Test ID</th>
    <th>Barcode NO</th> 
    <th>Test Name</th>
    <th>Test Type</th>
    </tr>
    
    <tr>
    <td align="center">${samples.TEST_ID}</td>
    <td align="center">${samples.BARCODE_NO}</td>
    <td align ="center">${Labtest.TEST_Name}</td>
    <td align="center">${Labtest.test_type }</td>
    </tr>
    <tr>
    <th>Test Result</th>
    <th>Appearance</th>
    <th>Tensible Strength</th>    
</tr>
    <tr>
        <%-- Implement logic to determine and display the test result for multiple cases --%>
        <td align="center">
            <c:set var="testResults" value="" />
<c:forEach var="labTest" items="${all.labtests}">
    <c:set var="testResults" value="${testResults}${labTest.test_result}, " />
</c:forEach>
${fn:substring(testResults, 0, fn:length(testResults) - 2)} <!-- Displaying aggregated test results -->
        </td>
        <td align="center">${testda.appearance}</td>
        <td align="center">${testda.tensible_strength}</td>
    </tr>
    </c:forEach>
    </c:forEach>
    </c:forEach>
    </c:forEach>

    
    
</table>
</c:forEach> 
</c:if>
    <c:if test="${empty tickets}">
        <p>No tickets found.</p>
    </c:if>  
 </body>
    </html>
