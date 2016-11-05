<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<jsp:output omit-xml-declaration="yes"/>
<jsp:directive.page contentType="text/html;charaset=utf-8"/>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<head>ThankCustomer</head>
<body>
	<h1>Thank you for your order!</h1>
	<![CDATA[
	<a href='${flowExecutionUrl}&_eventId=finished'>Finish</a>
	]]>
</body>
</html>