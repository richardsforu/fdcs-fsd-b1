<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<form action="findProductsByName">
Product Name: <input type="text" name="productName"> <br/>

<input type="submit" value="Find Product">

</form>
<p>${msg}</p>

</body>
</html>