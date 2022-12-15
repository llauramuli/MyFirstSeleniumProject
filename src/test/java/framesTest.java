import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class framesTest {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://jqueryui.com/droppable/");
        driver.manage().window().maximize();
        System.out.println(driver.findElements(By.tagName("iframe")).size());
        //Switching with index
        driver.switchTo().frame(0);
        //switching with WebElement
        //driver.switchTo().frame(driver.findElement(By.cssSelector("iframe.demo-frame")));
        //driver.findElement(By.id("draggable")).click();

        Actions action = new Actions(driver);
        WebElement source = driver.findElement(By.id("draggable"));
        WebElement target = driver.findElement(By.id("droppable"));

        action.dragAndDrop(source, target).build().perform();
        // to get back outside the frame
        driver.switchTo().defaultContent();
    }
}
