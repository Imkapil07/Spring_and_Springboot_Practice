<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="java.util.List" %>
    <%@page isELIgnored="false"%> 
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
 <h1>Welcome to home page</h1> 
 
 <%--  <% 
 String name = (String)request.getAttribute("name");
 List<String> aa = (List<String>)request.getAttribute("list");
 %>
 <h3> Name : <%=name%></h3> 
 <h3> List : <%=aa%> </h3>
 <% for(String s : aa){%>
 <h3><%= s %></h3>
 <%} %> --%>
 
 
 <h4>Name : ${name}</h4>
 <h4>List : ${list}</h4>  
 <c:forEach items="${list}" var="n">
 <h6>${n}</h6>
 </c:forEach>
 
 
 <a href="login">Login</a>
</body>
</html>
