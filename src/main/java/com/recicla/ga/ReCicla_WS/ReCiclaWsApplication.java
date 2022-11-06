package com.recicla.ga.ReCicla_WS;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;

@SpringBootApplication
public class ReCiclaWsApplication {

	public static void main(String[] args) throws IOException {

		SpringApplication.run(ReCiclaWsApplication.class, args);
		Runtime rt = Runtime.getRuntime();
		String url = "http://localhost:8080/swagger-ui.html";
		rt.exec("rundll32 url.dll,FileProtocolHandler " + url);
	}

}
