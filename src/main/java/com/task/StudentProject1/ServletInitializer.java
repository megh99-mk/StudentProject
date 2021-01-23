package com.task.StudentProject1;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

import com.task.StudentProject1.Models.StudentProject;



public class ServletInitializer  extends SpringBootServletInitializer {

	
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application)
	{
		return application.sources(StudentProject.class);
	}
	
	
	
}
