<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%@page
		import="org.springframework.context.support.ResourceBundleMessageSource"%>
	<%@page
		import="org.springframework.context.support.ClassPathXmlApplicationContext"%>
	<%@page import="org.springframework.context.ApplicationContext"%>
	<%@page import="java.util.Locale"%>
	<%
		String lang = request.getHeader("accept-language");
	Locale locale = new Locale(lang);
	ApplicationContext ap = new ClassPathXmlApplicationContext("resources/spring.xml");
	String value = ap.getMessage("lable", null, locale);
	%>
	<form action="./hello">
	<%=value %>:<input type="text" name="name">
	<input type="submit" value="submit">
	</form>
</body>
</html>