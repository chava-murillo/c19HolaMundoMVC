<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
	
<title>Hola Mundo</title>

	<link href="css/style.css" rel="stylesheet" type="text/css">
</head>
<body>
	<h1>Hola Mundo</h1>
	<h2>Heey</h2>
	
	<form action="CalculadoraController" method="post">
		
		<label id="numero1" for="num1" >Numero1</label>
		<input type="text" id="num1" name="num1"/>
		
		<label id="numero2" for="num2" >Numero2</label>
		<input type="text" id="num2" name="num2"/>
		
		<input type="submit" value="Hacer suma"/>
	</form>
		
	<form action="RestasController" method="get">
		
		<label id="numero1res" for="num1res" >Numero1</label>
		<input type="text" id="num1res" name="nume1res"/>
		
		<label id="numero2res" for="num2res" >Numero2</label>
		<input type="text" id="num2res" name="nume2res"/>
				
		<input type="submit" value="Hacer resta"/>
	</form>
</body>


	<script src="js/script.js"></script>
</html>