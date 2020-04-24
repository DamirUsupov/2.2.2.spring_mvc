<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html;charset=cp1251"%>
<html>
<title>${title}</title>
<body>
<table border='1'>
    <tr>
        <td>Brand</td>
        <td>Model</td>
        <td>Year</td>

    </tr>

    <c:forEach var="car" items="${cars}" varStatus="st">
        <tr>

            <td> ${car.brand} </td>
            <td> ${car.model} </td>
            <td> ${car.year} </td>

        </tr>
    </c:forEach>
</table>
</body>
</html>