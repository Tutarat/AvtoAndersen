package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TaksOne extends BasePage {

    public TaksOne(WebDriver driver) {
        super(driver);
    }
    public TaksOne checkPageIsCorrect1(){
        isElementDisplayed(By.xpath("/html/body/andteam-root/andteam-login/div/div/andteam-login-form/div/h1"));
        return this;
    }
    public TaksOne CheckPageIsCorrect4(){
        isElementDisplayed(By.xpath("//*[@id=\"title-block\"]"));
        return this;
    }
}
