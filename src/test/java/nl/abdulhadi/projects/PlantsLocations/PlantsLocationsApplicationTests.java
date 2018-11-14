package nl.abdulhadi.projects.PlantsLocations;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PlantsLocationsApplicationTests {

	@Test
	public void contextLoads() {
	}
	
	@BeforeClass 
	public static void first() {
		int i = 0 ; 
		assertEquals(0,i); 
		
	}
	
	@Before
	public void beforeClasses() {
		
	}
	
	@Test
	public void testCount() {
		int i = 1+1;
		assertEquals(2,i); 
	}
	
	@AfterClass
	public static void afterClass() {
		
	}
	
	@After 
	public void justAfter() {
		
	}
}
