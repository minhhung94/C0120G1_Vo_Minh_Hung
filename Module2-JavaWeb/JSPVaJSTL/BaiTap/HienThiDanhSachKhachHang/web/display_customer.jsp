<%--
  Created by IntelliJ IDEA.
  User: Minh Hung
  Date: 02/04/2020
  Time: 2:46 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<div class="container">
    <table cellpadding="10px" cellspacing="0">
        <h2>Danh sách khách hàng</h2>
        <tr>
            <th>Tên</th>
            <th>Ngày sinh</th>
            <th>Địa chỉ</th>
            <th>Hình ảnh</th>
        </tr>
        <c:forEach items="${listCustomer}" var="customer">
            <tr>
                <td>${customer.name}</td>
                <td>${customer.ngaysinh}</td>
                <td>${customer.address}</td>
                <td><img src="${customer.image}" alt=""></td>
            </tr>
        </c:forEach>
    </table>
</div>
</body>
</html>
