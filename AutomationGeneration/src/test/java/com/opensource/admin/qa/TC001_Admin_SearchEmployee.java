package com.opensource.admin.qa;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;


public class TC001_Admin_SearchEmployee {
 
@BeforeTest
 public void beforeTest() {
//Datos
 }
@Test
  public void TC001_Admin_SearchEmployee_tc () {
Reporter.log("Open Browser \"OrangeHRM\" web page");
System.setProperty("webdriver.chrome.driver", "src\\test\\resources\\Drivers\\chrome\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.get("https://opensource-demo.orangehrmlive.com/");
driver.manage().window().maximize();
driver.manage().timeouts().i
//driver.close();
//step 1
Reporter.log("Enter Username and Password");
driver.findElement(By.xpath ("//input[@id='txtUsername']")).sendKeys("Admin");
driver.findElement(By.xpath ("//input[@id='txtPassword']")).sendKeys("admin123");
driver.findElement(By.xpath ("//input[@id='btnLogin']")).click();
  }
 

  @AfterTest
  public void afterTest() {
  }

}