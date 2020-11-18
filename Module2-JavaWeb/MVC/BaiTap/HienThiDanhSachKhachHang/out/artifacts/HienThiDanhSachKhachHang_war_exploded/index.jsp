<%--
  Created by IntelliJ IDEA.
  User: Minh Hung
  Date: 05/04/2020
  Time: 11:07 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
  <title>Title</title>
</head>
<body>
<table  cellpadding="30px" cellspacing="0">
  <h2>Danh sách khách hàng</h2>
  <tr>
    <th>Tên</th>
    <th>Ngày sinh</th>
    <th>Địa chỉ</th>
    <th>Ảnh</th>
  </tr>
  <c:forEach var="customer" items="${listCustomer}" >
    <tr>
      <td><c:out value="${customer.getName()}"/></td>
      <td><c:out value="${customer.getHireDate()}"/></td>
      <td><c:out value="${customer.getAddress()}"/></td>
      <td><img src="${customer.getImage()}" alt=""></td>
    </tr>
  </c:forEach>
</table>
</body>
</html>
