<%@page import="com.r3sys.Model.ProcessMaterial"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table class="table table-hover">
<thead>
  <tr>
    <th scope="col">ID</th>
    <th scope="col">NAME</th>
    <th scope="col">QUANTITY</th>
    <th scope="col">UNIT</th>
    <th scope="col">COST PER UNIT</th>
    <th scope="col">ACTION</th>
  </tr>
  </thead>
  <% 
  List<ProcessMaterial> processMaterial=(List<ProcessMaterial>)request.getAttribute("processMaterial");
  for(ProcessMaterial rm:processMaterial)
  {
  %>
  <tr>
  <th scope="row">
    <td><%=rm.getId() %></td>
    <td><%=rm.getName() %></td>
    <td><%=rm.getQuantity() %></td>
    <td><%=rm.getUnit() %></td>
    <td><%=rm.getCost() %></td>
    <td><a href="delete/<%=rm.getId() %>">Delete</a></td>
  </tr>
  <%} %>
 
</table>
</body>
</html>