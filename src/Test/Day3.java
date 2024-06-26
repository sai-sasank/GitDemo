package Test;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class Day3 {
	@Test
	public void WebLoginHomeLoan()
	{
		System.out.println("WebLoginHome");
	}
	
	@BeforeSuite
	public void BFSuite()
	{
		System.out.println("Main hoon Khalnaayak");
	}
	@Parameters({"URL"})
	@Test
	public void MobileLoginHomeLoan(String urlname)
	{
		System.out.println("MobileLoginHome");
		System.out.println(urlname);
	}
	
	@Test
	public void LoginAPIHomeLoan()
	{
		System.out.println("APILoginHome");
	}
}
