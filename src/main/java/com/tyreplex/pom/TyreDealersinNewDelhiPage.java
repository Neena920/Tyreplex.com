package com.tyreplex.pom;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TyreDealersinNewDelhiPage {
	
	WebDriver driver;

	
	@FindBy(xpath = "//a[contains(text(),'Tyresnmore.com ')]")
	private WebElement Tyresnmore;
	
	@FindBy(xpath = " //a[contains(text(),'ASAP Hardware solutions ')]")
	private WebElement ASAPHardwaresolutions;
	
	@FindBy(xpath = "//button[contains(text(),'View more')]")
	private WebElement viewmore;
	
	@FindBy(xpath = "//a[@title=\"Noida\"]")
	private WebElement Noida;
	
	@FindBy(xpath = "//a[@title=\"Loni\"]")
	private WebElement Loni;
	
	@FindBy(xpath = "(//span[@title=\"Choose Brand\"])[1]")
	private WebElement ChooseBrand;
	
	@FindBy(xpath = "//span[@title=\"Choose City\"]")
	private WebElement choosecity;
	
	@FindBy(xpath = "//button[@data-lbl=\"Tyre Dealer Filter Button\"]")
	private WebElement FindFDealersButton;
	
	@FindBy(xpath = "//span[contains(text(),'Search City')]")
	private WebElement searchcitydropdown;
	
	@FindBy(xpath = "//input[@aria-controls=\"select2-search-city-results\"]")
	private WebElement searchcity;
	
	@FindBy(xpath = "//span[@class=\"brand-logo brand-apollo\"]")
	private WebElement apollo;
	
	public TyreDealersinNewDelhiPage(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	
	
	public void SearchtyreDealer() {
		
		Actions act = new Actions(driver);
		act.moveToElement(ChooseBrand).click().perform();
        act.sendKeys(Keys.ARROW_DOWN).perform();
        act.sendKeys(Keys.ARROW_DOWN).perform();
        act.sendKeys(Keys.ENTER).perform();

		act.moveToElement(choosecity).click().perform();
        act.sendKeys(Keys.ARROW_DOWN).perform();
        act.sendKeys(Keys.ENTER).perform();
		act.moveToElement(FindFDealersButton).click().perform();
     
        driver.navigate().back();
		
	}
	
	public void Searchtyreinothercity() {
		
		Actions act = new Actions(driver);
		act.moveToElement(searchcitydropdown).click().perform();
		act.moveToElement(searchcity).click().perform();

		act.sendKeys("gurgaon").perform();
        act.sendKeys(Keys.ENTER).perform();    
        
        driver.navigate().back();

		
	}
	
	
	public void ApolloTyreDealer() {
		

		Actions act = new Actions(driver);
		act.moveToElement(apollo).click().perform();
		driver.navigate().back();
		
	}
	
	
	
	
	
	
	

}
