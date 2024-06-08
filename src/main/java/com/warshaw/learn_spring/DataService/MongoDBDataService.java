package com.warshaw.learn_spring.DataService;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

//@Component
@Repository
@Primary
public class MongoDBDataService implements DataService {

	@Override
	public int[] retriveData() {
		
		return new int[] {1,2,3,4,5};
	}

}
