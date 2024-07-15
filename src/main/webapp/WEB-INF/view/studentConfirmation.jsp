<%@ taglib prefix="form" uri="http://java.sun.com/jsp/jstl/core"  %>

<!DOCTYPE html>
<html>
<head><title> Student Confirmation </title></head>
<body>
The Student is Confirmed: ${student.firstName}  ${student.lastName} 

<br> <br>

Country: ${student.country} 

Favourite Language : ${student.favouriteLanguage} 

Operating Systems :
<ul>
<c:forEach var="temp" items="${student.operatingSystems}" >
<li> ${temp} </li>
</c:forEach>
</ul>

<br> <br>
</body>
</html>