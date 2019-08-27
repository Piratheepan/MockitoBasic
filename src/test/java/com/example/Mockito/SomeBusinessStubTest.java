package com.example.Mockito;

import static org.junit.Assert.assertEquals;


import org.junit.Test;

public class SomeBusinessStubTest {

	@Test
	public void test() {
		SomeBusinessmpl businessImpl=new SomeBusinessmpl(new DataServiceStub());
		int result=businessImpl.findTheGreatestFormAllData();
		assertEquals(24,result);
	}
	

}
class DataServiceStub implements DataService{

	public int[] retrieveAllData() {
		
		return new int[] {24,6,15};
	}
	
}
