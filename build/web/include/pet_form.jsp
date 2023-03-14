<%-- 
    Document   : pet_form
    Created on : 14-03-2023, 13:01:58
    Author     : PC
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
    <c:forEach var="pet" items="${listPet}">
        <div>
            ${pet.productId}
            ${pet.productName}
            ${pet.productType}
            ${pet.productPrice}
            ${pet.productAmount}
            ${pet.petColor}
        </div>

    </c:forEach>
</body>
</html>
