

<%@ page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8" %> 
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %> 

<!DOCTYPE html> 
<html lang="en"> 
<head> 
    <!-- Refresh every 5 seconds --> 
    <meta http-equiv="refresh" content="5;url=<spring:url value="${pageContext.request.contextPath}"/>"/> 
    <title>Execute And Wait Test</title> 
</head> 

<body> 
<p> 
    Waiting... 
</p> 
<p> 
    Refresh URL (every 3 seconds): <!--spring:url value="${pageContext.request.contextPath}"/--> 
</p> 
</body> 
</html>
