package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Main extends BasePage {
    String SITE_URL = "https://dev-team.andersenlab.com/";
    public Main(WebDriver driver) {
        super(driver);
    }

    public Main goTo(){
        driver.get(SITE_URL);
        return this;
    }

    public Main chooseTask(){
        click(By.xpath("//*[@id=\"login\"]"));
        return this;
    }
    public void login(){
    }





}