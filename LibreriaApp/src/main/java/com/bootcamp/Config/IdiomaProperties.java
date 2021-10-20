package com.bootcamp.Config;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("idioma.mensaje")
public class IdiomaProperties {
	
		private String sLenguaje="Castellano";

		public String getsLenguaje() {
			return sLenguaje;
		}

		public void setsLenguaje(String sLenguaje) {
			this.sLenguaje = sLenguaje;
		}
}
