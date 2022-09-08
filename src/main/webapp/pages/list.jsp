<%@ include file="menu.jsp"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
	<style type="text/css">
		th{
			background-color:yellow;
			color:red;
		}
		td{
			padding: 0.7vw 1.8vw;
		}
	</style>
</head>
<body>
	<div style="padding-top:5vw">
		<table border="1" align='center' style="font-size: 1.5vw;border-collapse:collapse;" cellpadding='10'>
			<tr>
				<th>Person Id</th>
				<th>Person Name</th>
				<th>Person city</th>
			</tr>
			<c:forEach var="person" items="${plist}">
				<tr>
					<td>${person.pid}</td>
					<td>${person.name}</td>
					<td>${person.city}</td>
				</tr>
			</c:forEach>
		</table>
	</div>
</body>
</html>