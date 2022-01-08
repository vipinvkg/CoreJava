<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
String u = request.getParameter("user");
String p = request.getParameter("pwd");
%>

<%=u %>
<%=p %>

<%
String fn = request.getParameter("fname");
String ln = request.getParameter("lname");
String id = request.getParameter("id");
String pw = request.getParameter("pd");
String cp = request.getParameter("cpwd");
String g = request.getParameter("gen");
String d = request.getParameter("dob");
%>
<%=fn %>
<%=ln %>
<%=id %>
<%=pw%>
<%=cp%>
<%=g %>
<%=d %>
</body>
</html>