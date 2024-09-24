package SeleniumHomeWorks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RelativeXpathAssignment4 {
    public static void main(String[] args) {

        WebDriver driver=new FirefoxDriver();
        driver.manage().window().maximize();

        driver.get("https://www.syntaxprojects.com/Xpath-homework.php");

       WebElement hobbies=driver.findElement(By.xpath("//input[@id='yourHobbiesId']"));
       hobbies.sendKeys("Skiing");
       WebElement button= driver.findElement(By.xpath("//button[@id='display_text']"));
       button.click();
       WebElement favouriteMovies= driver.findElement(By.xpath("//input[@name='favoriteMovies']"));
       favouriteMovies.sendKeys("Bitter Moon, Desperate House Wives");
       WebElement text= driver.findElement(By.xpath("//label[contains(text(),'adipisicing elit. Doloribus distincti')]"));
       String getTextOfString=text.getText();
        System.out.println(getTextOfString);
        WebElement city= driver.findElement(By.xpath("//input[@id= 'yourCity']"));
        city.sendKeys("New York");
        WebElement personalEmail= driver.findElement(By.xpath("(//input[@class= 'form-control']) [4]"));
        personalEmail.sendKeys("oksa5678@yahoo.com");
        WebElement officeEmail = driver.findElement(By.xpath("(//input[@class= 'form-control']) [5]"));
        officeEmail.sendKeys("info@ffa.com");
        WebElement professionalEmail= driver.findElement(By.xpath("(//input[@class= 'form-control']) [6]"));
        professionalEmail.sendKeys("info@cryp.com");
        WebElement clientName= driver.findElement(By.xpath("//input[@name='clientName'and @id='clientName']"));
        clientName.sendKeys("Oksana");
        WebElement clientId= driver.findElement(By.xpath("//input[@name='clientId' and@id='clientId']"));
        clientId.sendKeys("Oksa12345");
        WebElement streetNo= driver.findElement(By.xpath("//input[@name='StreetNo']"));
        streetNo.sendKeys("1230 Ocean Avenue");
        WebElement houseNo= driver.findElement(By.xpath("//input[@name='HouseNo']"));
        houseNo.sendKeys("2A");





    }




}
