

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class AmazonSelectAspecialItemDropDown {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		  
		WebElement drop = driver.findElement(By.id("searchDropdownBox"));
		
		List<WebElement> dropList = drop.findElements(By.tagName("option"));
		
		System.out.println( "Total dropList item:" + dropList.size());
		for(int i=0; i<dropList.size(); i++) {
			if(dropList.get(i).getText().equalsIgnoreCase("Baby"));
	
		dropList.get(i).click();
	
		}
	}

}
