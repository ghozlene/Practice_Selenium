import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {
    public static void main(String[] args) {
        //Identifying the web element with id and name locators
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver= new ChromeDriver();

        driver.get("https://rahulshettyacademy.com/locatorspractice/");
        //identifying web Element by ID
        driver.findElement(By.id("inputUsername")).sendKeys("achref@gmail.com");
        //identifying web Element by NAME
        driver.findElement(By.name("inputPassword")).sendKeys("achref");
        //Identifying the web Element by className & click on it
        driver.findElement(By.className("signInBtn")).click();
        //CSS selector


    }
}
