package SeleniumHomeWorks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class RadioButtons8 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/basic-radiobutton-demo-homework.php");
        WebElement beverage= driver.findElement(By.xpath("//input[@value='Juice']"));
        beverage.click();

        List<WebElement> environment=driver.findElements(By.xpath("//input[@name='working_enviroment']"));
        for(WebElement list:environment) {
            if(list.getAttribute("value").equals("hybrid")) {
                list.click();
                Thread.sleep(3000);
            }

        }
        WebElement season= driver.findElement(By.xpath("//input[@value='spring']"));
        WebElement radioButton= driver.findElement(By.xpath("//button[text()='Enable Radio Button']"));
        if(!season.isEnabled()) {
            radioButton.click();
        }
        boolean button=radioButton.isEnabled();
        System.out.println("Radio button is enabled "+button);
        if(radioButton.isEnabled()){
        season.click();
        }
        WebElement winterButton=driver.findElement(By.xpath("//input[@value='winter']"));
        boolean winter=winterButton.isDisplayed();
        System.out.println("Winter button is displayed "+winter);
        WebElement showButton= driver.findElement(By.xpath("//button[@id='showRadioButtons']"));
        showButton.click();
        winter=winterButton.isDisplayed();
        System.out.println("Winter button is displayed "+winter);

        WebElement meal= driver.findElement(By.xpath("//input[@value='lunch']"));
        meal.click();




    }
}
