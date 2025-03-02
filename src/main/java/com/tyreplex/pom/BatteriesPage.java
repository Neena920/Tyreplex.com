package com.tyreplex.pom;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BatteriesPage {

	
	WebDriver driver;


	@FindBy(xpath = "//span[@title=\"Select Categories\"]")
	private WebElement selectcategories;
	
	@FindBy(xpath = "(//li[contains(text(),'Car')])[1]")
	private WebElement car;
	
	@FindBy(xpath = "//input[@aria-controls=\"select2-battery_category-results\"]")
	private WebElement searchselectcategories;
	
	@FindBy(xpath = "//span[contains(text(),'Select Brands')]")
	private WebElement selectbrands;
	
	@FindBy(xpath = "//a[contains(text(),' Find')]")
	private WebElement find;
	
	@FindBy(xpath = "//a[@title=\"INVA GOLD\"]")
	private WebElement productname;
	
	@FindBy(xpath = "//span[@class=\"battery_brand_logo brand-amaron\"]")
	private WebElement Amaron;
	
	@FindBy(xpath = "//a[@title=\"HCV\"]")
	private WebElement HCV;
	
	@FindBy(xpath = "(//div[@class=\"d-flex align-items-center\"])[3]")
	private WebElement AdwinHARIT;
	
	@FindBy(xpath = "//button[contains(text(),'Add to cart')]")
	private WebElement Addtocartbutton;
	
	@FindBy(xpath = "(//span[@class=\"qty-increase\"])[2]")
	private WebElement qty_increase;
	
	@FindBy(xpath = "(//span[@class=\"qty-decrease\"])[2]")
	private WebElement qty_decrease;
	
	@FindBy(xpath = "//span[@class=\"fa fa-cart\"]")
	private WebElement cartButton;
	
	@FindBy(xpath = "//button[contains(text(),'Remove')]")
	private WebElement removeButton;
	
	@FindBy(xpath = "//button[contains(text(),'Order Now')]")
	private WebElement ordernowButton;
	
	@FindBy(xpath = "(//button[@type=\"submit\"])[2]")
	private WebElement submitButton;
	
	@FindBy(xpath = "//input[@placeholder=\"Enter Pincode*\"]")
	private WebElement enterPincode;
	
	@FindBy(xpath = "//div[contains(text(),'110065, New Delhi')]")
	private WebElement pincode;
	
	@FindBy(xpath = "//input[@name=\"name\"]")
	private WebElement entername;
	
	@FindBy(xpath = "//label[contains(text(),'Mobile Number')]")
	private WebElement enterMobile;
	
	@FindBy(xpath = "//span[contains(text(),'00034B20R')]")
	private WebElement productvarient;
	
	public BatteriesPage(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);

	}
	
	public void FindTheRightBatteryMethod() throws InterruptedException {
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,300)");
		
		Actions act = new Actions(driver);
		act.moveToElement(selectcategories).click().perform();

		//.executeScript("arguments[0].click();", selectcategories);
		System.out.println("done");
		Thread.sleep(4000);
		act.moveToElement(searchselectcategories).click().perform();

		System.out.println("done");

		searchselectcategories.sendKeys("wheeler");
		
	}

	
	public void Batterydetail() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", Amaron);
		
		Thread.sleep(2000);
		productname.click();
     	System.out.println( "product name :" + productname.getText());
       // System.out.println( "Battery varient :" + productvarient.getText());
		
		//  qty_increase.click(); qty_increase.click(); qty_decrease.click();
		 
     	
     //	System.out.println("inc or dec quantity");
     	
      //   WebElement quantitybox = 	driver.findElement(By.xpath("//input[@type='number']"));
      //   System.out.println("current quantity:" + quantitybox.getAttribute("value"));
         	
     	
	}
	
	
	
	public void selectByCategoriesMethod() throws InterruptedException {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,4000)");
		js.executeScript("arguments[0].click();", HCV);
		js.executeScript("arguments[0].click();", AdwinHARIT);
		js.executeScript("arguments[0].click();", Addtocartbutton);
		js.executeScript("arguments[0].click();", qty_increase);
		js.executeScript("arguments[0].click();", cartButton);
		js.executeScript("arguments[0].click();", ordernowButton);
		enterPincode.sendKeys("110059,New Delhi");
		Thread.sleep(3000);
		//tions act = new Actions(driver);
		//t.moveToElement(pincode).click().perform();
		entername.sendKeys("test");
		enterMobile.sendKeys("7171717171");
		
	}
	
	
	public void BatteryBrands() {
		
		List<WebElement> brandElements = driver.findElements(By.xpath("//a[contains(@class,'custom-card mb-3')]"));
		
		for (WebElement brand : brandElements) {
			
			System.out.println(brand.getText());
			
		}

	}
	

	   public void VerifyPageTitle() {
		   String s = driver.getTitle();
		   
		   String expectedTitle = s;
		   String actualTitle = driver.getTitle();
		   if(actualTitle.contains(expectedTitle)) {
			   
			   System.out.println("Page title verified " );		   
		   }
		   else {
			   
			   System.out.println("Title mismatch " );	   
			   
		   }
		      
	   }
	
	
	
	
	
	
}
