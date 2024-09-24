package SeleniumHomeWorks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CSS6 {
    public static void main(String[] args) {
        WebDriver driver=new FirefoxDriver();
        driver.manage().window().maximize();

        driver.get("https://syntaxprojects.com/cssSelector-homework.php");

        WebElement userId= driver.findElement(By.cssSelector("input#UserID"));
        userId.sendKeys("Jane Smith");

        WebElement userName=driver.findElement(By.cssSelector("input#UserName"));
        userName.sendKeys("Jane");

        WebElement introToLecture= driver.findElement(By.cssSelector("[name*='LectureIntro'"));
        introToLecture.sendKeys("CSS");

        WebElement feedback1= driver.findElement(By.cssSelector("input#FeedbackFromRay"));
        feedback1.sendKeys("Perfect");

        WebElement feedback2= driver.findElement(By.cssSelector("input#FeedbackfromDucky"));
        feedback2.sendKeys("Very good");

        WebElement clientId= driver.findElement(By.cssSelector("[name*='ClientID'"));
        clientId.sendKeys("Jane12345");

        WebElement email = driver.findElement(By.cssSelector("input[name*='email']"));
        email.sendKeys("sunny1234@gmail.com");

        WebElement courseTopic= driver.findElement(By.cssSelector("input[name*='CourseTopic']"));
        courseTopic.sendKeys("Selenium");






    }
}
