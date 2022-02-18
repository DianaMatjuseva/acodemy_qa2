package page_object;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.LocalDriverManager;
import utils.PropertiesReader;

import java.time.Duration;
import java.util.List;

public class HomePage {

    private final WebDriver driver = LocalDriverManager.getInstance();
    public final WebDriverWait wait =
            new WebDriverWait(driver, Duration.ofSeconds(PropertiesReader.getProperty("explicit.wait")))

            private final By productElements = By.xpath("//ul[contains(@class, 'products)]//li");

    public List<WebElement> getAllProducts() {
        wait.until(ExpectedCondition.presenceOfAllElementsLocatedBy(productElements));
        return driver.findElements()
    }
}
