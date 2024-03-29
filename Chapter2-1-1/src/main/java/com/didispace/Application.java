package com.didispace;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.web.SpringBootServletInitializer;
import org.springframework.context.annotation.EnableMBeanExport;
import org.springframework.web.bind.annotation.SessionAttributes;


/**
 *
 * @author 程序猿DD
 * @version 1.0.0
 * @blog http://blog.didispace.com
 *
 */
@SpringBootApplication
@EnableMBeanExport(defaultDomain = "chapter2")
@SessionAttributes("authorizationRequest")
public class Application extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(
			SpringApplicationBuilder builder) {
		return builder.sources(Application.class);
	}

	/**
	 * @param args
	 * @author long.tang 2016年8月15日
	 * 
	 */
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}