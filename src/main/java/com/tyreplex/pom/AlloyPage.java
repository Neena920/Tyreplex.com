package com.tyreplex.pom;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AlloyPage {

    WebDriver driver;
    
	@FindBy(xpath = "//span[contains(text(),'Select Brands')]")
	private WebElement dropdown;
	
	@FindBy(xpath = "//a[contains(text(),' Find')]")
	private WebElement find;

	@FindBy(xpath = "//span[@class=\"alloy_brand_logo brand-uno-minda\"]")
	private WebElement UNOminda;

	@FindBy(xpath = "(//ul[contains(@class,'carousel')])[1]")
	private List<WebElement> brandslist;
	
	
	public AlloyPage(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

   public void VerifyPageTitle() {
	   
	   String expectedTitle = "Top-Quality Alloys at TyrePlex: Get Reliable Alloy for Your Vehicle";
	   String actualTitle = driver.getTitle();
	   if(actualTitle.contains(expectedTitle)) {
		   
		   System.out.println("Page title verified " );		   
	   }
	   else {
		   
		   System.out.println("Title mismatch " );	   
		   
	   }
	      
   }
	
	
   public void SelectBrand() {
	   
	   try {
		   
		   dropdown.click(); 
		   		
	} catch (Exception e) {
		
		System.out.println("Dropdown not found or could not be clicked");
	}
	   	   
	   
	   try {
		
		   Actions act = new Actions(driver);
		   act.moveToElement(dropdown).click().perform();
		   act.sendKeys(Keys.ARROW_DOWN);
		   act.sendKeys(Keys.ENTER);
		   find.click();

		   
	} catch (Exception e) {
		
		System.out.println("error select dropdown");
	}
	     	   
   }
   
   public void AllAlloyBrand() {
	   
	  		
		for (WebElement brand : brandslist) {
			
			System.out.println(brand.getText());	   
	   
   }
       
   } 
	
   public void getDetailUnoAlloy() {
	   
   UNOminda.click();   
   WebElement al = driver.findElement(By.xpath("/html/body/main/div/div/div[3]/ul/li[1]/div/a/div/div[1]/div/div[2]\r\n"));
	   
	   System.out.println(al.getText());
	   
   }
   
   
   
   
	
	
}
