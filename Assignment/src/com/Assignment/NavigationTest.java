package com.Assignment;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.security.PublicKey;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;

public class NavigationTest {
	WebDriver driver;
  
  @BeforeTest
  
  public void beforeTest() 
  {
	  System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe");
	  driver = new ChromeDriver();
  }
  
  @Test
  public void test() throws InterruptedException 
  {
	  
	  //Testcase1: Navigate to Home Page
	  driver.get("https://www.fitpeo.com/home");
	  
	//Testcase2: Navigate to Revenue calculator Page
	  driver.get("https://www.fitpeo.com/revenue-calculator");
	  
	 //Testcase3: Scroll Down to the Slider section
	  Boolean b1= driver.findElement(By.className("MuiSlider-root MuiSlider-colorPrimary MuiSlider-sizeMedium css-duk49p")).isDisplayed();
	  
	//Testcase4: Adjust the Slider
	  WebElement slider = driver.findElement(By.className("MuiSlider-root MuiSlider-colorPrimary MuiSlider-sizeMedium css-duk49p"));
	  Actions actions = new Actions(driver);
	  actions.dragAndDrop(slider, slider);
	  actions.dragAndDropBy(slider, 41, 0);
	  
	  //Testcase5: Update the Text Field
	  driver.findElement(By.id(":r0:")).clear();
	  driver.findElement(By.id(":r0:")).sendKeys("560");
	 
	  
  }

  @AfterTest
  public void afterTest() 
  {
	  driver.close();
	  driver.quit();
  }

}
