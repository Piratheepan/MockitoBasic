package com.example.Mockito;


import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.Test;

public class SomeBusinessMockTest {
	@Test
	public void test() {
		DataService dataServiceMock=mock(DataService.class);
		when(dataServiceMock.retrieveAllData()).thenReturn(new int[] {24,15,4});
		
		SomeBusinessmpl businessImpl=new SomeBusinessmpl(dataServiceMock);
		int result=businessImpl.findTheGreatestFormAllData();
		assertEquals(24,result);
	}
	
	@Test
	public void test_one_vale() {
		DataService dataServiceMock=mock(DataService.class);
		when(dataServiceMock.retrieveAllData()).thenReturn(new int[] {15});
		
		SomeBusinessmpl businessImpl=new SomeBusinessmpl(dataServiceMock);
		int result=businessImpl.findTheGreatestFormAllData();
		assertEquals(15,result);
	}
}
