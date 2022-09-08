<%@ include file='menu.jsp' %>
<html>
<head>
	<title>Home</title>
	<style>
		.btn{
			font-size:1.5vw;
		}
		td ,input{
			font-size:1.5vw;
		}
		.content{
			padding:6vw;
		}
		.drop{
			font-size:1.3vw;
		}
	</style>
	
</head>
<body>
	<div class="content">
	<form action="add" method='post'>
		<table align='center' style="font-size:1.5vw;border:1px solid" cellpadding='5'>
			<tr>
				<td>Enter Id</td>
				<td><input type="text" name="pid" /></td>
			</tr>
			<tr>
				<td>Enter Name</td>
				<td><input type='text' name='name' ></td>
			</tr>
			<tr>
				<td>Enter City</td>
				<td>
				<input type="text" name="city">
				</td>
			</tr>
			<tr>
				<td colspan="2" align="right">
					<button class="btn">Submit</button>
				</td>
			</tr>
		</table>
	</form>
	</div>
</body>
</html>