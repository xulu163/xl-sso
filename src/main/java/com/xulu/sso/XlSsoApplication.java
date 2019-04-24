package com.xulu.sso;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.context.request.RequestContextListener;

@SpringBootApplication
@EnableTransactionManagement
@ComponentScan(basePackages = "com.xulu")
public class XlSsoApplication {

	public static void main(String[] args) {
		SpringApplication.run(XlSsoApplication.class, args);
	}

	@Bean
	public RequestContextListener requestContextListener(){
		return new RequestContextListener();
	}

}
