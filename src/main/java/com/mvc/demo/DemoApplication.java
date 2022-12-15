package com.mvc.demo;
import com.mvc.demo.entity.AppelOffre;
import com.mvc.demo.entity.Status;
import com.mvc.demo.service.AppelOffreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoApplication  {
@Autowired
AppelOffreService appelOffreService;
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
	@Bean
	CommandLineRunner commandLineRunner(){
		return arg -> {
			appelOffreService.save(new AppelOffre( "az122", "AA&&", Status.open,12));
		};
	}
}

