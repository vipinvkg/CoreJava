<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@ include file = "Header.jsp" %>
 <h3><font color="green"> Hi..<%
String s = (String)request.getAttribute("Fname");
%>
<%= s%></font></h3>
<center><font color="Red"><h1>Welcome in my Dream</h1></font></center>

<%@ include file = "Footer.jsp" %>
</body>
</html>