package listener;

import org.testng.AssertJUnit;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners( ListenerClass.class)

public class TestOfListener {
	
	@Test
	public void testMethod2() {
		System.out.println("testMethod2");
		AssertJUnit.assertTrue(false);
	}
	
	
	@Test(timeOut = 1000)
	public void testMethod3() throws Exception {
		Thread.sleep(2000);
		System.out.println("testMethod3");

}
}