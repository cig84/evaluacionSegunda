<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import='dataBaseHR.Departments' %>
<%@ page import='dataBaseHR.Employees' %>
<%@ page import='java.util.List' %>
<%@ page import='java.util.Iterator' %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Lista de Empleados</title>
</head>
<body>
<h3>Lista de Empleados</h3>
<form action="RecuperarEmpleadosPorDepts">
<table>
<tr align="CENTER">
<td><b>Nombre</b></td>
<td><b>Apellido</b></td>
</tr>
<%
List<Employees> listaEmpleados = (List<Employees>)request.getAttribute("listaEmpleados");
Iterator<Employees> it = listaEmpleados.iterator();
while (it.hasNext())
{
	Employees e = it.next();
	%>
	<tr align="CENTER">
	<td><%=e.getFirstName()%></td>
	<td><%=e.getLastName() %></td>
	</tr>
	<%

}
%>
</table>
</form>
</body>
</html>