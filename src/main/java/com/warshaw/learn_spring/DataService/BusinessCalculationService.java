package com.warshaw.learn_spring.DataService;

import java.util.Arrays;

import org.springframework.stereotype.Service;

//@Component
@Service
public class BusinessCalculationService {
	
	private DataService dataService;
	
	public BusinessCalculationService(DataService dataService) {
		super();
		this.dataService = dataService;
	}

	public int findmax() {
		return Arrays.stream(dataService.retriveData()).max().orElse(0);
	}
}
