<%@ page errorPage="ExceptionHandler.jsp" language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
 <%@ include file = "Header.jsp" %>
<h5>
    <center><form action="ForgotPasswordCTL" method="post">
    
   <h1>Forgot your Password? </h1>
   <br>
    Emailid *<input type="email" name="emailid" placeholder="Enter ID here">
<input type="submit" value="submit"> 
<%String s = (String)request.getAttribute("error"); 
if(s!=null){%>
<font color="red"><%=s %></font>
<%}%>
<br>
<br>
  
  </form>
  <%@ include file= "Footer.jsp" %>
</body>
</html>