package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by Admin on 17.12.2016.
 */
public class addFavorite extends AbstractPage {

    public addFavorite(WebDriver driver)
    {
        super(driver);
        PageFactory.initElements(this.driver, this);
    }
    @Override
    public void openPage(String URL)
    {
        driver.navigate().to(URL);
    }

    public void addFavorite()
    {
        driver.findElement(By.cssSelector("a.auth_fb")).click();
        driver.findElement(By.cssSelector("strong.pr-line_name")).click();
        driver.findElement(By.id("s_keywords")).clear();
        driver.findElement(By.id("s_keywords")).sendKeys("Xiaomi Redmi Note 3 Pro 32Gb");
        driver.findElement(By.cssSelector("span.add-fav_text")).click();
        driver.findElement(By.xpath("(//button[@type='button'])[3]")).click();


    }

    public boolean isaddFavorite(){
        boolean serInIsTrue=false;
        if(driver.findElement(By.xpath("(//button[@type='button'])[3]")).isDisplayed() ) serInIsTrue=true;
        driver.quit();
        return  serInIsTrue;
    }

}
