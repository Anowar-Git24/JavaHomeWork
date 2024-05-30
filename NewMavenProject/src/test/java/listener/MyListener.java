package listener;



import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(listener.ListenerTest.class)
public class MyListener {

	@Test
	public void testCase1() {
		System.out.println("This is the A Normal Test Case -> ");
	}

	@Test
	public void testCase2() {
		System.out.println("This is the A Normal Test Case -> ");
	}

	@Test
	public void testCase3() {
		System.out.println("This is the A Normal Test Case -> ");
	}	
		
}	
		
		
		
		
		