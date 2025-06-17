package com.java.SpringDataJPAProject.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.java.SpringDataJPAProject.model.Vaccine;
import com.java.SpringDataJPAProject.view.ResultView;

public interface IVaccineRepo extends JpaRepository<Vaccine, Integer>{
	public List<ResultView> findByCostLessThan(Integer cost);
}
