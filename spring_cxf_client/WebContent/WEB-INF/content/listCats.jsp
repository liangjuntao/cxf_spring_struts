<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="utf-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>all cats</title>
</head>
<body>

<ul>
<s:iterator value="cats" var="entry">
	<li>${entry.key}  --> ${entry.value.name} </li>
</s:iterator>
</ul>
</body>
</html>