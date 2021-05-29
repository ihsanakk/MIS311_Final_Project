<%@page import="service.SecretService"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Customer Monitor</title>
</head>
<style>
	
	input{
		border: 1px solid red;
		display:block;
		padding:2px;
		margin:2px;
		border-radius:5px;
	}
	* {
	font-family: Arial, Helvetica, sans-serif;
	}

</style>
<body>



















	<form action="secret" method="get">
	
		<label for="secretCode">Enter secret code</label>
		
		<input type="text" name="secretCode" id="secretCode">
		
		<input type="submit" value="Submit">
		
		
	</form>
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

</body>
</html>