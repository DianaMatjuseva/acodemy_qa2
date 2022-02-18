package page_object;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.LocalDriverManager;

import static org.hamcrest.CoreMatchers.equalTo;

import static org.hamcrest.MatcherAssert.assertThat;

public class CartPage {

    private final WebDriver driver = LocalDriverManager.getInstance();

    private final By couponCodeField = By.id("coupon_code");
    private final By applyCoupon = By.name("apply_coupon");
    private final By successMessage = By.className("woocommerce-message");

    public void applyCoupon() {
        driver.findElement(couponCodeField).sendKeys(code);
    }

    public void checkSuccessMessage(String message) {
        assertThat(driver.findElement(successMessage).getText(), equalTo(message));
    }
}
