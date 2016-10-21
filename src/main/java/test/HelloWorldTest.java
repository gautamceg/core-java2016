package test;

import static org.junit.Assert.*;
import mixed.HelloWorld;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class HelloWorldTest {

	@BeforeClass
	public static void beforeClass(){
		System.out.println("Before Class");
	}
	@AfterClass
	public static void afterClass(){
		System.out.println("after Class");
	}
	@Before
	public void before(){
		System.out.println("before----");
	}
	@Test
	public void testSquare() {
		//fail("Not yet implemented");
		HelloWorld hello = new HelloWorld();
		int value = hello.square(5);
		//assertEquals(26, value);
		assertEquals(25, value);
		//assertEquals(27, value);
	}
	@Test
	public void testCountChar(){
		assertTrue(true);
		int actual = new HelloWorld().countChar("Amar");
		assertEquals(2, actual);
	}
	@Test
	public void testMain(){
		new HelloWorld();
	}

}
