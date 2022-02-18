package page_object;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import utils.LocalDriverManager;

public class ProductPage {

    private final WebDriver driver = LocalDriverManager.getInstance();

    private final By colorSelection = By.id("pa_color");
    private final By logoSelection = By.id("logo");
    private final By productCartButton = By.xpath("//button[contains(@class,'single_add_to_cart_button)]");
    private final By viewCartButton = By.xpath("//div[@class='woocommerce']//a[text()='View cart']");

    public void selectColor(String color) {
        wait.until(ExpectedConditions.refreshed)
        Select sColor = new Select(driver.findElemnt(colorSelection));
        sColor.selectByVisibleText(color);
    }

    public void selectLogo(boolean isLogo) {
        Select sLogo = new Select(driver.findElement(logoSelection));
        if (isLogo) {
            sLogo.selectByVisibleText("Yes");
        } else {
            sLogo.selectByVisibleText("No");
        }
    }

        public void addProductToCart() {
            wait.until(ExpectedConditions.elementToBeClickable(productCartButton));
            driver.findElement(productCartButton).click();
        }

        public void viewCart() {
            wait.until(ExpectedConditions.visiblityOfElemntLocated(viewCartButton));
            driver.findElement(viewButton).click();
        }
    }
}
