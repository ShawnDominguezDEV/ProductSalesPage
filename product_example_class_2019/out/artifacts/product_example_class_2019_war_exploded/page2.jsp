<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<c:choose>
  <c:when test="${sessionScope.productSession != null}">

    <c:out value="${pageContext.session.id}"></c:out>
    <c:out value="${cookie.values()}"/>







  </c:when>
  <c:otherwise>
    <%--<c:out value="${'Please get to the first page'}"></c:out>--%>
    <c:redirect url="index.jsp"></c:redirect>
  </c:otherwise>



</c:choose>
</body>
</html>
