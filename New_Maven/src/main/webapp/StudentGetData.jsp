<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<center>
<H2><font color="green">Hi..Get the details below</font></H2>

<%
String r = (String)request.getAttribute("rl");
String f= (String)request.getAttribute("fn");
String l = (String)request.getAttribute("ln");
String s = (String)request.getAttribute("se");
%>
<%if(request.getAttribute("rl")!=null){ %>

<table border="1">
			<tr>
			
			<td>ROLL NO:</td>
			<td>FIRST NAME:</td>
			<td>LAST NAME:</td>
			<td>SESSION:</td>
				</tr>
				<tr>

<td><%=r %></td>
<td><%=f %></td>
<td><%=l %></td>
<td><%=s %></td>
</tr>
</table>
<%} %>
</center>
</body>
</html>