<%@page import="com.raystec.Studentmgt.StudentBean"%>
<%@page import="java.util.List"%>
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
		<form action="StudentCtl">
			<input type="submit" value="Refresh">
			<a href="StudentView.jsp">Back</a>
			<%
				List<StudentBean> list = (List<StudentBean>) request.getAttribute("lis");
				if (list != null) {
			%>
			<table border="1">
			<tr>
			
			<td>ROLL NO:</td>
			<td>FIRST NAME:</td>
			<td>LAST NAME:</td>
			<td>SESSION:</td>
				</tr>
				<%
					for (StudentBean b : list) {
				%>
				
				<tr>
				<td><%=b.getRollNo()%></td>
				<td><%=b.getFirstName()%></td>
				<td><%=b.getLastName()%></td>
				<td><%=b.getSession()%></td>
			</tr>
				<%
					}
				%>
		</table>
			<%
				}
			%>
		</form>


	</center>


</body>
</html>