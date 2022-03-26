package org.y;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class task2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ELCOT\\eclipse-workspace\\alert\\sd\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
		WebElement button3=driver.findElement(By.id("promtButton"));
		button3.click();
		
		Alert alert2=driver.switchTo().alert();
		alert2.sendKeys("karthikesan");
		String text1=alert2.getText();
		System.out.println(text1);
		alert2.accept();
		WebElement button=driver.findElement(By.id("promptResult"));
		String v=button.getText();
		System.out.println(v);
		

	}

}
