package br.com.topsorteio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;


@SpringBootApplication
public class TopsorteioApplication {

	public static void main(String[] args) {
		SpringApplication.run(TopsorteioApplication.class, args);
	}

}
