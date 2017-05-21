package com.chhaichivon.configurations;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration()
public class ViewControllerConfiguration extends WebMvcConfigurerAdapter  {

	@Override
	public void addViewControllers(ViewControllerRegistry registry) {
		registry.addViewController("/").setViewName("index");
		registry.addViewController("/home").setViewName("home");
		registry.addViewController("/admin").setViewName("admin");
	}
	
}
