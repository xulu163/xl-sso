package com.xulu.sso;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;

/**
 * @author xulu
 */
@SpringBootApplication
@ComponentScan(basePackages = "com.xulu")
@EnableResourceServer
public class XlSsoApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(XlSsoApplication.class, args);
	}
}
