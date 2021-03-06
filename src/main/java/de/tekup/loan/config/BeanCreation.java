package de.tekup.loan.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;

@Configuration
public class BeanCreation {
	
	@Bean
	public Jaxb2Marshaller getMarshaller() {
		Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
		marshaller.setPackagesToScan("de.tekup.loan.soap.api.consume.loaneligibilty");
		return marshaller;
	}

}
