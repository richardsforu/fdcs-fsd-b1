<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Display.jsp</h1> <hr/>

  <h2>Welcome dear ${ename}</h2>
  <hr/>
  

<table border="1">
<tr>
	<th>City Name</th>
</tr>
<c:forEach var="cityName" items="${myCities}">
<tr>
	<td> ${cityName }</td>
</tr>
</c:forEach>
</table>
  

</body>
</html>