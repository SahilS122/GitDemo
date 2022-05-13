package newPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestClass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ssardana\\Desktop\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		System.out.println(driver.findElements(By.xpath("//*[@type='checkbox']")).size());
		System.out.println(driver.findElement(By.cssSelector("input#checkBoxOption1")).isSelected());
		driver.findElement(By.cssSelector("input#checkBoxOption1")).click();
		Thread.sleep(2000);
		System.out.println(driver.findElement(By.cssSelector("input#checkBoxOption1")).isSelected());
		driver.findElement(By.cssSelector("input#checkBoxOption1")).click();
		Thread.sleep(2000);
		System.out.println(driver.findElement(By.cssSelector("input#checkBoxOption1")).isSelected());
		System.out.println("new changes");
		driver.close();

	}

}
