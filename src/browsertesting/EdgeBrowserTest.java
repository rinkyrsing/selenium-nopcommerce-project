package browsertesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.How;

import java.time.Duration;

public class EdgeBrowserTest {

    public static void main(String[] args) {
     //How to launch browser

        String baseURL = "https://demo.nopcommerce.com/login?returnUrl=%2F";
        System.setProperty("webdriver.edge.driver", "drivers/msedgedriver.exe");

        WebDriver driver = new EdgeDriver();
        //Launch the URL
        driver.get(baseURL);
        //  To maximize window
        driver.manage().window().maximize();
        //we will give implicit time to driver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        //Get title of the page
        String title = driver.getPageSource();
        System.out.println("Title = " + title);

        //Get current URL
        System.out.println("Current URL = " + driver.getCurrentUrl());

        //to find email field element
        WebElement emailField = driver.findElement(By.id("Email"));
        //Sending email field element
        emailField.sendKeys("Primer123@gmail.com");

        //Find the password field element
        WebElement passWordFeild = driver.findElement(By.name("Password"));
        //sending password field
        passWordFeild.sendKeys("Prime123");

        //to close the browser
        driver.close();

    }
}
