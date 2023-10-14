package br.com.myapi.ecommerceapiproducts;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("br.com.myapi.ecommerceapiproducts")
public class EcommerceApiProductsApplication {

	public static void main(String[] args) {
		SpringApplication.run(EcommerceApiProductsApplication.class, args);
	}

}
