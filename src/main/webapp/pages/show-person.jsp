<%@ include file="menu.jsp" %>
<html>
<body>
<div>
	<table border="1" align='center' style="border-collapse:collapse;font-size:1.2vw;width:40%;margin-top:4.8vw" cellpadding='10'>
		<tr>
			<th colspan='2' style="font-size:2.5vw;background-color:yellow;color:red">Person Details</th>
		</tr>
		<tr>
			<td>Person id</td>
			<td>${person.pid}</td>
		</tr>
		<tr>
			<td>Person Name</td>
			<td>${person.name}</td>
		</tr>
		<tr>
			<td>Person City</td>
			<td>${person.city}</td>
		</tr>
	</table>
</div>			
</body>
</html>