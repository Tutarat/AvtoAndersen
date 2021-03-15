package Tests;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;


public class FirstTest extends TestBase {



    @Test
    public void FirstTest(){
        main.goTo();
        taksOne.checkPageIsCorrect1();
        main.chooseTask();



    }

}