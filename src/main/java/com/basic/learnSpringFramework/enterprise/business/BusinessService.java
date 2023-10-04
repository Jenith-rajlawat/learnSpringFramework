package com.basic.learnSpringFramework.enterprise.business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.basic.learnSpringFramework.enterprise.data.DataService;

@Component
public class BusinessService{
	
	/*
	 * @Autowired
	 *  private DataService dataService; //field DI
	 */	
		
		private DataService dataService;

		@Autowired
		public BusinessService(DataService dataService){
			System.out.println("Constructor Injection");
			this.dataService=dataService;
		}//constructor DI
	
		public long calculateSum() {
		List<Integer> data = dataService.getData();
		return data.stream().reduce(Integer::sum).get();
	}
}

