package Tests;

import org.junit.jupiter.api.Test;
import page.MyAccount;

public class PersonalInfo extends TestBase{
    @Test
    public void PersonalInfo3() //throws InterruptedException{
    {
        main.goTo();
        taksOne.checkPageIsCorrect1();
        avtorizationPage.inLogin("a.khusainov")
                .inPassword("1iGS0ScAML12")
                .clickSignIn();
        mainpage.checkPageIsCorrect2()
                .clickBurgerMenu()
                .checkPageIsCorrectClickBurgerMenu()
                .clickMyAccount();
        myAccount.checkPageIsCorrectDate()
                .checkPageIsCorrectHide()
                .checkPageIsCorrectTitleDate()
                .checkPageIsCorrectTitleHide();
    }

}

