package comcg.DemoJunit.test;

import static org.junit.Assert.*;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import comcg.DemoJunit.service.*;

public class CalculatorTest {
	
	CalculatorService service;
	
	@Before
	public void beforeTest()
	{
		service=new CalculatorServiceImpl();
		//System.out.println("Hiii beforeTest");
	}

	@Test
	public void myTest() {
		assertEquals(new Double(30.0),service.addNumber(10.0, 20.0));
		assertEquals(new Double(20.0),service.subNumber(40.0, 20.0));
		assertEquals(new Double(8.0),service.mulNumber(4.0, 2.0));
		assertEquals(new Double(2.0),service.divNumber(40.0, 20.0));
		
	}
	
	@Test(expected=ArithmeticException.class)
	public void myTestException()
	{
		service.divNumber(40.0, 0.0);
	}
	
	
	@After
		public void afterTest()
		{
			service=null;
			//System.out.println("Hiii After Test");
		}
	}


