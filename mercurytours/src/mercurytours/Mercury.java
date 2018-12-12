package mercurytours;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Mercury {
	WebDriver driver=new ChromeDriver();
@BeforeTest
	public void Test1() throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		
		driver.get("http://newtours.demoaut.com/");
		driver.manage().window().maximize();
		Thread.sleep(4000);
		String actualtitle=driver.getTitle();
		System.out.print("The title of the page is:"+actualtitle);
		//screenshot
		TakesScreenshot ts=(TakesScreenshot)driver;
		File file=ts.getScreenshotAs(OutputType.FILE);
		org.apache.commons.io.FileUtils.copyFile(file, new File("D:\\ambu\\mercury.jpeg"));
		System.out.println("Saved the screenshot");
}
		//for register feilds
		@Test(priority=1)
		public void Registration() { 
		
		 driver.findElement(By.xpath("//a[contains(text(),'REGISTER')]")).click();
		 driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("Ambika");
		 driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("Halappagol");
		 driver.findElement(By.xpath("//input[@name='phone']")).sendKeys("9885575458");
		 driver.findElement(By.xpath("//input[@id='userName']")).sendKeys("ambika@g,gmail.com");
		 driver.findElement(By.xpath("//input[@name='address1']")).sendKeys("Roza.k");
		 driver.findElement(By.xpath("//input[@name='city']")).sendKeys("Gulbarga");
		 driver.findElement(By.xpath("//input[@name='state']")).sendKeys("Karnataka");
		 driver.findElement(By.xpath("//input[@name='postalCode']")).sendKeys("585104");
		 driver.findElement(By.xpath("//select[@name='country']")).click();
		 driver.findElement(By.xpath("//select[@name='country']/option[4]")).click(); 
		
		 driver.findElement(By.xpath("//input[@id='email']")).sendKeys("Ambika");
		 driver.findElement(By.xpath("//input[@name='password']")).sendKeys("2823");
		 driver.findElement(By.xpath("//input[@name='confirmPassword']")).sendKeys("2823");
		 //Scroll Down
		 JavascriptExecutor js=(JavascriptExecutor)driver;
			js.executeScript("window.scrollBy(0,2500)");
			System.out.println("scrolled Down");
			 driver.findElement(By.xpath("//input[@name='register']")).click();
		}
			 //Flights
		@Test(priority=2)
		public void Flights() { 
		
			 driver.findElement(By.xpath("//a[contains(text(),'Flights')]")).click();
			
			 driver.findElement(By.xpath("//input[@value='roundtrip']")).click();

			 driver.findElement(By.xpath("//select[@name='passCount']")).click();
			 driver.findElement(By.xpath("//select[@name='passCount']/option[4]")).click(); 
			 driver.findElement(By.xpath("//select[@name='fromPort']")).click();
			 driver.findElement(By.xpath("//select[@name='fromPort']/option[3]")).click(); 
			 driver.findElement(By.xpath("//select[@name='fromMonth']")).click();
			 driver.findElement(By.xpath("//select[@name='fromMonth']/option[5]")).click(); 
			 driver.findElement(By.xpath("//select[@name='fromDay']")).click();
			 driver.findElement(By.xpath("//select[@name='fromDay']/option[11]")).click(); 
			 driver.findElement(By.xpath("//select[@name='toPort']")).click();
			 driver.findElement(By.xpath("//select[@name='toPort']/option[4]")).click(); 
			 driver.findElement(By.xpath("//select[@name='toMonth']")).click();
			 driver.findElement(By.xpath("//select[@name='toMonth']/option[1]")).click(); 
			 driver.findElement(By.xpath("//select[@name='toDay']")).click();
			 driver.findElement(By.xpath("//select[@name='toDay']/option[28]")).click(); 
			
			 driver.findElement(By.xpath("//input[@value='Coach']")).click();
			 driver.findElement(By.xpath("//select[@name='airline']")).click();
			 driver.findElement(By.xpath("//select[@name='airline']/option[2]")).click(); 
			 driver.findElement(By.xpath("//input[@name='findFlights']")).click();
			 driver.findElement(By.xpath("//input[@value='Blue Skies Airlines$361$271$7:10']")).click();	
			 driver.findElement(By.xpath("//input[@value='Blue Skies Airlines$631$273$14:30']")).click();
			 driver.findElement(By.xpath("//input[@name='reserveFlights']")).click();
		}

			 //book a flight
			 @Test(priority=2)
				public void FlightBook() { 
				

			 driver.findElement(By.xpath("//input[@name='passFirst0']")).sendKeys("Ambika");
			 driver.findElement(By.xpath("//input[@name='passLast0']")).sendKeys("Halappagol");

			 driver.findElement(By.xpath("//select[@name='pass.0.meal']")).click();
			 driver.findElement(By.xpath("//select[@name='pass.0.meal']/option[2]")).click(); 
			 
			 driver.findElement(By.xpath("//input[@name='passFirst1']")).sendKeys("Chinni");
			 driver.findElement(By.xpath("//input[@name='passLast1']")).sendKeys("Halappagol");

			 driver.findElement(By.xpath("//select[@name='pass.1.meal']")).click();
			 driver.findElement(By.xpath("//select[@name='pass.1.meal']/option[2]")).click(); 
			
			
			 driver.findElement(By.xpath("//input[@name='passFirst2']")).sendKeys("shantu");
			 driver.findElement(By.xpath("//input[@name='passLast2']")).sendKeys("matur");

			 driver.findElement(By.xpath("//select[@name='pass.2.meal']")).click();
			 driver.findElement(By.xpath("//select[@name='pass.2.meal']/option[2]")).click(); 
			
			 driver.findElement(By.xpath("//input[@name='passFirst3']")).sendKeys("kushi");
			 driver.findElement(By.xpath("//input[@name='passLast3']")).sendKeys("matur");

			 driver.findElement(By.xpath("//select[@name='pass.3.meal']")).click();
			 driver.findElement(By.xpath("//select[@name='pass.3.meal']/option[2]")).click(); 
			 
			 JavascriptExecutor js1=(JavascriptExecutor)driver;
				js1.executeScript("window.scrollBy(0,2500)");
				System.out.println("scrolled Down");

			 
			 
			 driver.findElement(By.xpath("//select[@name='creditCard']")).click();
			 driver.findElement(By.xpath("//select[@name='creditCard']/option[2]")).click(); 
			 driver.findElement(By.xpath("//input[@name='creditnumber']")).sendKeys("2462");

			 driver.findElement(By.xpath("//select[@name='cc_exp_dt_mn']")).click();
			 driver.findElement(By.xpath("//select[@name='cc_exp_dt_mn']/option[2]")).click(); 
			 driver.findElement(By.xpath("//select[@name='cc_exp_dt_yr']")).click();
			 driver.findElement(By.xpath("//select[@name='cc_exp_dt_yr']/option[8]")).click(); 
			 

			 driver.findElement(By.xpath("//input[@name='cc_frst_name']")).sendKeys("Ambika");
			 driver.findElement(By.xpath("//input[@name='cc_mid_name']")).sendKeys("veesha");
			 driver.findElement(By.xpath("//input[@name='cc_last_name']")).sendKeys("Halappagol");
			 

			 driver.findElement(By.xpath("//tbody//tr[12]//td[2]//input[1]")).sendKeys("Roza.k");
			 driver.findElement(By.xpath("//tbody//tr[14]//td[2]//input[1]")).sendKeys("Gulbarga");
			 driver.findElement(By.xpath("//tbody//tr[15]//td[2]//input[1]")).sendKeys("Karnataka");
			 driver.findElement(By.xpath("//tbody//tr[15]//td[2]//input[2]")).sendKeys("585108");


			 driver.findElement(By.xpath("//select[@name='billCountry']")).click();
			 driver.findElement(By.xpath("//select[@name='billCountry']/option[3]")).click();

			driver.findElement(By.xpath("//tbody//tr[18]//td[2]//input[1]")).sendKeys("Roza.k");
			 driver.findElement(By.xpath("//tbody//tr[20]//td[2]//input[1]")).sendKeys("Gulbarga");
			 driver.findElement(By.xpath("//tbody//tr[21]//td[2]//input[1]")).sendKeys("Karnataka");
			 driver.findElement(By.xpath("//tbody//tr[21]//td[2]//input[2]")).sendKeys("585108");


			 
			 driver.findElement(By.xpath("//input[@name='buyFlights']")).click();
			 JavascriptExecutor js2=(JavascriptExecutor)driver;
				js2.executeScript("window.scrollBy(0,2500)");
				System.out.println("scrolled Down");

			
			 driver.findElement(By.xpath("//img[@src='/images/forms/Logout.gif']")).click();
			 
			 }  
			 
			 
			 @AfterTest
			 public void close()
			 {
				 driver.close();
			 }
		
			
		 
	

}
