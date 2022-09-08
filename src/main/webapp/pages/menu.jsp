<%@ page isELIgnored="false" %>
<html>
<head>
	<title>Home</title>
	<style type="text/css">
		body{
			margin:0;
			padding:0;
		}
		.navbar
		{
			background-color:lightblue;
			padding:2vw;	
		}
		.navbar a button {
			font-size:1.5vw;
		} 
		
	</style>
</head>
<body>
	<div class='navbar'>
		<a href='/personinfo'><button>Home</button></a>
		<a href='insert'><button>Add Person</button></a>
		<a href='remove'><button>Remove Person</button></a>
		<a href='list'><button>Show Person</button></a>
		<a href='edit'><button>Update Person</button></a>
		<a href='search'><button>Search Person</button></a>
	</div>
</body>
</html>