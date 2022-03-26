package org.y;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class hari {
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ELCOT\\eclipse-workspace\\alert\\sd\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		
		driver.findElement(By.xpath("//input[@maxlength='10']")).sendKeys("12e355");
		
		Thread.sleep(3000);
		
		WebElement button=driver.findElement(By.name("submit"));
		button.click();
		
        Alert alert = driver.switchTo().alert();
        String text=alert.getText();
        System.out.println(text);
        alert.accept();
        Thread.sleep(2000);
        
        Alert alert1 =driver.switchTo().alert();
       
        alert1.dismiss();
        
        
        
        
		//WebElement button2=driver.findElement(By.name("res"));
		//button2.click();
		
		
		
	}

}
