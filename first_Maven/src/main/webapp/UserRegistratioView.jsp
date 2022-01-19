<%@ page errorPage="ExceptionHandler.jsp" language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@include file = "Header.jsp" %>
 <center>
        <form action="RegistrationCTL" method="post">
            <th>
                <h1>User Registration</h1>
            </th>
            <%
            String f = (String)request.getAttribute("fn");
            String l = (String)request.getAttribute("ln");
            String i = (String)request.getAttribute("id");
            String p = (String)request.getAttribute("pw");
            String cp = (String)request.getAttribute("cpw");
            String d = (String)request.getAttribute("db");
            %>
            <table height="50px">
                <tr>
                    <td>First Name* </td>
                    <td><input type="text" name="fname">
                    <%if(f!=null){ %>
                        <font color="red"><%=f %> </font>
                    <%} %></td>
                </tr>
                <tr>
                    <td>Last Name* </td>
                    <td><input type="text" name="lname"><%if(l!=null){ %>
                        <font color="red"><%=l %> </font>
                    <%} %></td>
                </tr>
                <tr>
                    <td>Login id* </td>
                    <td><input type="email" name="id" value="must be Email iD">
                    <%if(i!=null){ %>
                        <font color="red"><%=i %> </font>
                    <%} %>
                    </td>
                </tr>
                <tr>
                    <td>Password* </td>
                    <td><input type="password" name="pd">
                    <%if(p!=null){ %>
                        <font color="red"><%=p %> </font>
                    <%} %></td>
                </tr>
                <tr>
                    <td>Confirm Password* </td>
                    <td><input type="password" name="cpwd">
                    <%if(cp!=null){ %>
                        <font color="red"><%=cp %> </font>
                    <%} %></td>
                </tr>
                <tr>
                    <td>Gender* </td>
                    <td>
                        <div class="Custom-select" style="width :100px;">
                            <select name="gen">
                                <option value="M">Male</option>
                                <option value="F">Female</option>
                            </select>
                        </div>
                    </td>
                </tr>
                <tr>
                    <td>Date of Birth </td>
                    <td><input type="date" value="mm/dd/yyyy" name="dob"> 
                    <%if(d!=null){ %>
                        <font color="red"><%=d %> </font>
                    <%} %>
                    </td>
                </tr>
                <tr>
                    <td></td>
                    <td><input type="submit" value="Signup"></td>
            </table>
        </form>
    </center>
    <%@include file = "Footer.jsp" %>
</body>
</html>