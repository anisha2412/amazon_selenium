package AmazonTestCases;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.awt.Window;
import java.time.Duration;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v127.browser.Browser.GetWindowForTargetResponse;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import AutomationCore.BaseClass;

public class TestCases extends BaseClass
{
	WebDriver driver;     // object declaration
	
	@BeforeMethod( groups = {"regressiontest" , "smoketesting"} )        //annotation	
	@Parameters({"browser"})
	public void initialization(String browsername) throws Exception 
	{
		driver = browserinitailzation(browsername);     // fetching driver object from base class method
		driver.get("https://www.amazon.in/");        	// browser url
		driver.manage().window().maximize();         	// page maximize
		System.out.println("BeforeMethod example");
	}
	
	@Test(priority = 3)
	public void tc01() throws InterruptedException           // test case
	{				
		System.out.println("Test Case - tc01");
		
//id locator
		
//		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Iphone");
//		driver.findElement(By.id("nav-search-submit-button")).click();	
//		Assert.assertEquals(driver.findElement(By.xpath("//span[text()='Apple iPhone 13 (128GB) - Starlight']")).isDisplayed(), true);    // Hard assertion, true - expected result	
//		driver.findElement(By.id("twotabsearchtextbox")).clear();              //clear text box value

		
//name locator
		
		//driver.findElement(By.name("field-keywords")).sendKeys("Brush");
		//driver.findElement(By.id("nav-search-submit-button")).click();
		
//oct 15 - class locator, linkText, Partail LinkText
		
		//driver.findElement(By.className("a-button-input")).click();
		//driver.findElement(By.linkText("Conditions of Use")).click();
		//driver.findElement(By.partialLinkText("Conditions of")).click();
		
//xpath - relative xpath 
		
		//driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).clear();
		//driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Fan");
		//driver.findElement(By.id("nav-search-submit-button")).click();
		
//relative xpath indexing
		
		//driver.findElement(By.xpath("(//input[@class='nav-input nav-progressive-attribute'])[1]")).sendKeys("Fan");
		//driver.findElement(By.id("nav-search-submit-button")).click();
		
//contains relative xpath
		
		//driver.findElement(By.name("field-keywords")).sendKeys("Brush");
		//driver.findElement(By.xpath("//input[contains(@id,'search')])[2]")).click();
		//driver.findElement(By.xpath("//input[contains(@id,'search')]")).sendKeys("Fan");
		
//starts-with() relative xpath
		
		//driver.findElement(By.xpath("(//span[starts-with(@id,'glow')])[2]")).click();
		
//text() relative xpath
		
		//driver.findElement(By.xpath("//a[text()='Privacy Notice']")).click();
		
// OR and AND relative xpath
		
		//driver.findElement(By.xpath("//input[@id=’continue’ and @class=’a-button-input’]")).click();
		//driver.findElement(By.xpath("//input[@id=’continue’ or @class=’a-buttoninput’]")).click();
		
//oct - 17 - following , ancestors, child
		
		//driver.findElement(By.xpath("//div[@class='a-fixed-left-grid-col a-col-right']//following::input")).sendKeys("2345");       //amazon reg page mob num feild
		//driver.findElement(By.xpath("(//div[@class='a-fixed-left-grid-col a-col-right']//following::input)[1]")).sendKeys("2345");  //by indexing
				
		//amazon reg page - h1 heading 'Create Account' pointing outer div
		//driver.findElement(By.xpath("(//h1[@class='a-spacing-small moa_desktop_signup']//ancestor::div)[7]")); 
			
		// to avoid indexing use contains for 2nd tagname
		//driver.findElement(By.xpath("//h1[@class='a-spacing-smallmoa_desktop_signup']//ancestor::div[contains(@class,'spacing')]"));
			
		// amazon reg page - verify mob num input button
		//driver.findElement(By.xpath("//span[@class='a-button-inner']//child::input")); 
		
//oct 21 - getText()
		
		//String value = driver.findElement(By.id("nav-link-accountList-nav-line-1")).getText(); 		
		//System.out.println(value);
		
//getAttribute()
		
		//String value1 = driver.findElement(By.name("field-keywords")).getAttribute("placeholder"); 
		//System.out.println(value1);
					
//oct 22 - dropdown automation
		
		//driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Smart Tv");
		//driver.findElement(By.id("nav-search-submit-button")).click();
		
		// button,label ,textbox ,dropdown are called WebElement, there retrun type is WebElement
		
		//WebElement dropdown = driver.findElement(By.id("s-result-sort-select")); // var to hold dropdown
		//Select drp = new Select(dropdown);   // Select is class and drp is its object
		
		//select by value
		//drp.selectByValue("review-rank");  // inside <li> tag --> <a> tag value attribute
		//driver.findElement(By.xpath("//h2[text()='Results']")).click();  // to deselect dropdown , just click somewhere in the page, here its a heading 
		
        //select by visble text
		//drp.selectByVisibleText("Price: Low to High");
		
		//select by index - 0th index
		//drp.selectByIndex(0); 
		
//---------------------------------------------------------------------------------------------------------------------------	
//if no <select> tag  dropdown automation [on hold due to some error]
		
	/*	driver.navigate().to("https://www.makemytrip.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='ACCEPT']")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("fromCity")).click();
		Thread.sleep(2000); */
		
		// click dropdowon search box
		/*
		driver.findElement(By.xpath("(//div[@id='react-autowhatever-1']//preceding::input)[2]")).sendKeys("Mumbai");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Mumbai']")).click();    */
//-----------------------------------------------------------------------------------------------------------------------------
		
		
// oct 23 - checkbox & radio buttons, isEnabled(),isDisplayed()
		
/*		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Smart Tv");
		driver.findElement(By.id("nav-search-submit-button")).click();	
		driver.findElement(By.xpath("(//i[@class='a-icon a-icon-checkbox'])[7]")).click(); // check 7th checkbox filter
		
		driver.findElement(By.xpath("(//span[@class='nav-line-2'])[1]")).click();        // click lang button to goto lang selection page
		driver.findElement(By.xpath("(//i[@class='a-icon a-icon-radio'])[6]")).click();  // click malayalam radio button
		driver.findElement(By.className("a-button-input")).click();                      // click save changes button
		
		boolean status= driver.findElement(By.id("icp-save-button-announce")).isEnabled();  //checking save changes button is enabled, if yes return true else false
		System.out.println(status);
		
		boolean status1 = driver.findElement(By.id("icp-save-button-announce")).isDisplayed();  //checking savechanges button text is displayed
		System.out.println(status1);
*/
		
//oct 24 -  FindElements, alert handling
		
/*		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Smart Tv");;
		driver.findElement(By.id("nav-search-submit-button")).click();		
		List<WebElement> products = driver.findElements(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']"));
		System.out.println(products.size());		
		
		driver.navigate().to("https://demo.guru99.com/test/delete_customer.php");
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("12323");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(1000);
		driver.switchTo().alert().accept();
		driver.switchTo().alert().dismiss();
		driver.switchTo().alert().getText();
		driver.switchTo().alert().sendKeys("asasa");
/*
				
//oct 25 - Actions class - drag & drop, dbl click, rightclk, moveto[hover]
		
/*		driver.navigate().to("https://the-internet.herokuapp.com/drag_and_drop");
		Actions actions =new Actions(driver);                             //action class object	
		WebElement source = driver.findElement(By.id("column-a"));        //dragging element [A]
		WebElement destination = driver.findElement(By.id("column-b"));   //droping place [B]
		
		actions.dragAndDrop(source, destination).build().perform();     //drag and drop	
		actions.doubleClick(driver.findElement(By.xpath("//a[text()='Elemental Selenium']"))).build().perform();	
		actions.contextClick().build().perform();  //right click
				
		driver.navigate().to("https://www.amazon.in/");              // mouse over
		actions.moveToElement(driver.findElement(By.id("nav-link-accountList-nav-line-1"))).build().perform(); 
		actions.moveToElement(driver.findElement(By.className("icp-nav-link-inner"))).build().perform();  
*/
		
//keyborad events - enter click
		
/*		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Smart Tv");
		driver.findElement(By.id("nav-search-submit-button")).click();		
		WebElement dropdown1 = driver.findElement(By.id("s-result-sort-select")); 
		Select drp1 = new Select(dropdown1);   
		drp1.selectByValue("review-rank"); 
		Actions actions1 =new Actions(driver); 
		actions1.sendKeys(Keys.ENTER).build().perform();
		actions1.sendKeys(Keys.CONTROL).build().perform();
*/

//press and hold key, release holded key
		
		//actions1.keyDown(Keys.CONTROL).build().perform();
		//actions1.keyUp(Keys.CONTROL).build().perform();
		
		//actions1.build().perform();  - to avoid repeating this code give it like this at last

//Handling Multiple Windows [tabs]

/*
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Smart Tv");
		driver.findElement(By.id("nav-search-submit-button")).click();
		driver.findElement(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])[1]")).click();	//clicking on 1st item name
		
		String parentWindow = driver.getWindowHandle();       // finding parent tab address
		Set<String> childWindow = driver.getWindowHandles();  // here there is many address of tabs, so convert string type to set
		for(String actual:childWindow) {                      // looping child window
			if(!actual.equalsIgnoreCase(parentWindow)) {      // check if parent and child window names are different
				driver.switchTo().window(actual);
				driver.findElement(By.id("add-to-cart-button")).click();        // add to cart click
				Thread.sleep(2000);
			}
		}
		driver.switchTo().window(parentWindow);              // switch back to parent window
		driver.navigate().refresh();                         // refresh page
*/		

// oct 28 -  JavascriptExecutor - scroll, element click [ Handling Multiple Windows ]
		
/*		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Smart Tv");
		driver.findElement(By.id("nav-search-submit-button")).click();
		driver.findElement(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])[1]")).click();	
		
		String parentWindow = driver.getWindowHandle();       
		Set<String> childWindow = driver.getWindowHandles();  
		for(String actual:childWindow) {                      
			if(!actual.equalsIgnoreCase(parentWindow)) {    
				driver.switchTo().window(actual);				
				JavascriptExecutor js = (JavascriptExecutor) driver;
				js.executeScript("window.scrollBy(0,250)");                                   // scroll page
				Thread.sleep(2000);
				WebElement addToCartButton = driver.findElement(By.id("add-to-cart-button")); // storing to a var 
				js.executeScript("arguments[0].click()",addToCartButton);                     // js element click code				
				Thread.sleep(2000);
			}
		}
		driver.switchTo().window(parentWindow);              
		driver.navigate().refresh();   
*/                      

// oct 29 -  waits [ Handling Multiple Windows ] , annotaions
/*		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Smart Tv");
		driver.findElement(By.id("nav-search-submit-button")).click();
		driver.findElement(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])[1]")).click();	
				
		String parentWindow1 = driver.getWindowHandle();       
		Set<String> childWindow1 = driver.getWindowHandles();  
		for(String actual:childWindow1) {                      
			if(!actual.equalsIgnoreCase(parentWindow1)) {    
				driver.switchTo().window(actual);				
				JavascriptExecutor js = (JavascriptExecutor) driver;
				js.executeScript("window.scrollBy(0,250)");                                   // scroll page
								
				//explicit wait
				WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));                          // webDriverWait class obj
				wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("add-to-cart-button"))));   // specify reason for waiting
						
				WebElement addToCartButton = driver.findElement(By.id("add-to-cart-button")); // storing to a var 
				js.executeScript("arguments[0].click()",addToCartButton);                     // js element click code				
				Thread.sleep(2000);
			}
		}
		driver.switchTo().window(parentWindow1);              
		driver.navigate().refresh();  
*/		
	
 }                                      //testcase 1 end----------------------------------------
	
//oct 21 - navigation & commands
	

    @Test(priority = 2 , groups = {"smoketest"})	
	public void tc02()          
	{	
    	System.out.println("Test Case 2 - tc02 ");
    	
//		driver.navigate().to("https://www.flipkart.com/");
//		driver.navigate().to("https://www.ajio.com/");
//		driver.navigate().back();
//		driver.navigate().forward();
//		driver.navigate().refresh();		
	} 	

	
// oct 29 - TestNG Annotations
	
/*	
	@BeforeSuite
	public void beforeSuitMethodEx() {
		System.out.println("Before Suit");
	}
	
	@AfterSuite
	public void afterSuitMethodEx() {
		System.out.println("After Suit");
	}   
	
	@BeforeTest
	public void beforeTestMethodEx() {
		System.out.println("Before Test");
	}
	
	@AfterTest
	public void afterTestMethodEx() {
		System.out.println("After Test");
	}
*/
	
//oct 30 - BeforeMethod, AfterMethod, BeforeClass, AfterClass, BeforeGroups, AfterGroups
	 
  
	@AfterMethod
	public void tearDown() {
		driver.quit();                                       //close browser after test case run
		System.out.println("AfterMethod example");
	} 
	
	/*	
	 * 
	@BeforeClass
	public void beforeClassEx() {
		System.out.println("BeforeClass example");
	}
	
	@AfterClass
	public void afterClassEx() {
		System.out.println("AfterClass example");
	}	
	
	@BeforeGroups
	public void beforeGroupsEx() {
		System.out.println("BeforeGroups example");
	}
	
	@AfterGroups
	public void afterGroupsEx() {
		System.out.println("AfterGroups example");
	}  
	
*/
    
// nov 4 - priority , assertion [hard ,soft]
  

    @Test(priority = 1, groups = {"smoketest"})
	public void tc03() 
    {
    	System.out.println("Test case 3 - tc03 ");
    	
//		driver.findElement(By.id("nav-link-accountList-nav-line-1")).click();
//		SoftAssert softassert = new SoftAssert();                                             // obj
//		softassert.assertEquals(driver.findElement(By.id("continue")).isDisplayed(), true);   //soft assertion	
//		softassert.assertEquals(driver.findElement(By.xpath("//h1[@class='a-spacing-small']")).getText(), "\r\n"
//			+ "            Sign in\r\n"
//				+ "          ");                    // string comparing - both hard and soft assertion		
//		
//		softassert.assertAll();                     // mandatory step at last
	} 
    
    
// product add to cart visiblity verification	
	
    @Test(retryAnalyzer = AmazonTestCases.RetryAnalyser.class , groups = {"regressiontest"})     // implementation of retry analyser
    public void tc04()  
    {
    	System.out.println("Test Case - tc04");
        		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Bag");
		driver.findElement(By.id("nav-search-submit-button")).click();
		
		/*	  
		driver.findElement(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])[3]")).click();
		String parentWindow = driver.getWindowHandle(); Set<String> childWindow =
		driver.getWindowHandles(); for(String actual:childWindow) 
		{
			if(!actual.equalsIgnoreCase(parentWindow)) 
			{
				driver.switchTo().window(actual);
				driver.findElement(By.id("add-to-cart-button")).click(); 
			} 
		}
		driver.switchTo().window(parentWindow); driver.navigate().refresh();
				  
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("nav-cart-count-container"))));
				  
		driver.findElement(By.id("nav-cart-count-container")).click();
				  
		SoftAssert softassert = new SoftAssert();
		softassert.assertEquals(driver.findElement(By.xpath("//span[text()='Skybags Casual Standard Backpack 28L, 2 Main Compartments,"
				+ " Bottle Pocket, Front Pocket, Padded Shoulder Straps | Black |…']")).getText(),"Skybags Casual Standard Backpack 28L,"
				+ " 2 Main Compartments, Bottle Pocket, Front Pocket, Padded Shoulder Straps | Black |…"); 
		softassert.assertAll();   */
		 
    }
    
 // nov 7 - data provider, paralell testing   
 
    /*
     
    @Test(dataProvider = "data")                                       // integrating test case with data provider
    public void tc05(String username,String password)                   // parameters
    {
    	System.out.println("Test cases - tc05");
    	
    	driver.navigate().to("http://demo.guru99.com/V1/index.php");  //load page
    	driver.findElement(By.name("uid")).sendKeys(username);        //enter username & password stored in parameter
    	driver.findElement(By.name("password")).sendKeys(password);
    	driver.findElement(By.name("btnLogin")).click();                    	
    }
    
	  //data provider
	   
	  @DataProvider(name = "data")                     // data provider annotation and its name 
	  public Object[][] getUserData(){
		  return new  Object[][]  {                    // multidimensional array 3 row,2 column
			  {"username1" , "password1"},
			  {"username2" , "password2"},
			  {"username3" , "password3"},
		  };
	  }  */
    
    
  @Test(groups = {"regressiontest"})
  public void tc06() {
	  System.out.println("Test cases - tc06");
  }
    
	
}
