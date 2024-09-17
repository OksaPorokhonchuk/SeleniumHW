package SeleniumHomeWorks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverCommands {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();

        driver.manage().window().maximize();

        driver.navigate().to("www.google.com");
        String title1= driver.getTitle();

        System.out.println("The Chrome page title is "+title1);


        driver.navigate().to("https://syntaxprojects.com/");
        String title2= driver.getTitle();

        System.out.println("The Syntax tytle is "+title2);

        driver.navigate().back();
        driver.navigate().refresh();

        driver.close();




    }
}
