function holaMundo(){
	alert('¡Hola, mundo!');
}
/* Se define la función holaMundo(), que muestra
	siempre el mismo mensaje.
	Para ejecutarla basta con nombrar su nombre,
	seguido de un par de paréntesis. */

holaMundo();
/* Así "se llama" a la función holaMundo() para ejecutarla. */

holaMundo();
holaMundo();
/* Una función se puede volver a llamar tantas veces
	como se requiera. */


function nuncaLlamada(){
	alert('Este mensaje no se muestra :( ');
}
/* Si la función no es llamada, la misma no se ejecuta.
	Este es el caso de la función nuncaLlamada, que aunque
	fue definida, nunca fue llamada. */


/* Si se necesita que una función pueda realizar distintas
	acciones en cada ejecución, o que pueda comportarse de
	manera diferente cada vez que es llamada, se puede
	indicar que dicha función reciba parámetros, los cuales
	funcionan como variables que se definen entre paréntesis
	en el momento de definir la función, y se cargarán
	con el o los valores que se le pase a la función
	cuando la misma sea llamada. Estos valores, cargados
	en dichas variables (parámetros) podrán ser utilizados
	entonces por la función dentro de si misma, ya sea
	para imprimirlos en pantalla, realizar un cálculo con
	ellos, o cualquier otra operación. */

function saludar(quien, lugar){
	alert("¡Hola, " + quien + " de " + lugar + "! ¿cómo estás?");
}

/* La función saludar() recibe dos parámetros, a los cuales
	se les puso de nombre "quien" y "lugar". Esto permite que
	luego, al momento de llamarse a la función para que se ejecute,
	se le puedan pasar dos valores, los cuales serán recibidos y
	podrán ser utilizado por la misma, en cada ejecución,
	a través de las variable "quien" y "lugar". */



saludar("Alejadro", "Misiones"); // ¡Hola, Alejandro de Misiones! ¿cómo estás?
var nombre = 'Jorge';
var ciudad = 'Buenos Aires';
saludar(nombre, ciudad); // ¡Hola, Jorge de Buenos Aires! ¿cómo estás?
saludar("Andrea", ciudad); // ¡Hola, Andrea de Buenos Aires! ¿cómo estás?
saludar("Lucía");// ¡Hola, Lucía de undefined! ¿cómo estás?
saludar("", "");// ¡Hola,  de ! ¿cómo estás?
saludar();// ¡Hola, undefined de undefined! ¿cómo estás?

/* Como la función saludar() recibe dos parámetros, cada vez
	que es llamada se le puede pasar dos valores entre
	paréntesis, los cuales son utilizado por la función
	en su interior. Si la función esperaba uno o más parámetros,
	y no se le pasó ningún dato, dicho valor queda
	indefinido ("undefined"). */