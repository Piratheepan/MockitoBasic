package com.example.Mockito;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
//import org.mockito.junit.MockitoJUnitRunner;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class SomeBusinessMockAnnotationTest {
	
	@Mock
	DataService dataServiceMock;
	
	@InjectMocks
	SomeBusinessmpl businessImpl;

	@Test
	public void test() {
		//MockitoAnnotations.initMocks(this);
		when(dataServiceMock.retrieveAllData()).thenReturn(new int[] {24,15,4});
		int result=businessImpl.findTheGreatestFormAllData();
		assertEquals(24,result);
	}

}
