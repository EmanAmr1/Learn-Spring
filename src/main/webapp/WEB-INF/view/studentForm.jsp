<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" prefix="c" %>

<!DOCTYPE html>
<html>
<head><title> Student registration form </title></head>
<body>
<form:form action="processForm" modelAttribute="student">
First name: <form:input path="firstName" />
<br> <br>
Last name: <form:input path="lastName" />
<br> <br>
<input type="submit" value="submit">
<br> <br>
<form:select path="country">

<form:options items="${student.countryOptions}" />

</form:select>

</form:form>
</body>
</html>