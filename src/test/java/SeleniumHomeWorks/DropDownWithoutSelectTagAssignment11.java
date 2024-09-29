package SeleniumHomeWorks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;

public class DropDownWithoutSelectTagAssignment11 {
    public static void main(String[] args) {
        WebDriver driver=new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/no-select-tag-dropdown-demo-homework.php");

        WebElement dreamFruit= driver.findElement(By.xpath("//div[@id='dream_fruits']"));
        dreamFruit.click();

        List<WebElement> listOfDreamFruits=driver.findElements(By.xpath("//ul[@class='dropdown-menu single-dropdown-menu']/li/a"));
         for(WebElement list:listOfDreamFruits){
             if(list.getText().equals("Mango")){
                 list.click();
             }
         }
        WebElement favHobby= driver.findElement(By.xpath("//div[@id='favorite_hobbies']"));
        favHobby.click();
        List<WebElement> listOfHobbies=driver.findElements(By.xpath("//ul[@class='dropdown-menu multi-dropdown-menu']/li/a"));
        for(WebElement list:listOfHobbies){
            if(list.getText().equals("Reading")){
                list.click();
            }
        }

    }
}
