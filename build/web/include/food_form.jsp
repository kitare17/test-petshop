<%-- 
    Document   : food_form
    Created on : 14-03-2023, 13:01:50
    Author     : PC
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
 
        <c:forEach var="food" items="${listFood}">
            <div>
                ${food.productId}
                ${food.productName}
                ${food.productType}
                ${food.productPrice}
                ${food.productAmount}
            </div>

        </c:forEach>
    </body>
</html>
