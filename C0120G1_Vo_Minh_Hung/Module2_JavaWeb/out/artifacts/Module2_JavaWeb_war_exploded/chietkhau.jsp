<%--
  Created by IntelliJ IDEA.
  User: Minh Hung
  Date: 30/03/2020
  Time: 10:01 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Calculate Discount</title>
    <link rel="stylesheet" type="text/css" href="css/style.css">
</head>
<body>
<h2>Calculate Discount</h2>
<form action="/display-discount" method="post">
    <label>Product Description: </label>
    <input type="text" name="product" placeholder="Enter your word: "/> <br/>
    <label>List Price: </label>
    <input type="text" name="gia" placeholder="Enter your word: "/> <br/>
    <label>PDiscount Percent: </label>
    <input type="text" name="tyle" placeholder="Enter your word: "/> <br/>
    <input type = "submit" id = "submit" value = "Calculate Discount"/>
</form>
</body>
</html>
