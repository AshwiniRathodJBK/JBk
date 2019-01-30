package AutoIt;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class XXX {

	@Test
	public void main() throws IOException, InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "Resource/chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		System.out.println(1);
		driver.get("file:///C:/Users/Ashwini/Desktop/jbk.html");
		driver.findElement(By.xpath("//input[@type='file'][@name='resume upload ']")).click();
		System.out.println(2);
		Runtime.getRuntime().exec("C:/Users/Ashwini/Desktop/javabykiran.exe");
		System.out.println(3);
		Thread.sleep(3000);
	}

}
