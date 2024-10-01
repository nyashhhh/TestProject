package Demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class De {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver =new ChromeDriver();
driver.get("https://www.youtube.com/");
driver.manage().window().minimize();
System.out.println("Executed Successfully");
	}

}
