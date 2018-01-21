package br.com.maisvida;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@Configuration
@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan
@EnableJpaAuditing
public class MaisVidaApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(MaisVidaApiApplication.class, args);
	}

}
