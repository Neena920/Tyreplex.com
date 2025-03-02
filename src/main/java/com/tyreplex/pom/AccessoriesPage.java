package com.tyreplex.pom;

import java.time.Duration;
import java.time.temporal.TemporalAmount;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccessoriesPage {
	
	WebDriver driver;
		
	@FindBy(xpath = "//h1[@class='product-big-title']")
	private WebElement productname;
	
	@FindBy(xpath = "(//div[@class=\"product-description col-sm-12 col-12 text-start px-0\"])[1]")
	private WebElement CBC_14;

	@FindBy(xpath = "//button[contains(text(),'Add to cart')]")
	private WebElement AddtoCartButton;
	
	@FindBy(xpath = "//span[contains(text(),' ₹ ')]")
	private WebElement productPrice;
	
	@FindBy(xpath = "(//span[@class=\"qty-inccrease\"])[2]")
	private WebElement qty_increase;
	
	@FindBy(xpath = "//span[@class=\"fa fa-cart\"]")
	private WebElement cartButton;
	
	@FindBy(xpath = "//button[contains(text(),'Remove')]")
	private WebElement removeButton;
	
	@FindBy(xpath = "//button[contains(text(),'Order Now')]")
	private WebElement ordernowButton;
	
	@FindBy(xpath = "(//button[@type=\"submit\"])[2]")
	private WebElement submitButton;
	
	@FindBy(xpath = "//span[@title=\"Brand By\"]")
	private WebElement Brandby;

	
	@FindBy(xpath = "//span[@title=\"Category By\"]")
	private WebElement CategoryBy;
	
	@FindBy(xpath = "//input[@aria-controls=\"select2-sortByCategory-results\"]")
	private WebElement CategoryBysearch;
	
	@FindBy(xpath = "//span[@title=\"Sort By\"]")
	private WebElement SortBy;
	
	@FindBy(xpath = "//span[@class=\"select2-search select2-search--dropdown\"]")
	private WebElement SortBysearch;
	
	@FindBy(xpath = "//input[@placeholder=\"Enter Pincode*\"]")
	private WebElement enterPincode;
	
	@FindBy(xpath = "//input[@name=\"name\"]")
	private WebElement entername;
	
	@FindBy(xpath = "//label[contains(text(),'Mobile Number')]")
	private WebElement enterMobile;

	@FindBy(xpath = "//span[contains(text(),'Price Low to High')]")
	private WebElement LowToHigh;
	
	@FindBy(xpath = "//li[contains(@class, 'selectProduct') and contains(@class, 'newListItem')]")
	private List<WebElement> AccessoriesList;
	
	public AccessoriesPage(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);

	}
	
	
	public void AddtoCartMethod() throws InterruptedException {
		
		CBC_14.click();
		AddtoCartButton.click();
		cartButton.click();
		ordernowButton.click();	
		enterPincode.sendKeys("110059,New Delhi");
		//entername.sendKeys("test");
	//	submitButton.click();
	//	enterMobile.sendKeys("7171717171");
	//	Thread.sleep(1000);

	}
	
	public void ProductDetail() {
		
		CBC_14.click();
		System.out.println("product Name: " + productname.getText());
		System.out.println("product price: " + productPrice.getText());
		
		qty_increase.click();
		System.out.println("increase Quantity");
		
	}
	
	public void filterHightoLow() throws InterruptedException {
		
		Actions act = new Actions(driver);
		act.moveToElement(Brandby).click().perform();
		Thread.sleep(3000);
		act.sendKeys(Keys.ARROW_DOWN).perform();
		Brandby.sendKeys(Keys.ENTER);


		act.moveToElement(CategoryBy).click().perform();
		act.sendKeys(Keys.ARROW_DOWN).perform();
		CategoryBy.sendKeys(Keys.ENTER);
	    

		act.moveToElement(SortBy).click().perform();
		act.sendKeys(Keys.ARROW_DOWN).perform();
		SortBy.sendKeys(Keys.ENTER);

					
	}
	
	  public void productsListed() {
		
		List<WebElement> productList = driver.findElements(By.xpath("//li[contains(@class,'items selectProduct newListItem')]"));
		
		System.out.println("Total products Found:" + productList.size() );
		
		for(WebElement product : productList) {
			
		String productName = product.findElement(By.xpath("//div[contains(@class,'text-dark')]")).getText();
			
		String productprice = product.findElement(By.xpath("//div[contains(@class,'product-price')]")).getText();
		
		System.out.println("product:" + productName + " price :" + productprice);			
			
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
	
		
	public void GetDetailsAccessoroiesFound() {
			
		for(int i=0;i<AccessoriesList.size();i++){
			
			System.out.println("List of Tyres and Prices:");	   	
	     	System.out.println("Tyrenames:" + AccessoriesList.get(i).getText() );
	    
	    }
			
	}
	
	
	
	
}
