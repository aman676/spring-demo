package com.warshaw.learn_spring.DataService;

import org.springframework.stereotype.Repository;

//@Component
@Repository
public class SQLDataService implements DataService{

	@Override
	public int[] retriveData() {
		
		return new int[] {11,22,33,44,55};
	}

}
