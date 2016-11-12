<%--
  Created by IntelliJ IDEA.
  User: chen
  Date: 16-11-8
  Time: 下午9:24
  To change this template use File | Settings | File Templates.
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h1>view Cart</h1>
    <a href="${flowExecutionUrl}&_eventId=submit">Submit</a>
    <h2>product for you choice</h2>
    <table>
        <c:forEach var="product" items="${products}">
            <tr>
                <td>${product.index}</td>
                <td>${product.name}</td>
                <td>${product.price}</td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>
