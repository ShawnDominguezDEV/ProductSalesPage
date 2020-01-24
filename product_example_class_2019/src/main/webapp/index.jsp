<%--
  Created by IntelliJ IDEA.
  User: jtm174
  Date: 11/25/2019
  Time: 2:29 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <table border="1">
    <tr>
      <td>
    <form action="doSomething" method="post">
      <input type="hidden" name="fromProd" value="prod1">
      <input type="hidden" name="defQuant" value="1">
      <input type="hidden" name="defId" value="1">
      <input type="hidden" name="defPrice" value="22.98">
    <label>Product 1: Hickory Farms Farmhouse Collection Gift Box</label>
    <img src="Pics/product_1.jpeg" height="300" width="300">
    <input type="submit" value="Add To Cart">
    </form>
      </td>
    <td>
      <form action="doSomething" method="post">
        <input type="hidden" name="fromProd" value="prod2">
        <input type="hidden" name="defQuant" value="1">
        <input type="hidden" name="defId" value="2">
        <input type="hidden" name="defPrice" value="9.98">
        <label>Product 2: Hershey S'mores Two Mug Holiday Gift Set</label>
        <img src="Pics/product_2.jpeg" height="300" width="300">
        <input type="submit" value="Add To Cart">
      </form>
    </td>
    </tr>
      <tr>
      <td>
        <form action="doSomething" method="post">
          <input type="hidden" name="fromProd" value="prod3">
          <input type="hidden" name="defQuant" value="1">
          <input type="hidden" name="defId" value="3">
          <input type="hidden" name="defPrice" value="7.98">
          <label>Product 3: Dove Chocolate S'mores Mug Holiday Gift Set</label>
          <img src="Pics/product_3.jpeg" height="300" width="300">
          <input type="submit" value="Add To Cart">
        </form>
      </td>
      <td>
        <form action="doSomething" method="post">
          <input type="hidden" name="fromProd" value="prod4">
          <input type="hidden" name="defQuant" value="1">
          <input type="hidden" name="defId" value="4">
          <input type="hidden" name="defPrice" value="19.98">
          <label>Product 4: Ghirardelli® Travel Mugs 3 Pack Gift Sett</label>
          <img src="Pics/product_4.jpeg" height="300" width="300">
          <input type="submit" value="Add To Cart" align="center">
        </form>
      </td>
      </tr>
  </table>
      <form action="doSomething" method="post">
        <input type="hidden" name="fromProd" value="checkout">
        <input type="submit" value="Checkout" align="center">
      </form>
  </body>
</html>
