package com.java.SpringDataJPAProject.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

import com.java.SpringDataJPAProject.dao.IVaccineRepo;
import com.java.SpringDataJPAProject.model.Vaccine;
import com.java.SpringDataJPAProject.view.ResultView;
@Service
public class VaccineServiceImp implements IVaccineService{
	@Autowired
	private IVaccineRepo repo;
	
	

	@Override
	public List<ResultView> fetchByCostLessThan(Integer cost) {
		
		return repo.findByCostLessThan(1000);
	}
	
	

}
