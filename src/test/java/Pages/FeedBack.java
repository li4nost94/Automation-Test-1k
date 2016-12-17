package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

/**
 * Created by Admin on 17.12.2016.
 */
public class FeedBack extends AbstractPage {

    public FeedBack(WebDriver driver) {
        super(driver);
        PageFactory.initElements(this.driver, this);
    }

    @Override
    public void openPage(String URL) {
        driver.navigate().to(URL);
    }

    public void Feedback() {
        driver.findElement(By.cssSelector("a.auth_fb")).click();
        driver.findElement(By.linkText("Обратная связь")).click();
        driver.findElement(By.id("fd7f593f")).clear();
        driver.findElement(By.id("fd7f593f")).sendKeys("Катя");
        driver.findElement(By.id("fb11538d")).clear();
        driver.findElement(By.id("fb11538d")).sendKeys("katya@gmail.com");
        driver.findElement(By.id("contactstopicid")).click();
        new Select(driver.findElement(By.id("contactstopicid"))).selectByVisibleText("Другое...");
        driver.findElement(By.id("fb5b8286")).clear();
        driver.findElement(By.id("fb5b8286")).sendKeys("Test EPAM");
        driver.findElement(By.id("f58659ef")).clear();
        driver.findElement(By.id("f58659ef")).sendKeys("v97h");
        driver.findElement(By.id("submit")).click();

    }

    public boolean isfeedback() {
        boolean serInIsTrue = false;
        if (driver.findElement(By.linkText("Ваше сообщение было успешно отправлено")).isDisplayed()) serInIsTrue = true;
        driver.quit();
        return serInIsTrue;


    }


}
