<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>My Calculator</title>
</head>
<body bgcolor="cyan">

	<form method="get"   action="./CalculatorServlet">

		Number1:<input type="text" name="no1"> <br> Number2:<input
			type="text" name="no2"> <br> 
			Select Operator<select name="opt">
			<option value="add">+</option>
			<option value="sub">-</option>
			<option value="mul">*</option>
			<option value="div">/</option>
		</select> <br> <input type="submit" value="Check Result">
	</form>

</body>
</html>