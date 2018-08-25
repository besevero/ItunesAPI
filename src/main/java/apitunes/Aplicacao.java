package apitunes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@Controller
public class Aplicacao {
	
	
	public static void main(String[] args) {
		SpringApplication.run(Aplicacao.class, args);
	}
}
