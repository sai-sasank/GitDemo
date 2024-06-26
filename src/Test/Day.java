package Test;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class Day {
	
	@AfterTest
	public void LastExecution()
	{
		System.out.println("I will execute last");
	}
	
	@Test

	public void Demo() {
		// TODO Auto-generated method stub
		System.out.println("Hello");

	}
	
	@Test
	public void Demo2()
	{
		System.out.println("Byee");
	}

}
