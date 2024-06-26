import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class Day2 {
	@BeforeClass
	public void beforeclass()
	{
		System.out.println("i will execute before class");
	}
	@AfterClass
	public void afterclass()
	{
		System.out.println("i will execute after class");
	}
	@Test(groups= {"smoke"})
	public void WebLoginCarLoan()
	{
		System.out.println("WebLoginCar");
	}
	
	@Test
	public void MobileLoginCarLoan()
	{
		System.out.println("MobileLoginCar");
	}
	@BeforeMethod
	public void BFMethod()
	{
		System.out.println("I will execute before every method in this class");
	}
	@AfterMethod
	public void AFMethod()
	{
		System.out.println("I will execute after every method in this class");
	}
	@Test
	public void MobileSigninCarLoan()
	{
		System.out.println("MobileSigninCar");
	}
	
	@Test(dataProvider = "GetData")
	public void MobileSignOutCarLoan(String username, String password)
	{
		System.out.println("MobileSignOutCar");
		System.out.println(username);
		System.out.println(password);
	}
	
	@Test
	public void MobileEnterCarLoan()
	{
		System.out.println("MobileEnterCar");
	}
	
	@Test(dependsOnMethods= {"WebLoginCarLoan"})
	public void APICarLoan()
	{
		System.out.println("APILoginCar");
	}
	@DataProvider
	public Object[][] GetData()
	{
		Object[][] data= new Object[3][2];
		
		data[0][0] = "firstsetusername";
		data[0][1] = "firstpassword";
		
		data[1][0] = "secondsetusername";
		data[1][1] = "secondpassword";
		
		data[2][0] = "thirdsetusername";
		data[2][1] = "thirdpassword";
		return data;
	}

}
