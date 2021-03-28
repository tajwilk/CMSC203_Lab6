import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class GradeBookTester {
	
	GradeBook book1;
	GradeBook book2;
	
	@Before
	public void setUp() throws Exception {
		book1 = new GradeBook(5);
		book1.addScore(78.0);
		book1.addScore(91.0);
		book1.addScore(86.0);
		book2 = new GradeBook(5);
		book2.addScore(83.0);
		book2.addScore(92.0);
	}
	
	@Test
	public void testAddScore() {
		assertTrue(book1.toString().equals("78.0 91.0 86.0 "));
		assertTrue(book2.toString().equals("83.0 92.0 "));
	}

	@Test
	public void testSum() {
		assertEquals(255, book1.sum(), .0001);
		assertEquals(175, book2.sum(), .0001);
	}

	@Test
	public void testMinimum() {
		assertEquals(78, book1.minimum(), .001);
		assertEquals(83, book2.minimum(), .001);
	}

	@Test
	public void testFinalScore() {
		assertEquals(177, book1.finalScore(), .001);
		assertEquals(92, book2.finalScore(), .001);
	}
	
	@After
	public void tearDown() throws Exception {
		book1 = null;
		book2 = null;
	}

}
