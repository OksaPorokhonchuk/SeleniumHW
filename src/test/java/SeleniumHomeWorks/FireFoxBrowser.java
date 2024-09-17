package SeleniumHomeWorks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FireFoxBrowser {
    public static void main(String[] args) {
        WebDriver driver=new FirefoxDriver();

        driver.manage().window().maximize();

        driver.get("https://www.syntaxprojects.com/");
        String currentUrl= driver.getCurrentUrl();
        String title= driver.getTitle();

        System.out.println("The current URL is "+currentUrl);
        System.out.println("The page title is "+title);

        driver.close();






    }
}
