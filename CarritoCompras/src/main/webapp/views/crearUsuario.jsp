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
			align: center;
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
			background-image: url("imagenes/pared.jpg");
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
	<title>Crear Cuenta</title>
</head>
<center>
<body>
	<header>
		<h1>CREAR CUENTA</h1>
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
	<input type ="hidden" name= "opcion" id="opcion" value="2">	
	
		<div class = "tableRow">
			<p>
<input id ="guardar"type="submit" name="guardar" value="Guardar" required="required">				
				<table >
<tr>
<th>Datos Generales:</th>
</tr>
<tr>
<td>Nombre:</td>
<td> <input propiedades="id_input" type="text" name="nombreUsuario" id="nombreUsuario" value=""></td>
</tr>
<tr>
<td>Apellido Paterno:</td>
<td><input propiedades="id_input" type="text" name="apellidoPaterno" id="apellidoPaterno" value=""></td>
</tr>
<tr>
<td>Apellido Materno:</td>
<td> <input propiedades="id_input" type="text" name="apellidoMaterno" id="apellidoMaterno" value=""></td>
</tr>
<tr>
<td>Fecha De Nacimiento:</td>
<td> <input propiedades="id_input" type="date" name="fechaNacimiento" id="fechaNacimiento" value=""></td>
</tr>
<tr>
<td>Sexo:</td>
<td>Masculino: <input  propiedades="id_input"type="radio" name="sexoUsuario" id="sexoUsuario" value="Masculino">
Femenino:<input type="radio" name="femeninino"   id="sexoUsuario" value="Masculino"></td>
</tr>
<tr>
<td>Calle:</td>
<td> <input propiedades="id_input" type="text" name="calleUsuario" id="calleUsuario" value=""></td>
</tr>
<tr>
<td>Numero:</td>
<td> <input propiedades="id_input" type="text" name="numerousuario" id="numerousuario" value=""></td>
</tr>
<tr>
<td>Colonia:</td>
<td> <input propiedades="id_input" type="text" name="coloniaUsuario" id="coloniaUsuario" value=""></td>
</tr>
<tr>
<td>Delegacion:</td>
<td> <input propiedades="id_input" type="text" name="delegacionUsuario" id="delegacionUsuario" value=""></td>
</tr>
<tr>
<td>Telefono:</td>
<td> <input propiedades="id_input"  type="text" name="telUsuario" id="telUsuario" value=""></td>
</tr>
<tr>
<td>Celular:</td>
<td> <input propiedades="id_input"type="text" name="cellUsuario" id ="cellUsuario" value=""></td>
</tr>
<tr>
<td>Email:</td>
<td> <input propiedades="id_input"type="text" name="emailUsuario" id="emailUsuario" value=""></td>
</tr>
<tr>
<td>Password:</td>
<td> <input propiedades="id_input"type="password" name="passwordUsuario" id="passwordUsuario" value=""></td>
</tr>
<tr>
<td>RFC:</td>
<td> <input propiedades="id_input"type="text" name="rfcUsuario" id="rfcUsuario" value=""></td>
</tr>
</table>
</form>
</center>
</div>

				
				
			</p>
			
	</form>
</body>
</html>