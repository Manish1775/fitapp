package appiumprac;


import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;

public class fitapp {
	
	
	static AppiumDriver driver;
	
public static void main(String[] args) {
    

	  try {
		openfit();
	} catch (Exception e) {
		e.getCause();
		e.getCause();
		e.printStackTrace();
	}
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

 }
   
  public static <MobileElement> void openfit() throws Exception {
	    
	  DesiredCapabilities cap = new DesiredCapabilities();

		cap.setCapability("deviceName","Redmi 8");
		cap.setCapability("udid","6261cd000706");
		cap.setCapability("platformName","Android");
		cap.setCapability("platformVersion","10");
		
		cap.setCapability("appPackage","tv.uscreen.walkathome");
		cap.setCapability("appActivity", "com.example.videoapp.MainActivity");

		
		 URL url = new URL("http://127.0.0.1:4723/wd/hub");
       driver = new AppiumDriver(url,cap);
		
       
		System.out.println("Application started...!");
	
		 Thread.sleep(10000);
		 driver.findElement(AppiumBy.xpath("//android.widget.Button[@content-desc=\"Not now\"]")).click();
		  
		 driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"Account Tab 2 of 2\"]")).click();
		 driver.findElement(By.id("Sign In")).click();
		 driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"Welcome back! Close\"]/android.view.View/android.widget.EditText[1]")).sendKeys("vermamanish1775@gmail.com");
		 driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"Welcome back! Close\"]/android.view.View/android.widget.EditText[2]")).sendKeys("Verma@123");
		 driver.findElement(By.id("Continue")).click();
		 
		 System.out.println("Login successfull...!");
		 
	
   }
}


