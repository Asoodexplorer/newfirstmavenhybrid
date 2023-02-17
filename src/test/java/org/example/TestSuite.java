package org.example;
import org.testng.annotations.Test;

public class TestSuite extends BaseTest{
    HomePage homePage = new HomePage();
    @Test
    public void userShouldSeeProductListWhenClickOnElectronics(){
    homePage.clickOnElectronics();

    }
}
