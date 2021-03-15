package page;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MainPage extends BasePage{

    public MainPage(WebDriver driver) {
        super(driver);
    }
    public MainPage checkPageIsCorrect2(){
        isElementDisplayed(By.xpath("/html/body/andteam-root/div/andteam-header/andteam-portal-header/header/div/div[1]"));
        return this;
    }
    public MainPage clickBurgerMenu(){
        click(By.xpath("/html/body/andteam-root/div/andteam-header/andteam-portal-header/header/div/div[2]/div[2]/andteam-menu/div/div/div"));
        return this;
    }
    public MainPage checkPageIsCorrectClickBurgerMenu() {
        isElementDisplayed(By.xpath("/html/body/andteam-root/div/andteam-header/andteam-portal-header/header/div/div[2]/div[2]/andteam-menu/div/div[2]/div/a[3]"));
        return this;
    }
    public MainPage clickMyAccount(){
        click(By.xpath("/html/body/andteam-root/div/andteam-header/andteam-portal-header/header/div/div[2]/div[2]/andteam-menu/div/div[2]/div/a[3]"));
        return this;
    }
    //public void scrollToElement(String element){
        //JavascriptExecutor jse = (JavascriptExecutor)driver;
        //jse.executeScript("window.scrollBy(0,250)", "");
   // }
    public MainPage clickAndersenLab() {
        click(By.xpath("/html/body/andteam-root/div/andteam-main/div/div[3]/andteam-footer/div/ul/li[4]/div/div[2]/a"));
        return this;
    }


}
