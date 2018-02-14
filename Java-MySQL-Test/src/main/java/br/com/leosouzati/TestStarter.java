package br.com.leosouzati;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.scheduling.annotation.EnableScheduling;

@Configuration
@PropertySource("classpath:application.properties")
@SpringBootApplication
@EnableScheduling
public class TestStarter {
	
	public static void main(String[] args) {
		SpringApplication.run(TestStarter.class, args);
	}
}
