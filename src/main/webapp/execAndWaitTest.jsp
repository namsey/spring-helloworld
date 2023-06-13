<!DOCTYPE html>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Basic Spring MVC Application - Welcome</title>
</head>
<body>

<spring:form name="frmLetterMenu" action="ExecAndWaitTest_test" accept-charset="utf-8">
    <spring:token/>
    <spring:submit value="Test Execute And Wait" version="5.0" />
</spring:form>

</body>
</html>
