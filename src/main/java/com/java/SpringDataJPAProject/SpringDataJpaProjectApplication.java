package com.java.SpringDataJPAProject;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.java.SpringDataJPAProject.dao.IVaccineRepo;

import com.java.SpringDataJPAProject.model.Vaccine;
import com.java.SpringDataJPAProject.service.VaccineServiceImp;

@SpringBootApplication
public class SpringDataJpaProjectApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext container = SpringApplication.run(SpringDataJpaProjectApplication.class, args);
		VaccineServiceImp service = container.getBean(VaccineServiceImp.class);

		service.fetchByCostLessThan(1000).forEach(v->System.out.println(v.getVaccineName()));
	} 
		

}
