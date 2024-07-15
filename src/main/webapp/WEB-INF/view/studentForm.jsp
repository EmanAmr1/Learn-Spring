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
<br> <br>
Favourite Languages:

java <form:radiobutton path="favouriteLanguage" value="java" />
c# <form:radiobutton path="favouriteLanguage" value="c#" />
php <form:radiobutton path="favouriteLanguage" value="php" />
ruby <form:radiobutton path="favouriteLanguage" value="ruby" />

<br> <br>
Operating Systems:

Linx <form:checkbox path="operatingSystems" value="Linux" />
Mac <form:checkbox path="operatingSystems" value="Mac" />
Windows <form:checkbox path="operatingSystems" value="Windows" />
</form:form>
</body>
</html>