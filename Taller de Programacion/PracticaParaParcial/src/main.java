
public class main {

	public static void main(String[] args) {
		
		Tienda prueba = new Tienda();
		
		prueba.agregarStock("caramelos", 100, 1);
		prueba.agregarStock("Cigarrillos", 20, 200);
		prueba.agregarStock("Chicles", 500, 5);
		prueba.agregarStock("Galletitas", 10, 50);
		prueba.agregarStock("Alfajores", 30, 60);
		prueba.agregarStock("Gaseosa", 5, 150);
		
		prueba.mostrar();
		
		Pedido pedidoPrueba = new Pedido();
		
		pedidoPrueba.agregarProductos(prueba.array_nombres, prueba.array_cantidades, prueba.array_precio);

		/**
		 * Imprimas el menu con los items que tengan stock. Tomar la seleccion del
		 * usuario, con la cantidad deseada hasta que ingrese 0 para salir tomar la
		 * cantidad con la que va a pagar imprimir la boleta con los items elegidos
		 * (nombre, precio base, cantidad y precio total), descontando el stock de cada
		 * uno mostrar el total, el pago recibo y el vuelto
		 */
		
		
		/**
		 * En una veterinaria se atienden pacientes, de los que sabemos su numer de socio, nombre y especie.
		 * La atencion va a ser distinta segun especie. Al perro se lo puede vacunar, al loro parcharle el pico y a los gatos castrar.
		 * El sistema le vas a mostrar a los medicos la lista de pacientes actuales, con nombr ey especie para que seleccionen una opcion
		 * va a pedir a los medicos que ingresen el id del paciente,
		 * Al seleccionar se le muestra el historial medico y lo que pagó hasta el momento
		 * despues ingresar una descripcion del tratamiento y cuanto le cobraron.
		 * 
		 * si el numero que ingreso el maedico es 0, se cierra el programa
		 * si es > a los listados, se le pide los datos para ingresar un nuevo paciente (nombre y especie)
		 * 
		 * al final del dìa se debe mostrar un reporte de todas las atenciones, ademas del total cobrado.
		 */

		/**
		 * Una persona lleva la cuenta de sus gastos personales mensuales Quieren
		 * ingresar por mes cuanto dinero cobrò y cuanto dinero gastò por cada mes, se
		 * tiene que pedir ambos valores hasta la persona ingresa -1 el ingreso. (puede
		 * no haber tenido gastos ni ingresos un mes, pero no pueden ser negativos)
		 * cuando se terminan todos los meses, imprimir el resumen de ingresos y gastos,
		 * con el neto del mes y el balance
		 */
	}

}
