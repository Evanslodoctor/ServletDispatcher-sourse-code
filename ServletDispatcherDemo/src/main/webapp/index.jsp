<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>page verification</title>
</head>
<body>
<body>
    <form action="Controller" method="post">
      <select name="selectOption" required class="form-control-sm form-control">
		<option value="Select you option">Select you option</option>
		<option value="Above18">Above18</option>
		<option value="below18">below18</option>
	    </select>
	   <input type="submit" value="Submit">
					    
    </form>
    
    <%
    String msg=request.getParameter("msg");
    if("below18".equals(msg))
    {
    %>
   <h1> Access denied! You are below 18 years!<h1>
    <%} %>
</body>
</html>

