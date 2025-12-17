package com.tka.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//https://javabykiran.in/other/cc/
public class LandingPage {

	public static void main(String[] args) {

     WebDriver driver= new ChromeDriver();
     driver.manage().window().maximize();
     driver.get("https://javabykiran.in/other/CC/");
     //tc-1 verify that login link is display in the webpage.
     WebElement loginLink=driver.findElement(By.linkText("Login"));
     boolean isDisplay=loginLink.isDisplayed();
     if(isDisplay) {
    	 System.out.println("testcase pass");
     }else {
    	 System.out.println("testcase fail");    
     }
     //tc-2 check search text box enable to enter value or not
     WebElement txtsearch=driver.findElement(By.name("search[keywords]"));
     boolean isenable=txtsearch.isEnabled();
     if(isenable) {
      System.out.println("test case is pass and you are able to enter a value in search textbox");	 
     }else {
      System.out.println("test case is fail and you are not able to enter a value in search textbox"); 
     }
     //tc-3 check advance login link is clickable or not and if enabled then click on link
     WebElement linkadvanceSearch=driver.findElement(By.xpath("//*[@id=\"top_header\"]/div[2]/div[2]/div/div/form/div/div[1]/small/a"));
     boolean isEnable=linkadvanceSearch.isEnabled();
     boolean istrue=false;
     if(isEnable) {
    	 istrue=true;
    	 System.out.println("Advance link is enable for click");
    	 linkadvanceSearch.click();	 
     }else {
    	 System.out.println("advance click is not enable for click");
     }
     if(istrue) {
    	 System.out.println("testcase pass");
     }else {
    	 System.out.println("testcase fail");
     }
     String actualUrl=driver.getCurrentUrl();
     String expectedUrl="https://javabykiran.in/other/CC/search";
     if(actualUrl.equals(expectedUrl)) {
    	 System.out.println("testcase pass and page navigated to next page");
     }else {
    	 System.out.println("testcase fail");
     }
	
	}

}
