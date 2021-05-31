function sumar(num1, num2){
	// var resultado = num1 + num2;
	// return resultado;
	return num1 + num2;
}
/* La función sumar() recibe dos parámetros,
	y "devuelve" o "retorna" la suma de los mismos. */

var resultado1 = sumar(10, 20);
/* Se guarda en la variable resultado1
	el valor retornado por la función sumar(). */

alert(resultado1);
/* Se muestra el valor de la variable
	con la función alert(). */

sumar(30, 40);
/* Se llama a la función sumar(), pasándole dos parámetros,
	pero no se guarda el valor retornado en ningún lado,
	por lo que el valor devuelto por la función
	"se pierde" o no se utiliza. */

var numero1 = 5;
var numero2 = 15;
var resultado2 = sumar(numero1, numero2);
alert(resultado2);

alert(sumar(50,100));
/* En este caso se está ejecutando la función alert(),
	para mostrar una ventana emergente y se le está
	pasando como argumento (parámetro) el valor
	devuelto por la función sumar(). */