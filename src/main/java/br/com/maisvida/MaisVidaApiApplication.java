package br.com.maisvida;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class MaisVidaApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(MaisVidaApiApplication.class, args);
	}
}
