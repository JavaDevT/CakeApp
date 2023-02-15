package com.cakeshop.org;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
//@EnableSwagger2
@ComponentScan("com.cakeshop.org")
public class CakeApplication {
//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
	public static void main(String[] args) {
		SpringApplication.run(CakeApplication.class, args);
	}

}
