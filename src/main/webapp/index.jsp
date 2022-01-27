<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Qual o tipo de Triângulo?</title>
<!--Bootstrap  -->
<link href="css/bootstrap.min.css" rel="stylesheet">

<!-- CSS -->
<style>
/* FONTE */
@import
	url('https://fonts.googleapis.com/css2? family= Roboto:wght@100 & display=swap')
	;

header, body, html {
	margin: 0px;
	padding: 0px; ]
	font-family: "Roboto";
	background-color: black;
	
}

h2 {
	text-align: center;
	
}

#triangulo {
	margin-top: 50px;
	width: 400px;
	height: 280px;
	background-color: #DE264C;
	margin-left: 200px;
	align-itens: center;
	justify-content: center;
	color: white;
	border: 1px solid white;
}

.formulario{
	align-itens: center;
	justify-content: center;
	text-align: center;
}

input{
background-color:#F6B1C3;
border: 1px solid white;

}

button{
background-color:#F6B1C3;
border: 1px solid black;
color:#BC0D35;
width: 70px;
height: 25px;
border-radius:10px;
font-weight: 950;
}
</style>
</head>

<body>
	<header>


		<div class="cantainer" id="triangulo">
			<h2>Qual o tipo de Triângulo?</h2>

			<form class="formulario" method="post" action="Triangulo">
				<div class="mb-4">
					<label for="exampleInputValor1" class="form-label"> Valor 1: </label> <br>
					<input type="text" class="form-control" name="valor1">
				</div>
				<br>
				<div class="mb-4">
					<label for="exampleInputValor2" class="form-label"> Valor 2: </label> <br> <input type="text" class="form-control"
						name="valor2">
				</div>
				<br>
				<div class="mb-4">
					<label for="exampleInputValor3" class="form-label"> Valor 3: </label> <br>
					<input type="text" class="form-control" name="valor3">
				</div>
				<br>
				<button type="reset">Limpar</button>
				<button type="submit">Somar</button>
			</form>
		</div>
	</header>

</body>
</html>