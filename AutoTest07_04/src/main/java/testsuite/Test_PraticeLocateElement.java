package testsuite;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.*;

import automation_common.CT_Pageurl;
import automation_common.CommonBase;

public class Test_PraticeLocateElement extends CommonBase {
	@BeforeMethod
	public void openFirefox() {
		driver = initDriverTest(CT_Pageurl.URL_ALADA);
	}

	@Test
	public void locateElement() {
		WebElement userNameElement = driver.findElement(By.id("txtLoginUsername"));
		System.out.println("userNameElement is: " + userNameElement);
	}
	
	@Test
	public void locateElementbyname() {
		WebElement pwElement = driver.findElement(By.name("txtLoginPassword"));
		System.out.println("passwordElement is: " + pwElement);
	}
	
	@Test
	public void locateElementbyClassName() {
		WebElement linkQuenMK = driver.findElement(By.className("link_register"));
		System.out.println("Link Dang ki is: " + linkQuenMK);
	}
	
	@Test
	public void locateElementbyTagName() {
		WebElement btDangNhap = driver.findElement(By.tagName("button"));
		System.out.println("Button Dang nhap is: " + btDangNhap);
	}
	
	@Test
	public void locateElementbyLinkText() {
		WebElement linkText = driver.findElement(By.linkText("Đăng nhập cho giảng viên"));
		System.out.println("linkText is: " + linkText);
	}
	
	@Test
	public void locateElementbyLinkText2() {
		WebElement linkText2 = driver.findElement(By.partialLinkText("giảng viên"));
		System.out.println("linkText is: " + linkText2);
	}
}
