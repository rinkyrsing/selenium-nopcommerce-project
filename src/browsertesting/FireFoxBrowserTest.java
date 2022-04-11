package browsertesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class FireFoxBrowserTest {

    public static void main(String[] args) {
        //How to launch browser
        String baseURL = "https://demo.nopcommerce.com/login?returnUrl=%2F";
        System.setProperty("webdriver.gecko.driver", "drivers/geckodriver.exe");
        //Object
        WebDriver driver = new FirefoxDriver();

        //Launch the URL
        driver.get(baseURL);

        // to Maximize window
        driver.manage().window().maximize();

        //We give implicit time to drive
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        //Get title of the page
        String title = driver.getTitle();
        System.out.println("Title = " + title);

        //Get Current URL
        System.out.println("Current URL = " + driver.getCurrentUrl());

        String loginURL = "https://demo.nopcommerce.com/login?returnUrl=%2F";
        driver.navigate().to(loginURL);

        System.out.println("Current URL = " + driver.getCurrentUrl());

        //to find email element
        WebElement emailField = driver.findElement(By.id("Email")); //copy
        //Sending email field element
        emailField.sendKeys("prime123@gmail.com");

        //Find the password field element
        WebElement passWordField = driver.findElement(By.name("Password"));
        //Sending pass word to pass word feild element
        passWordField.sendKeys("Prime123");

        //to close the browser
        driver.close();

    }


}


