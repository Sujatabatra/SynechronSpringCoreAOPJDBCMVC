<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link href="<c:url value="/resources/mystyle.css"/>" rel="stylesheet">
<title>Insert title here</title>
</head>
<body>
<h1 style="text-align: center">List of Items</h1>
<table border="3">
    <tr>
        <td>Item ID</td>
        <td>Item Name</td>
        <td>Quantity</td>
        <td>Price</td>
    </tr>

    <c:forEach var="item" items="${items}">
        <tr>
            <td>${item.itemId}</td>
            <td>${item.itemName}</td>
            <td>${item.quantity}</td>
            <td>${item.price}</td>
        </tr>
    </c:forEach>
</table>

<a href="./">Go Back</a>
</body>
</html>