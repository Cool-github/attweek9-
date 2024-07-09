package week9;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class week9 {

	public static void main(String[] args) { 
		System.setProperty("webdriver.chrome.driver","D:\\OneDrive\\Desktop\\ATT\\chromedriver.exe"); 
		WebDriver driver=new ChromeDriver(); 
		driver.manage().window().maximize(); 
		driver.get("https://www.justdial.com/Hyderabad/Bakeries/nct-10033880"); 
		List<WebElement> m = driver.findElements(By.xpath("//h2[@class='jsx-98ac5e1b53154d9c resultbox_title font22 fw500 color111 complist_title']")); 
		for(int i = 0; i< m.size(); i++) { 
		String s = m.get(i).getText(); 
		System.out.println("Text is: " + s);
		 } 
		 } 

}


//jsx-98ac5e1b53154d9c resultbox_title font22 fw500 color111 complist_title
