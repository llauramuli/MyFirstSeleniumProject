import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class WebDriverRadioButtons {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("file:///Users/macbook/Desktop/workspace/MyFirstSeleniumProject/src/main/webapp/RadioButtonTest.html");
        driver.manage().window().maximize();

        List<WebElement> radioButtons = driver.findElements(By.name("color"));
        radioButtons.get(1).click();

        for(WebElement radioButton : radioButtons){
            if (radioButton.isSelected()){
                System.out.println(radioButton.getAttribute("value"));
            }
        }
        Thread.sleep(3000);
        driver.close();

    }
}
