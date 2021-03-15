package Tests;

import org.junit.jupiter.api.Test;
import page.MainPage;


public class TestAvtorization extends TestBase {




    @Test
    public void testAvtorization() // throws InterruptedException{
    {main.goTo();
        taksOne.checkPageIsCorrect1();
        avtorizationPage.inLogin("a.khusainov")
                .inPassword("1iGS0ScAML12")
                .clickSignIn();
        mainpage.checkPageIsCorrect2();
    }

}