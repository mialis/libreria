<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Lista Libri</title>
</head>
<body>
	<h1>Lista Libri</h1>
	<ul>
		<c:forEach var="libro" items="${libri }">
			<li><a href="#">${libro.getTitolo() }
					${libro.getDescrizione() }</a></li>
		</c:forEach>
	</ul>

	<form action="${pageContext.request.contextPath}/LibroFormServlet"
		method="GET">
		<button type="submit" name="nuovo-libro" value="nuovo-libro">NUOVO
			LIBRO</button>
	</form>
</body>
</html>



