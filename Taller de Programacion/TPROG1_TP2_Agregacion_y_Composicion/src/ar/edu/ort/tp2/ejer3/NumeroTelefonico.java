package ar.edu.ort.tp2.ejer3;

public class NumeroTelefonico {

	// atributos

	private int caracteristica;
	private int nroAbonado;
	private int codPais;
	private TipoDeLinea tipoDeLinea;

	public NumeroTelefonico(TipoDeLinea tipoDeLinea, int codPais, int caracteristica, int nroAbonado) {

		setTipoDeLinea(tipoDeLinea);
		setCodPais(codPais);
		setNroAbonado(nroAbonado);
		setCaracteristica(caracteristica);

	}

	private void setCaracteristica(int caracteristica) {
		this.caracteristica = caracteristica;
	}

	private void setNroAbonado(int nroAbonado) {
		this.nroAbonado = nroAbonado;
	}

	private void setCodPais(int codPais) {
		this.codPais = codPais;
	}

	private void setTipoDeLinea(TipoDeLinea tipoDeLinea) {
		this.tipoDeLinea = tipoDeLinea;
	}

	public String getValor() {

		return String.format("%s: (+%3d) %4d-%04d", tipoDeLinea, codPais, caracteristica, nroAbonado);

	}
}
