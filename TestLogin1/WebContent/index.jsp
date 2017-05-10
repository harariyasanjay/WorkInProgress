<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script src="js/validation.js"></script>
</head>
<body>

<form name="logonform" action="main.html" onsubmit="return validateForm()">
<table>
<tr>
<td>User Id: </td>
<td><input type="text" name="userid" placeholder="Enter User id"></td></tr>
<tr>
<td>Password: </td>
<td><input type="text" name="password" placeholder="Enter Password"></td></tr>
<tr><td><input type="submit" value="Submit"></td></tr>
</table>
</form>
</body>
</html>