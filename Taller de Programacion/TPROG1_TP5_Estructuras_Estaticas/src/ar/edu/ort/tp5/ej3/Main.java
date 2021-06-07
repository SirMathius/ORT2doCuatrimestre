package ar.edu.ort.tp5.ej3;

public class Main {

	public static void main(String[] args) {

		
		GastoAnual gastoAnual = new GastoAnual();
		gastoAnual.agregarGastos(Mes.ENERO, "admin", 1500);
		gastoAnual.agregarGastos(Mes.ENERO, "tecnico", 150);
		gastoAnual.agregarGastos(Mes.FEBRERO, "tecnico", 500);
		gastoAnual.agregarGastos(Mes.MARZO, "comercial", 750);
		gastoAnual.agregarGastos(Mes.ABRIL, "funcional", 200);
		gastoAnual.agregarGastos(Mes.MAYO, "comercial", 7500);
		gastoAnual.agregarGastos(Mes.JUNIO, "admin", 500);
		gastoAnual.agregarGastos(Mes.JULIO, "funcional", 50);
		gastoAnual.agregarGastos(Mes.AGOSTO, "funcional", 300);
		gastoAnual.agregarGastos(Mes.SEPTIEMBRE, "tecnico", 500);
		gastoAnual.agregarGastos(Mes.OCTUBRE, "comercial", 300);
		gastoAnual.agregarGastos(Mes.NOVIEMBRE, "admin", 1000);
		gastoAnual.agregarGastos(Mes.DICIEMBRE, "comercial", 400);
		
		System.out.println("Gasto del rubro tecnico: "+gastoAnual.gastoAcumulado("tecnico"));
		System.out.println("Gasto del rubro administracion: "+gastoAnual.gastoAcumulado("administracion"));
		System.out.println("Gasto del rubro comercial: "+gastoAnual.gastoAcumulado("comercial"));
		System.out.println("Gasto del rubro funcional: "+gastoAnual.gastoAcumulado("funcional"));
		
		System.out.println();
		gastoAnual.informarConsumosPorMes();
		
	//	gastoAnual.informarPromedioMensualPorRubro();
		
		System.out.println();
	//	gastoAnual.informarMesMayorConsumo();
		
	}

}
