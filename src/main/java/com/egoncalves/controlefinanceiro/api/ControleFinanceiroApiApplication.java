package com.egoncalves.controlefinanceiro.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

import com.egoncalves.controlefinanceiro.api.config.ControleFinanceiroAPIProperty;

@SpringBootApplication
@EnableConfigurationProperties(ControleFinanceiroAPIProperty.class)
public class ControleFinanceiroApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(ControleFinanceiroApiApplication.class, args);
	}
}
