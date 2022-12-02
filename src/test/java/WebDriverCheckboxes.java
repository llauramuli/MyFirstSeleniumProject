import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverCheckboxes {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("file:///Users/macbook/Desktop/workspace/MyFirstSeleniumProject/src/main/webapp/CheckboxTest.html");
        driver.manage().window().maximize();

        WebElement checkbox = driver.findElement(By.id("testcheckbox"));
        checkbox.click();

        Thread.sleep(3000);
        driver.close();
    }
}
