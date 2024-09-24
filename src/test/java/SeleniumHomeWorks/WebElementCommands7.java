package SeleniumHomeWorks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebElementCommands7 {
    public static void main(String[] args) {

        WebDriver driver=new FirefoxDriver();
        driver.manage().window().maximize();

        driver.get("https://syntaxprojects.com/selenium_commands_selector-homework.php");
        WebElement text= driver.findElement(By.xpath("//div[@id='textattr']"));
        String textFull=text.getText();
        System.out.println(textFull);
        if(text.equals("inspect me to view my custom attribute")){
            System.out.println("the text matches to the one mentioned in acceptance criteria");
        }
        else {
            System.out.println("the text doesnt match to the one mentioned in acceptance criteria");
        }

        WebElement musicFest= driver.findElement(By.xpath("//input[@value='music_festival']"));
        Boolean stateOfRB1=musicFest.isEnabled();
        System.out.println("The radio button 1 is enabled "+stateOfRB1);
        musicFest.click();

        WebElement techTalk= driver.findElement(By.xpath("//input[@value='tech_talk']"));
        Boolean stateOfRB2=techTalk.isEnabled();
        System.out.println("The radio button 2 is enabled "+stateOfRB2);

        WebElement button= driver.findElement(By.xpath("//button[@class='btn btn-default']"));
        button.click();

        WebElement artEx= driver.findElement(By.xpath("//label[@id='hiddenRadioLabel']"));
        Boolean stateOfRB3=artEx.isDisplayed();
        System.out.println("The radio button 3 is displayed "+stateOfRB3);
        artEx.click();

        WebElement mysteryMessage= driver.findElement(By.xpath("//div[@id='hidden_message']"));
        String message=mysteryMessage.getAttribute("title");
        System.out.println(message);

        WebElement checkBox1= driver.findElement(By.xpath("//input[@name='CheckboxFirst']"));
        boolean chB1=checkBox1.isEnabled();
        System.out.println("Check box 1 is enabled "+chB1);
        checkBox1.click();

        WebElement checkBox2= driver.findElement(By.xpath("//input[@name='disabledCheckbox']"));
        boolean chB2=checkBox2.isEnabled();
        System.out.println("Check box 2 is enabled "+chB2);

        WebElement inputBox= driver.findElement(By.xpath("//input[@value='Default text for clearing and sending keys.']"));
        inputBox.clear();
        inputBox.sendKeys("here is the custom text entered");







    }
}
