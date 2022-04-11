package browsertesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.How;

import java.time.Duration;

public class ChromeBrowserTest {

    public static void main(String[] args) {
        //How to launch browser
        String baseUrl = "https://demo.nopcommerce.com/"; //
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");

        // Creating object
        WebDriver driver = new ChromeDriver(); //obj
        //Launch the URL
        driver.get(baseUrl);
        //to Maximize window
        driver.manage().window().maximize();
        //We give implicit time to drive
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        //Get title of the page
        String title = driver.getTitle();
        System.out.println("Title = " +title);
        // Get Current URL
        System.out.println("Current URL = " + driver.getCurrentUrl() );
        //
        String loginURL = "https://demo.nopcommerce.com/login?returnUrl=%2F";
        driver.navigate().to(loginURL);

        System.out.println("Current URL = " + driver.getCurrentUrl() );

        // to find email field element
       WebElement emailField = driver.findElement(By.id("Email")); // copy
        //sending email field element
       emailField.sendKeys("prime123@gmail.com");

       //Find the password field element
       WebElement passWordField = driver.findElement(By.name("Password"));
       //Sending password to password field element
       passWordField.sendKeys("Prine123");

       // to close the browser
        driver.close();
    }

}
