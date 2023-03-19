<%-- 
    Document   : order-history-form
    Created on : Mar 19, 2023, 10:17:18 AM
    Author     : quang
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <table>
            <tr>
                <td>Mã đơn hàng</td>
                <td>Ngày mua</td>
                <td>Sản phẩm</td>
                <td>Tổng tiền</td>
                <td>Tình trạng</td>

            </tr>
            <c:forEach items="${listOrdered}" var="i">
            <tr>
                <td><a href="getordereddetail?orderId=${i.orderedId}">${i.orderedId}</a></td>
                <td>${i.date}</td>
              <td>
                    <c:forEach items="${i.cart}" var="item">
                        +${item.product.productName}: x${item.ammout} <br>
                    </c:forEach>
                    
                </td>
                <td>${i.getThanhTienString(30000)}</td>
                <td>${i.orderStatus}</td>
            </tr>
            </c:forEach>
            
        </table>
    </body>

</html>
