package com.example.Mockito;

import org.springframework.stereotype.Service;

@Service
public class SomeBusinessmpl {
	private DataService dataService;
	
	public SomeBusinessmpl(DataService dataService) {
		this.dataService = dataService;
	}

	int findTheGreatestFormAllData() {
		int[] data=dataService.retrieveAllData();
		int greatest=Integer.MIN_VALUE;
		System.out.println(greatest);
		for(int value:data) {
			if(value>greatest){
				greatest=value;
			}
		}
		return greatest;
	}
}
