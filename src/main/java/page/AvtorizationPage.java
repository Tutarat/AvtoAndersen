package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import static java.lang.Thread.sleep;

public class AvtorizationPage extends BasePage
{
    public AvtorizationPage(WebDriver driver) {
        super(driver);

    }
    public AvtorizationPage inLogin(String login) //throws InterruptedException {
        //sleep(500);
    {WebElement element = driver.findElement(By.id("login"));
        element.sendKeys(login);
        return this;
    }
    public AvtorizationPage inPassword(String password){
        driver.findElement(By.id("password")).sendKeys(password);
        return this;
    }
    public AvtorizationPage clickSignIn(){
        click(By.xpath("/html/body/andteam-root/andteam-login/div/div/andteam-login-form/div/form/button"));
        return this;
    }



}
