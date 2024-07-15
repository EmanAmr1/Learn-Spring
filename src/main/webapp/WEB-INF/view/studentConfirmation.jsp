<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" prefix="c" %>

<!DOCTYPE html>
<html>
<head><title> Student Confirmation </title></head>
<body>
The Student is Confirmed: ${student.firstName}  ${student.lastName} 

<br> <br>

Country: ${student.country} 
Favourite Language : ${student.favouriteLanguage} 
</body>
</html>