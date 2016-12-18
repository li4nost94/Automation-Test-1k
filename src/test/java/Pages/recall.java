package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

/**
 * Created by Admin on 18.12.2016.
 */
public class recall extends AbstractPage {

    public recall(WebDriver driver)
    {
        super(driver);
        PageFactory.initElements(this.driver, this);
    }
    @Override
    public void openPage(String URL)
    {
        driver.navigate().to(URL);
    }

    public void recall(String searcworld)
    {

        driver.findElement(By.cssSelector("a.auth_fb")).click();
        driver.findElement(By.cssSelector("strong.pr-line_name")).click();
        driver.findElement(By.id("s_keywords")).clear();
        driver.findElement(By.id("s_keywords")).sendKeys("Xiaomi Redmi Note 3 Pro 32Gb");
        
        driver.findElement(By.linkText("Отзывы")).click();
        driver.findElement(By.linkText("Написать отзыв")).click();
        driver.findElement(By.id("fd8d1a2e")).clear();
        driver.findElement(By.id("fd8d1a2e")).sendKeys("Отличный товар за хорошие деньги");
        driver.findElement(By.id("f3bcbe04")).click();
        new Select(driver.findElement(By.id("f3bcbe04"))).selectByVisibleText("несколько месяцев");
        driver.findElement(By.id("ff535fdc")).clear();
        driver.findElement(By.id("ff535fdc")).sendKeys("Камера, батарея, дизайн");
        driver.findElement(By.id("ffca6365")).clear();
        driver.findElement(By.id("ffca6365")).sendKeys("нет");
        driver.findElement(By.id("fbf02422")).clear();
        driver.findElement(By.id("fbf02422")).sendKeys("10");
        driver.findElement(By.id("faed532d")).click();
        new Select(driver.findElement(By.id("faed532d"))).selectByVisibleText("5");
        driver.findElement(By.id("f20d89d6")).clear();
        driver.findElement(By.id("f20d89d6")).sendKeys("e7b7");
        driver.findElement(By.id("f4c5e4b5")).click();
        driver.findElement(By.id("submit")).click();

    }

    public boolean isrecall(){
        boolean serInIsTrue=false;
        if(driver.findElement(By.xpath("Ваш комментарий был успешно добавлен и ожидает модерации!")).isDisplayed() ) serInIsTrue=true;
        driver.quit();
        return  serInIsTrue;
    }

}
