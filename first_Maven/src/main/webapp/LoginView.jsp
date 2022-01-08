<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@include file = "Header.jsp" %>
	<form action="LoginCtl" method="post">
		<h2>
			<center>Login</center>
		</h2>
		
			<%
			String error = (String)request.getAttribute("err");
			String errorl= (String)request.getAttribute("loginreq");
			String errorp= (String)request.getAttribute("passreq");
			if(error!=null){
			%>
			<center> <font color="red"> <h3>invalid</h3></font></center>
			<%} %>
			
		
		<center>

			<table>

				<tr>
					<td>Login Id*</td>
					<td><input type="email" name="user"></td>
													
			<td><%
			if(errorl!=null){
			%>
			<font color="red"><%=errorl %></font>
			<%} %></td>
				</tr>
				<tr>
					<td>Password*</td>
					<td><input type="password" name = "pwd"></td>
								
			<td><%if(errorp!=null){
			%>
			 <font color="red"><%=errorp %></font>
			<%} %>
				</td>
				</tr>
				<tr>
					<td></td>
					<td><input type="submit" value="Signin"></td>
				</tr>


			</table>
	</form>
	</center>


	<center>
		<b><a href="UserRegistratioView.jsp" Target="_blank"> Create an Account | </a></b> <b><a
			href="ForgotPassword.jsp" Target="_blank"> Forget my
				Password | </a></b>
	</center>
	<br>
	<%@ include file ="Footer.jsp" %>
	</body>
</html>