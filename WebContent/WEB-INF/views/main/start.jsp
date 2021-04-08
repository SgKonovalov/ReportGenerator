<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Числа</title>
</head>
<body>
	<h1>Все сгенерированные числа:</h1>
	
	<c:if test="${not empty dataList}">
		<table border="1">
			<tr>
				<td>Первый столбец</td>
				<td>Второй столбец</td>
				<td>Третий столбец</td>
				<td>Четвёртый столбец</td>
			</tr>
			<c:forEach items="${dataList}" var="data">
			<tr>
					<td>${data.numberByFirstColumn}</td>
					<td>${data.numberBySecondColumn}</td>
					<td>${data.numberByThirdColumn}</td>
					<td>${data.numberByFourthColumn}</td>
					</tr>
			</c:forEach>
			
		</table>
</c:if>
	
		<a href="reportByEven/">Скачать и просмотреть отчёт по чётным числам</a>

</body>
</html>