package SeleniumHomeWorks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Locators2 {
    public static void main(String[] args) {

        WebDriver driver=new FirefoxDriver();
        driver.manage().window().maximize();

        driver.get("https://syntaxprojects.com/input-form-locator.php?first_name=&last_name=&email=");

        WebElement name= driver.findElement(By.id("first_name"));
        name.sendKeys("Oksa");

        WebElement lastName= driver.findElement(By.name("last_name"));
        lastName.sendKeys("Por");

        WebElement email= driver.findElement(By.className("form-control-01"));
        email.sendKeys("oksi12345@gmail.com");

        WebElement link1= driver.findElement(By.linkText("Click Here."));
        link1.click();

        WebElement link2= driver.findElement(By.partialLinkText("Link"));
        link2.click();

    }
}
