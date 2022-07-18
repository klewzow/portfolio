package com.gmail.klewzow;

import com.gmail.klewzow.configuration.SpringConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PortfolioApplication {
	public static void main(String[] args) {
		SpringApplication.run(SpringConfiguration.class , args);
	}

}
