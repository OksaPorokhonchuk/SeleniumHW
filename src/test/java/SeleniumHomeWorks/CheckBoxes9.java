package SeleniumHomeWorks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.w3c.dom.html.HTMLInputElement;

import java.util.List;

public class CheckBoxes9 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/basic-checkbox-demo-homework.php");

        WebElement newsLetter= driver.findElement(By.xpath("//input[@id='newsletter']"));

        if(newsLetter.isEnabled()){
            newsLetter.click();
        }
        List<WebElement> checkBoxes=driver.findElements(By.xpath("//input[@class='cb-element']"));
        for(WebElement checkBoxes1:checkBoxes) {
            //checkBoxes1.click();
            String valueOfChB=checkBoxes1.getAttribute("value");
            if(valueOfChB.equals("cooking")||valueOfChB.equals("reading")){
                checkBoxes1.click();
            }
            WebElement supportCB = driver.findElement(By.xpath("//input[@value='Support' ]"));
            WebElement Music = driver.findElement(By.xpath("//input[@value='Music' ]"));

            if(!supportCB.isDisplayed() && !Music.isDisplayed()) {

                WebElement showBtn = driver.findElement(By.xpath("//button[@id='toggleCheckboxButtons']"));
                showBtn.click();
                Thread.sleep(2000);
                Music.click();
            }

            WebElement preferences= driver.findElement(By.xpath("//input[@value='Receive-Notifications']"));
            WebElement chBoxButton= driver.findElement(By.xpath("//button[@id='enabledcheckbox']"));
            if (!preferences.isEnabled()){
             chBoxButton.click();
             preferences.click();
            }

        }
    }
}
