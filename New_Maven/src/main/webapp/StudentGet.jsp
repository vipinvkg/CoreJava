<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h5>
    <center><form action="StudentCtl" method="post">
    <h1>To get the details</h1>
<%String a = (String)request.getAttribute("err");
String b = (String)request.getAttribute("blank");
if(a!=null){%>    
   <font color="red"><%=a %></font>
  <%} %>
   <%if(b!=null){ %>
    <font color="red"><%=b %></font>
    <%} %>
   <br>
   <br>
    Roll No*<input type="text" name="Roll" placeholder="Enter Rollno here">
<input type="submit" value="submit"> 



<br>
<br>
  
  </form>

</body>
</html>