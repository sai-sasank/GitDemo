import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class Day3 {
	@Parameters({"Url","APIKey/usrname"})
	@Test
	public void WebLoginHomeLoan(String urlname,String Key)
	{
		System.out.println("WebLoginHome");
		System.out.println(urlname);
		System.out.println(Key);
	}
	
	@BeforeSuite
	public void BFSuite()
	{
		System.out.println("Main hoon Khalnaayak");
	}
	
	@Test(groups= {"smoke"})
	public void MobileLoginHomeLoan()
	{
		System.out.println("MobileLoginHome");
	}
	
	@Test
	public void LoginAPIHomeLoan()
	{
		System.out.println("APILoginHome");
	}
}
