package com.epicode_w4p.w4p;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.epicode_w4p.runner.WpRunner;

@SpringBootApplication
@ComponentScan
public class Application {

	public static void main(String[] args) throws Exception {
		SpringApplication.run(Application.class, args);
		WpRunner r = new WpRunner(); r.run(args);
		
	}
}
