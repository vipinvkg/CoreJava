<%@page import="com.raystec.Studentmgt.StudentModel"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%-- <%@page import = "com.raystec.Studentmgt.StudentBean" %> --%>
<jsp:useBean id="std" scope="page" class="com.raystec.Studentmgt.StudentBean"/>
<jsp:setProperty name="std" property="*"/>
<%
String op = request.getParameter("operation");

if(op.equals("Add")) {StudentModel.add(std);
}else if (op.equals("Modify")){StudentModel.update(std);
}else if (op.equals("Delete")){StudentModel.delete(std);
}
response.sendRedirect("StudentView.jsp");
%>

<%-- <%
StudentBean std = new StudentBean();
std.setRollNo(request.getParameter("rollNo"));
std.setFirstName(request.getParameter("firstname"));
std.setLastName(request.getParameter("lastname"));
std.setSession(request.getParameter("session"));

String op = request.getParameter("operation");

if(op.equals("Add")) {StudentModel.add(std);
}else if (op.equals("Modify")){StudentModel.update(std);
}else if (op.equals("Delete")){StudentModel.delete(std);
}
response.sendRedirect("StudentView.jsp");
%>
 --%>
</body>
</html>