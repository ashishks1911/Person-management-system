<%@ include file="menu.jsp" %>
<html>
<head>
	<title>Home</title>
	<style>
		td,input{
			font-size:1.5vw;
		}
		form{
			display:inline-block;
		}
	</style>
</head>
<body>
	<div class='head' style="text-align:center; margin:0 auto;font-size:1.5vw;margin-top:5vw;">
	<form action='update' method="post">
		<table style='border:1px solid;padding:1vw;'>
			<tr>
				<td>Enter Person Id</td>
				<td><input type='text' name='pid' ></td>
				<td><input type='submit' value="Update"></td>
			</tr>
		</table>
	</form>
		<div style="text-align:center;font-size:2vw;margin-top:2vw;" >
			<h3 style="color:red">${msg}</h3>
		</div>
	</div>
</body>
</html>
