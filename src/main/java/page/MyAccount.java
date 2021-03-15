package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MyAccount extends BasePage{

    public MyAccount(WebDriver driver) {
        super(driver);
    }
    public MyAccount checkPageIsCorrectDate(){
        isElementDisplayed(By.xpath("/html/body/andteam-root/div/andteam-employee/div/div/andteam-user-main/div/andteam-user-info/div/div[2]/andteam-user-work-skills/div/div[4]/div/div[1]"));
        return this;
    }
    public MyAccount checkPageIsCorrectHide(){
        isElementDisplayed(By.xpath("/html/body/andteam-root/div/andteam-employee/div/div/andteam-user-main/div/andteam-user-info/div/div[2]/andteam-user-contacts/div/div[5]/div/andteam-checkbox/label/span[1]"));
        return this;
    }
    public MyAccount checkPageIsCorrectTitleDate(){
        isElementDisplayed(By.xpath("/html/body/andteam-root/div/andteam-employee/div/div/andteam-user-main/div/andteam-user-info/div/div[2]/andteam-user-work-skills/div/div[4]/p"));
        return this;
    }
    public MyAccount checkPageIsCorrectTitleHide(){
        isElementDisplayed(By.xpath("/html/body/andteam-root/div/andteam-employee/div/div/andteam-user-main/div/andteam-user-info/div/div[2]/andteam-user-work-skills/div/div[4]/div/div[2]/andteam-checkbox/label/span[2]"));
        return this;
    }


}
