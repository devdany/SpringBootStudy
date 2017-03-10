package com.example;

import com.example.handler.ReaderHandlerMethodArgumentResolver;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import java.util.List;

@SpringBootApplication
public class DemoApplication extends WebMvcConfigurerAdapter {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	public void addViewControllers(ViewControllerRegistry registry){
		registry.addViewController("/login").setViewName("login");
	}

	@Override
	public void addArgumentResolvers(List<HandlerMethodArgumentResolver> argumentResolvers){
		argumentResolvers.add(new ReaderHandlerMethodArgumentResolver());
	}
}
