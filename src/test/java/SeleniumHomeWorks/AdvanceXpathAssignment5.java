package SeleniumHomeWorks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AdvanceXpathAssignment5 {
    public static void main(String[] args) {

        WebDriver driver=new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/advanceXpath-homework.php");

        WebElement leastFavoriteBook1= driver.findElement(By.xpath("//input[@id='least-favorite']/preceding-sibling::input[2]"));
        leastFavoriteBook1.sendKeys("Don Quixote");
        WebElement leastFavoriteBook2=driver.findElement(By.xpath("//input[@id='least-favorite']/preceding-sibling::input[1]"));
        leastFavoriteBook2.sendKeys("The Great Gatsby");
        WebElement leastFavoriteBook3= driver.findElement(By.xpath("//input[@id='least-favorite']"));
        leastFavoriteBook3.sendKeys("Jane Eyre");

        WebElement favoriteBook1= driver.findElement(By.xpath("//input[@id='favouriteBook']"));
        favoriteBook1.sendKeys("City");
        WebElement favoriteBook2= driver.findElement(By.xpath("//input[@id='favouriteBook']/following-sibling::input[1]"));
        favoriteBook2.sendKeys("Lolita");
        WebElement favoriteBook3= driver.findElement(By.xpath("//input[@id='favouriteBook']/following-sibling::input[2]"));
        favoriteBook3.sendKeys("Madame Bovary");

        WebElement grandParent= driver.findElement(By.xpath("//div[@id='familyTree']/child::input[1]"));
        grandParent.sendKeys("Grandparent");
        WebElement parent= driver.findElement(By.xpath("//div[@id='familyTree']/child::input[2]"));
        parent.sendKeys("Parent");
        WebElement child= driver.findElement(By.xpath("//div[@id='familyTree']/child::input[3]"));
        child.sendKeys("Child");






    }




}
