import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class Day {
	
	@AfterTest
	public void lastexecution()
	{
		System.out.println("this will execute last");
	}
	@Test(groups= {"smoke"})

	public void Demo() {
		// TODO Auto-generated method stub
		System.out.println("Hello");

	}
	
	@AfterSuite
	public void AfSuite()
	{
		System.out.println("Main hoon Don");
	}
	
	@Test
	public void Demo2()
	{
		System.out.println("Byee");
	}
	@BeforeTest
	public void prerequisite()
	{
		System.out.println("This will execute first");
	}
}
