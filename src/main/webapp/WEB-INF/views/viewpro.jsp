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
<table class="table table-hover" >
<thead>
  <tr>
    <th scope="col">ID</th>
    <th scope="col">NAME</th>
    <th scope="col">QUANTITY</th>
    <th scope="col">UNIT</th>
    <th scope="col">COST PER UNIT</th>
    <th scope="col">ACTION</th>
    <th scope="col">UPDATE</th>
    <th scope="col">ISSUE</th>
    </tr>
  </thead>
  <% 
  List<ProcessMaterial> processMaterial=(List<ProcessMaterial>)request.getAttribute("processMaterial");
  for(ProcessMaterial m:processMaterial)
  {
  %>
  <tr>
  <th scope="row">
    <td><%=m.getId() %></td>
    <td><%=m.getName() %></td>
    <td><%=m.getQuantity() %></td>
    <td><%=m.getUnit() %></td>
    <td><%=m.getCost() %></td>
    <td><a href="deletepro/<%=m.getId() %>">Delete</a></td>
    <td><a href="updatepro?pid=<%=m.getId() %>">Update</a></td>
     <td><a href="issuepro?pid=<%=m.getId() %>">Issue</a></td>
    
  </tr>
  <%} %>
 
</table>
</body>
</html>