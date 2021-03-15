package Tests;

import page.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class TestBase {
    String SITE_URL = "https://dev-team.andersenlab.com/";
    WebDriver driver;
    public Main main;
    public TaksOne taksOne;
    public AvtorizationPage avtorizationPage;
    public MainPage mainpage;
    public MyAccount myAccount;

    @BeforeEach
    public void start(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        main = PageFactory.initElements(driver, Main.class);
        taksOne = PageFactory.initElements(driver, TaksOne.class);
        avtorizationPage = PageFactory.initElements(driver, AvtorizationPage.class);
        mainpage = PageFactory.initElements(driver, MainPage.class);
        myAccount = PageFactory.initElements(driver, MyAccount.class);
    }

   // @AfterEach
    public void finish(){
        driver.quit();
    }
}
