package com.bootcamp.Config;



import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.bootcamp.Model.Idioma;

@Configuration
@ConditionalOnClass(Idioma.class)
@EnableConfigurationProperties(IdiomaProperties.class)
public class IdiomaAutoConfigure {
	
		public final IdiomaProperties oProperties ;
		
		public IdiomaAutoConfigure(IdiomaProperties oProperties) {
			
			this.oProperties = oProperties;
		}


		@Bean
		public Idioma idioma() {
			return new Idioma (oProperties.getsLenguaje());
		}
		
		
}
