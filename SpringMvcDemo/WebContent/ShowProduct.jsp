<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="a" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
Show product
<table border=1>
<tr>
<th> Product Id </th>
<th> Product Name </th>
<th> Product Price </th>
</tr>

<a:forEach var="pro" items="${data}">
<tr>
<td>${pro.productId}</td>
<td>${pro.productName}</td>
<td>${pro.productPrice}</td>

</tr>
</a:forEach>

</table>
</body>
</html>