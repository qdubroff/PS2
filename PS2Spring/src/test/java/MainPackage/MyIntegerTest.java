package MainPackage;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class MyIntegerTest {

	private static MyInteger myIntEven;
	private static MyInteger myIntOdd;
	private static MyInteger myIntPrime;
	private static MyInteger myIntComposite;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		myIntEven = new MyInteger(2);
		myIntOdd = new MyInteger(3);
		myIntPrime = new MyInteger(43);
		myIntComposite = new MyInteger(44);
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testIsEven() {
		assertTrue(myIntEven.isEven()==true);
		assertFalse(myIntOdd.isEven()==true);
	}
	@Test
	public void testIsOdd() {
		assertTrue(myIntOdd.isOdd()==true);
		assertFalse(myIntEven.isOdd()==true);
	}
	@Test
	public void testIsPrime() {
		assertTrue(myIntPrime.isPrime()==true);
		assertFalse(myIntComposite.isPrime()==true);
	}
}
