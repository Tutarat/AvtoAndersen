package Tests;

import org.junit.jupiter.api.Test;

public class TestBranch extends TestBase{
    @Test
    public void PersonalInfo(){
        main.goTo();
        taksOne.checkPageIsCorrect1();
        avtorizationPage.inLogin("a.khusainov")
                .inPassword("1iGS0ScAML12")
                .clickSignIn();
        mainpage.checkPageIsCorrect2()
                .clickBurgerMenu()
                .checkPageIsCorrectClickBurgerMenu()
                .clickMyAccount();
    }

}
