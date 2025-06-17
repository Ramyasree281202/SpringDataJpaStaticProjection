package com.java.SpringDataJPAProject.service;

import java.util.List;

import java.util.Optional;

import com.java.SpringDataJPAProject.model.Vaccine;
import com.java.SpringDataJPAProject.view.ResultView;

public interface IVaccineService {
	public List<ResultView> fetchByCostLessThan(Integer cost);
	}
