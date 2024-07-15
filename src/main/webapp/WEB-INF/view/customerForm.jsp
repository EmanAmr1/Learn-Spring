<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" prefix="c" %>

<!DOCTYPE html>
<html>
<head> <title>Customer Registration Form</title>

<style> .error{color:red}

</style>
</head>
<body>
<form:form action="processForm" modelAttribute="customer">

First name (*): <form:input path="firstName" />
<form:errors path="firstName" cssClass="error" />

<br> <br>
Last name: <form:input path="lastName" />


<br> <br>
Free passes: <form:input path="freePasses" />
<form:errors path="freePasses" cssClass="error" />


<input type="submit" value="submit" />

</form:form>
</body>
</html>