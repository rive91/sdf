package sekTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeltTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String exePath = "./Driver/chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", exePath); //agregando la propiedad con la ruta del chrome driver
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
	}

}
