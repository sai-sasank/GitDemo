import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PS {

	@Test
	public void doThis()
	{
		System.out.println("I am here");
	}
	@BeforeMethod
	public void before()
	{
		System.out.println("Print me first");
	}

}
