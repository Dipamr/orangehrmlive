package com.orangehrmlive.demo.testsuite;

import com.orangehrmlive.demo.pages.DashboardPage;
import com.orangehrmlive.demo.pages.HomePage;
import com.orangehrmlive.demo.pages.LoginPage;
import com.orangehrmlive.demo.testbase.TestBase;
import org.testng.annotations.Test;

public class LoginTest extends TestBase {
    LoginPage loginpage= new LoginPage();
    DashboardPage dashboard =new DashboardPage();
    HomePage homepage =new HomePage();


@Test
public void verifyUserShouldLoginsuccessfully() {
    loginpage.username("Admin");
    loginpage.password("admin123");
    loginpage.clickOnLoginButton();
    loginpage.verifyLoginPanelText();


}
@Test
    public void verifyThatTheLogoDisplayOnHomePage(){
    loginpage.username("Admin");
    loginpage.password("admin123");
    loginpage.clickOnLoginButton();
     homepage.OrangeHRMlogo();



}
@Test
    public void UserShouldLogOutSuccessFully(){
    loginpage.hoverOnlogout();
    loginpage.clickOnLogoutLink();



}





}
