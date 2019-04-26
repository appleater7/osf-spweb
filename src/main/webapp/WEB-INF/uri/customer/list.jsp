<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
이것은 고객리스트<br>
${list}<br>
<c:forEach items="${list}" var="ci">
${ci.ciNum},${ci.ciName},${ci.ciId},${ci.ciAge} <br>
</c:forEach>
</body>
</html>