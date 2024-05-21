package automation.testsuite.LongHoang;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.*;

import automation_common.CT_Pageurl;
import automation_common.CommonBase;

public class TS_PraticeLocateElement extends CommonBase {
	@BeforeMethod
	public void openFirefox() {
		driver = initDriverTest(CT_Pageurl.URL_SLHUB);
	}
	
	@Test
	public void emailElement() {
		WebElement mailElement = driver.findElement(By.name("email"));
		System.out.println("EmailElement's name is : " + mailElement);
	}
	@Test
	public void passWordElementID() {
		WebElement pwElementID = driver.findElement(By.id("pass"));
		System.out.println("EpassWordElemen's ID is : " + pwElementID);
	}
	@Test
	public void passWordElementName() {
		WebElement pwElementName = driver.findElement(By.name("Password"));
		System.out.println("EpassWordElemen's name is : " + pwElementName);
	}
	@Test
	public void companyElementName() {
		WebElement companyElementName = driver.findElement(By.name("company"));
		System.out.println("EpassWordElemen's name is : " + companyElementName);
	}
}
