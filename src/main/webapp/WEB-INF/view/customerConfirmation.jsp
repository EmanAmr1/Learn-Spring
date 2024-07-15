<%@ taglib prefix="form" uri="http://java.sun.com/jsp/jstl/core"  %>

<!DOCTYPE html>
<html>
<head><title> Customer Confirmation </title></head>
<body>
The Customer is Confirmed: ${customer.firstName}  ${customer.lastName} 
<br> <br>

free passes : ${customer.freePasses}

<br> <br>

Postal Code : ${customer.postalCode}

<br> <br>

course Code : ${customer.courseCode}

</body>
</html>