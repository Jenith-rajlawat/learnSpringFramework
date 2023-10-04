package com.basic.learnSpringFramework.enterprise.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.basic.learnSpringFramework.enterprise.business.BusinessService;

/*        WEB
         |
         |
         \/
      Business
         |
         |
         \/
        Data
         |
         |
         \/
         Database*/



@Component
public class MyWebController {
	
	private BusinessService businessService;

	//@Autowired
	//private BusinessService businessService;// field DI
	
	/*
	 * @Autowired public void setBusinessService(BusinessService businessService) {
	 * System.out.println("Setter type DI"); this.businessService=businessService; }
	 * //setter DI
	 */	
	@Autowired
	public MyWebController(BusinessService businessService) {
		super();
		this.businessService = businessService;
	}
	
	
	public long returnValueFromBusinessService() {
		return businessService.calculateSum();
	}

	
	
	
}

