<!DOCTYPE HTML>
<html>
<head>
	<style>
		body {
			font-family: sans-serif;
		}
		form {
			display: table;
			padding: 10px;
			border: thin dotted #7e7e7e;
			background-color: teal;
			align:right;
		}
		form textarea {
			width: 500px;
			height: 200px;
		}
		div.tableRow {
			display: table-row;
		}
		div.tableRow p {
			display: table-cell;
			vertical-align: top;
			padding: 3px;
			text-align:right;
		}
		div.tableRow p:first-child {
			text-align: right;
		}
		ul li {
			display: inline;
			padding: 5px 10px 5px 10px;
			}
		ul {
			background-color: teal;
			color:white;
			margin: 10px 10px 0px 10px;
			list-style-type: none;
			padding: 5px 0px 5px 0px;
			border-bottom-left-radius: 13px;
			border-bottom-right-radius: 13px;
			}
		header{
			background-image: url("../img/pared.jpg");
			background-repeat: repeat-x;
			background-position: right;
			background-color: navy;
			margin: 10px 10px 0px 10px;
			height: 175px;
			color: white;
			border-top-left-radius: 13px;
			border-top-right-radius: 13px;
			}
		h1 {
			margin: 10px;
			padding: 30px;
			text-align: center;
			font-family: sans-serif;
			font-size: 75px;
			}
	</style>
	<meta charset="utf-8">
	<title>Bienvenido</title>
</head>
<body>
	<header>
		<h1>BIENVENIDO</h1>
	</header>
	<nav>
		<ul>
			<li>Home</li>
			<li>Catalogo</li>
			<li>Carrito de Compras</li>
			<li>Mi cuenta</li>
		</ul>
	</nav>
	
	<form name="loginForm" action="../UsuarioServlet" method="post">
		<%=request.getSession().getAttribute("error")%>
		<input type ="hidden" name= "opcion" id="opcion" value="1">
		<div class = "tableRow">
			<p>
				Usuario: <input type ="text" name= "usuario" id="usuario" value=""> <br>
				Password:<input type = "password" name = "password" id="password"value= ""> <br>
				<input type ="submit" name = "ingresarUsuario" value="Ingresar">
			</p>
			</div>
	</form>
	<form name="loginForm" action="../UsuarioServlet" method="post">
		<a href="crearUsuario.jsp">Registrar</a>
	</form>
	
</body>
</html>