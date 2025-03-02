package com.Tyreplex.test;

import java.io.IOException;
import org.openqa.selenium.chrome.ChromeOptions;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Ignore;

import com.tyreplex.pom.AlloyPage;
import com.tyreplex.pom.BatteriesPage;
import com.tyreplex.pom.CompareTyrespage;
import com.tyreplex.pom.HondaCity5thGenTyres;
import com.tyreplex.pom.MRFtyrespage;
import com.tyreplex.pom.LeadformPage;
import com.tyreplex.pom.TyreDealersinNewDelhiPage;
import com.tyreplex.pom.TyrePressurePage;
import com.tyreplex.pom.TyreplexHomepage;
import com.tyreplex.pom.TyreplexLoginPage;
import com.tyreplex.pom.ZGTX;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.cdimascio.dotenv.Dotenv;

public class Test {
	
	String baseUrl = "https://www.tyreplex.com/";
	
	
//	Dotenv dotenv = Dotenv.load();
	//String baseUrl = dotenv.get("BASE_URL");
	

	@Ignore
	@org.testng.annotations.Test(priority = 1)
	public void Login() throws InterruptedException {

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--headless=new");
		WebDriverManager.chromedriver().setup();
		org.openqa.selenium.WebDriver driver = new org.openqa.selenium.chrome.ChromeDriver(options);
		driver.get("https://www.tyreplex.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		TyreplexLoginPage login = new TyreplexLoginPage(driver);
		login.VerifyPageTitle();
		login.ClickLoginMethod();
		login.SearchMethod();
		login.BikeTyresmethod();
		login.CartyresMethod();
		login.TyrePressureLinkMethod();
		login.LoginMethod();
		TyreplexHomepage home = new TyreplexHomepage(driver);
		driver.quit();

	}

	@Ignore
	@org.testng.annotations.Test(priority = 2)
	public void Homepage() throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		org.openqa.selenium.WebDriver driver = new org.openqa.selenium.chrome.ChromeDriver();
		driver.get(baseUrl);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		TyreplexHomepage home = new TyreplexHomepage(driver);
		home.VerifyPageTitle();
		// home.search();
		home.choosebrandmethod();
		home.choosemodelmethod();
		// home.chooseVariantMethod();
		home.PopularTyreBrandsName();
		home.nameTyresForPopularVehicles();
		home.AllCity();

		// home.Search();
		home.Instagram();
		home.facebook();
		home.AreYouTyre();
		home.career();
		home.TermOfUse();
		home.ShippingAndReturnPolicy();

		driver.quit();

	}

	@Ignore
	@org.testng.annotations.Test(priority = 7)
	public void MRF() {

		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		org.openqa.selenium.WebDriver driver = new org.openqa.selenium.chrome.ChromeDriver();
		driver.get(baseUrl);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		TyreplexHomepage home = new TyreplexHomepage(driver);
		home.ClickMRF();

		MRFtyrespage mrf = new MRFtyrespage(driver);
		mrf.VerifyPageTitle();
		mrf.clickNYLOGRIPZAPPER();
		mrf.TyresNameAndPrice();
		mrf.MRFtyresFound();
		driver.quit();

	}

	@Ignore
	@org.testng.annotations.Test(priority = 9)
	public void Leadform() throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		org.openqa.selenium.WebDriver driver = new org.openqa.selenium.chrome.ChromeDriver();
		driver.get("https://delta.tyreplex.com/mrf-tyres/nylogrip-zapper");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		TyreplexHomepage home = new TyreplexHomepage(driver);
		// MRFtyrespage mrf = new MRFtyrespage(driver);
		// ZGTX zgtx = new ZGTX(driver); zgtx.CheckofferMethod();
		LeadformPage lead = new LeadformPage(driver);
		lead.clickImage();
		lead.checkOffers();

		lead.WriteReviewMethod();

		driver.quit();

	}

	@Ignore
	@org.testng.annotations.Test(priority = 8)
	public void PopularVehicles() throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		org.openqa.selenium.WebDriver driver = new org.openqa.selenium.chrome.ChromeDriver();
		driver.get(baseUrl);

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		TyreplexHomepage home = new TyreplexHomepage(driver);
		home.HondaCity5thGenTyresMethod();
		HondaCity5thGenTyres honda = new HondaCity5thGenTyres(driver);
		honda.VerifyPageTitle();
		honda.TyresForCity5Gen();
		honda.SearchChooseVariantforTyreSizeMethod();
		// honda.MostPopularMethod();
		// honda.popularTyreBrandsMethod();
		// honda.OtherCarTyres();

		// honda.tyrepressurelinkMethod();
		honda.FindTyresForCar();
		honda.PopularCities();
		honda.searchcityMethod();
		honda.viewNewsMethod();
		driver.quit();

	}

	@Ignore
	@org.testng.annotations.Test(priority = 10)
	public void City5thGenTyrePressure() throws InterruptedException, IOException {

		WebDriverManager.chromedriver().setup();
		org.openqa.selenium.WebDriver driver = new org.openqa.selenium.chrome.ChromeDriver();
		Thread.sleep(5000);
		driver.get(baseUrl);

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		TyreplexHomepage home = new TyreplexHomepage(driver);
		home.TyrePressureforHondaCity5thGenMethod();
		System.out.println(driver.getTitle());

		TyrePressurePage pr = new TyrePressurePage(driver);
		pr.TyreplexMethod();
		pr.searchfieldMethod();
		pr.viewmoreMethod();
		pr.TyrePressureForHondaCity5thGenMethod();
		pr.PopularTyresMethod();
		pr.TyrePressureImagesMethod();
		pr.TyrePressureforCity5thGenCompetitorsMethod();
		// pr.SearchTyrePressureforYourVehicleMethod();
		driver.quit();

	}
	
    @Ignore
	@org.testng.annotations.Test(priority = 3)
	public void AccessoriesPage() throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		org.openqa.selenium.WebDriver driver = new org.openqa.selenium.chrome.ChromeDriver();
		driver.get(baseUrl);

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		TyreplexHomepage home = new TyreplexHomepage(driver);
		home.AccessoriesMenuMethod();

		com.tyreplex.pom.AccessoriesPage ac = new com.tyreplex.pom.AccessoriesPage(driver);
		ac.GetDetailsAccessoroiesFound();
		// ac.filterHightoLow();
		ac.AddtoCartMethod();
		driver.quit();

	}

	@org.testng.annotations.Test(priority = 4)
	public void Batteries() throws InterruptedException {

		System.out.println(baseUrl);
		WebDriverManager.chromedriver().setup();
		org.openqa.selenium.WebDriver driver = new org.openqa.selenium.chrome.ChromeDriver();
		driver.get(baseUrl);

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		TyreplexHomepage home = new TyreplexHomepage(driver);
		home.BatteryMenuMethod();

		BatteriesPage battery = new BatteriesPage(driver);
		battery.VerifyPageTitle();
		battery.BatteryBrands();
		battery.Batterydetail();
		//battery.FindTheRightBatteryMethod();
		// battery.selectByCategoriesMethod();
		//driver.quit();

	}

	@Ignore
	@org.testng.annotations.Test(priority = 5)
	public void AlloysWheels() {

		WebDriverManager.chromedriver().setup();
		org.openqa.selenium.WebDriver driver = new org.openqa.selenium.chrome.ChromeDriver();
		driver.get(baseUrl);

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		TyreplexHomepage home = new TyreplexHomepage(driver);
		home.AlloysWheelsMethod();

		AlloyPage al = new AlloyPage(driver);
		al.AllAlloyBrand();
		al.VerifyPageTitle();
		al.SelectBrand();
		al.getDetailUnoAlloy();

		driver.quit();

	}

	@Ignore
	@org.testng.annotations.Test(priority = 7)
	public void SearchTyreDealerinYourCity() {

		WebDriverManager.chromedriver().setup();
		org.openqa.selenium.WebDriver driver = new org.openqa.selenium.chrome.ChromeDriver();
		driver.get(baseUrl);	
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		TyreplexHomepage home = new TyreplexHomepage(driver);
		home.SearchTyreDealerinYourCity();

		TyreDealersinNewDelhiPage d = new TyreDealersinNewDelhiPage(driver);
		d.SearchtyreDealer();
		d.Searchtyreinothercity();
		d.ApolloTyreDealer();
		driver.quit();

	}

	@Ignore
	@org.testng.annotations.Test(priority = 6)
	public void CompareTyres() {
		

		WebDriverManager.chromedriver().setup();
		org.openqa.selenium.WebDriver driver = new org.openqa.selenium.chrome.ChromeDriver();
		driver.get(baseUrl);

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		TyreplexHomepage home = new TyreplexHomepage(driver);
		home.More();

		CompareTyrespage com = new CompareTyrespage(driver);
		com.VerifyPageTitle();
		com.CompareButtonMethod();
		com.DisplayedTyreName();
		com.AddTyre();
		com.ContactDealer();
		driver.quit();

	}

}
