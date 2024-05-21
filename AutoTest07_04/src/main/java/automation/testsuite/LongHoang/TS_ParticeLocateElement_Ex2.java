package automation.testsuite.LongHoang;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.*;

import automation_common.CT_Pageurl;
import automation_common.CommonBase;

public class TS_ParticeLocateElement_Ex2  extends CommonBase {
	@BeforeMethod
	public void openFirefox() {
		driver = initDriverTest(CT_Pageurl.URL_AUTOFC);
	}
	//ByID
	@Test
	public void nameElement() {
		WebElement nameEleID = driver.findElement(By.id("name"));
		System.out.println("Name is :"+nameEleID );
	}
	//By Name
	@Test
	public void nameElementN() {
		WebElement nameEleN = driver.findElement(By.name("name"));
		System.out.println("Name is :"+nameEleN );
	}
	//By linktext
	@Test
	public void nameElementLinkText() {
		WebElement nameEleLT = driver.findElement(By.linkText("Element is display"));
		System.out.println("link text is :"+ nameEleLT );
	}
	//By paritalLinkText
	@Test
	public void elementParitalLinkText() {
		WebElement elementParitalLinkText = driver.findElement(By.partialLinkText("Element is "));
		System.out.println("ParitalLinkText is :"+ elementParitalLinkText );
	}
	//by tagname
	@Test
	public void elementTagName() {
		WebElement elementTagName = driver.findElement(By.tagName("button"));
		System.out.println("TagName is :"+ elementTagName );
	}
	//by classname
	@Test
	public void elementClassName() {
		WebElement elementClassName = driver.findElement(By.className("number"));
		System.out.println("ClassName is :"+ elementClassName );
	}

}
