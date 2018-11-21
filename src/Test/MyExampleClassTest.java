import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;


public class MyExampleClassTest {
	@Before
	public void init () {
		System.out.println("è iniziato il test");
	}
	
	@Test
	public void testMultiply() {
		MyExampleClass tester = new MyExampleClass();
	//	assertEquals(2,tester.getNum(2)); 
		assertSame("suca",2.0,tester.getNum(2));
		 
		}
	  @Test(expected=java.lang.Exception.class)
	  public void nuovoTest() throws Exception {
	    System.out.println("Test nuovoTest");
	    assertTrue(true);
	    throw new Exception();
	  }
}
