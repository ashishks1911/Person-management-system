<%@ include file="menu.jsp" %>
<html>
<head>
	<style>
		.dbtn{
			background-color:red;
			color:white;
			border:1px solid;
			padding:0.5vw 2.5vw;
			font-size:1.2vw;
		}
		td,input {
			font-size:1.2vw;
		}
	</style>
</head>
<body>
<div>
<form action="update-record" method='post'>
	<table border="1" align='center' style="border-collapse:collapse;font-size:1.2vw;width:40%;margin-top:4.8vw" cellpadding='10'>
		<tr>
			<th colspan='2' style="font-size:2.0vw;background-color:yellow;color:red">Person Details</th>
		</tr>
		<tr>
			<td>Person id</td>
			<td>${person.pid}
				<input type='hidden' value='${person.pid}' name='pid'>
			</td>
		</tr>
		<tr>
			<td>Person Name</td>
			<td><input type="text" value="${person.name}" name="name"></td>
		</tr>
		<tr>
			<td>Person City</td>
			<td><input type="text" value="${person.city}" name="city"></td>
		</tr>
		<tr>
			<td colspan="2" align="right">
				<button class="dbtn">Update</button>
			</td>
		</tr>
	</table>
</form>			
</body>
</html>