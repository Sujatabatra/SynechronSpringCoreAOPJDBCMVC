<%@page isELIgnored="false" %>
<%@taglib prefix="sujata" uri="http://www.springframework.org/tags/form" %>
<html>
<body>
<h2>Welcome to Login Page</h2>

<sujata:form action="./login" method="post" modelAttribute="user">
 Enter User Name : 
				<sujata:select path="userName">
					<sujata:option value=" ">Select UserName</sujata:option>
					<sujata:options items="${myusers}"/>
				</sujata:select> 
 <%-- <sujata:input path="userName"/>--%><br><br>
 Enter Password : <sujata:password path="password"/><br><br>
 Enter Age : <sujata:input path="age"/><br><br>
<input type="submit" value="Login">
</sujata:form>
	
	

</body>
</html>
