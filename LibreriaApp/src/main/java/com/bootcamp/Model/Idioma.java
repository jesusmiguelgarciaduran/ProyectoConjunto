package com.bootcamp.Model;

public class Idioma {
	
	private String sLengua;
	
	public Idioma(String sLengua) {
		this.setsLengua(sLengua);
	}

	public String getsLengua() {
		return sLengua;
	}

	public void setsLengua(String sLengua) {
		this.sLengua = sLengua;
	}
	
	public String mensaje() {
		String sMensaje="";
		switch(sLengua) {
		case "Castellano":
			sMensaje="Bienvenido";
			break;
		case "Inglés":
			sMensaje="Welcome";
			break;
		case "Italiano":
			sMensaje="Bienvenute";
			break;
		default:
			sMensaje="Bienvenido";
			break;
		}
		
		return sMensaje;
	}
}
