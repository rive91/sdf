package ng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NewTest {
  @Test
  public void test1() {
	  
	  String exePath = "./Driver/chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", exePath); //agregando la propiedad con la ruta del chrome driver
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
  }
}
