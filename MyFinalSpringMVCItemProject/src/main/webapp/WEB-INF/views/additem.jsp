<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="spring" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<spring:form action="./insertItem" method="post">
Enter Item ID : <spring:input path="itemId"/><br><br>
Enter Item Name : <spring:input path="itemName"/><br><br>
Enter Quantity : <spring:input path="quantity"/><br><br>
Enter Price : <spring:input path="price"/><br><br>
<input type="submit" value="add">
</spring:form>
</body>
</html>