package com.coolsistema.facture;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.embedded.jetty.JettyEmbeddedServletContainerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class AfipConnectApplication {

	public static void main(String[] args) {
		SpringApplication.run(AfipConnectApplication.class, args);
	}
	@Bean
	public JettyEmbeddedServletContainerFactory jettyEmbeddedServletContainerFactory() {
		JettyEmbeddedServletContainerFactory jettyContainer =
				new JettyEmbeddedServletContainerFactory();
		jettyContainer.setPort(9000);
		return jettyContainer;
	}
}
