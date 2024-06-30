<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body> 

  <h1> Login Page </h1> 
  
  <% 
    String classN = (String) request.getAttribute("ClassName");  
    Integer Reg =(Integer) request.getAttribute("renumber"); 
  %> 
  
  <h3> Class : <%= classN%></h3>
  <h3> Reg : <%= Reg %></h3>
</body>
</html>