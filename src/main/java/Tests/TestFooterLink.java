package Tests;

import org.junit.jupiter.api.Test;

public class TestFooterLink extends TestBase{
    @Test
    public void TestFooterLink(){
        main.goTo();
        taksOne.checkPageIsCorrect1();
        avtorizationPage.inLogin("a.khusainov")
                .inPassword("1iGS0ScAML12")
                .clickSignIn();
        mainpage.checkPageIsCorrect2();
        //mainpage .scrollToElement("Andersenlab");
        mainpage.clickAndersenLab();
        taksOne.CheckPageIsCorrect4();

    }
}
