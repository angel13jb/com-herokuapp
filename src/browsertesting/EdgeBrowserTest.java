package browsertesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;


import java.time.Duration;

public class EdgeBrowserTest {
    public static void main(String[] args) {
        String baseUrl = "http://the-internet.herokuapp.com/login";
        System.setProperty("webdriver.edge.driver", "drivers/msedgedriver.exe");
        WebDriver driver = new EdgeDriver();//using edge driver
        driver.get(baseUrl);
        driver.manage().window().maximize();//maximize size
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));//implicitly time
        String title = driver.getTitle();//get page title
        System.out.println(title);
        String currentUrl = driver.getCurrentUrl();//get current url
        System.out.println("current URL=" + currentUrl);
        WebElement userName = driver.findElement(By.id("username"));//find username element
        userName.sendKeys("tomsmith");
        WebElement password = driver.findElement(By.name("password"));//find password element
        password.sendKeys("SuperSecretPassword!");
        //closing url
        driver.close();
    }
}