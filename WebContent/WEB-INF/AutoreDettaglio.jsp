<%@ page language="java" contentType="text/html; charset=ISO-8859-1" 
    pageEncoding="ISO-8859-1"%> 
<!DOCTYPE html> 
<html> 
<head> 
<meta charset="ISO-8859-1"> 
<title>Insert title here</title> 
</head> 
<body> 
<h1>${autore.getNome() }    ${autore.getCognome() } </h1> 
 
   
  <a href="${pageContext.request.contextPath}/AutoreDeleteServlet?id=${id}">Cancella</a> 
  <a href="#"> Modifica </a>
  <br>
  <a href="${pageContext.request.contextPath}/AutoreServlet">Lista autori</a>
   
 
 
</body> 
</html>