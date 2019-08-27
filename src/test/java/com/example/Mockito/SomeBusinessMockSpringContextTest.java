package com.example.Mockito;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest
public class SomeBusinessMockSpringContextTest {
	@MockBean
	DataService dataServiceMock;
	
	@Autowired
	SomeBusinessmpl businessImpl;
	
	@Test
	public void test() {
		when(dataServiceMock.retrieveAllData()).thenReturn(new int[] {24,15,4});
		assertEquals(24,businessImpl.findTheGreatestFormAllData());
	}
}
