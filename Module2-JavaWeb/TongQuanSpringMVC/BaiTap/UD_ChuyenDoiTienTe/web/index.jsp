<%--
  Created by IntelliJ IDEA.
  User: Minh Hung
  Date: 06/04/2020
  Time: 5:04 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <h2>Currency Converter</h2>
  <form action="/converter" method="post">
    <label for="rate">Rate: </label><br/>
    <input type="text" name="rate" id="rate" placeholder="RATE" value="22000"/><br>
    <label for="usd">USD: </label><br>
    <input type="text" name="usd" id="usd" placeholder="USD" value="0"><br>
    <input type="submit" id="submit" value="Converter">
  </form>
  </body>
</html>
