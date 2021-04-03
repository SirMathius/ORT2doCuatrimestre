package ar.edu.ort.tp2.ejer3;

public class Email {
	
	private String ARROBA = "@";
	private String cuenta;
	private String dominio;
	
	public Email(String email) {
		dividirEmail(email);
	}

	private void dividirEmail(String email) {
		String[] campos = email.split(ARROBA);
		
		if (campos.length == 2) {
			this.cuenta = campos[0];
			this.dominio = campos[1];
		} else {
			this.cuenta = "ERROR";
			this.dominio = "ERROR";
		}
		
	}
	
	public String getValor( ) {
		return this.cuenta + this.ARROBA + this.dominio;
	}

}
