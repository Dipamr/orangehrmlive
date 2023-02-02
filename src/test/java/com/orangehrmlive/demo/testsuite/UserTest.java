package com.orangehrmlive.demo.testsuite;

import com.orangehrmlive.demo.pages.AddUserPage;
import com.orangehrmlive.demo.pages.HomePage;
import com.orangehrmlive.demo.pages.LoginPage;
import com.orangehrmlive.demo.pages.ViewSystemUsersPage;
import com.orangehrmlive.demo.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class UserTest extends TestBase {
    UserTest userTest = new UserTest();
    HomePage homepage =new HomePage();
    LoginPage loginpage =new LoginPage();
    ViewSystemUsersPage viewSystemUsersPage=new ViewSystemUsersPage();
    AddUserPage addUserPage = new AddUserPage();
    @Test
    public void adminShouldAddUserSuceessFully() {
        loginpage.username("Admin");
        loginpage.password("admin123");
        loginpage.clickOnLoginButton();
        homepage.clickOnAdminTab();

        String actualText = viewSystemUsersPage.verifySystemUserText();
        String expectedText = "System Users";
        Assert.assertEquals(actualText, expectedText, "Test is verified");
        viewSystemUsersPage.clickOnaddButton();

        String actualMsg = addUserPage.verifyaddUserText();
        String expectedMsg = "Add Users";
        Assert.assertEquals(actualText, expectedText, "Test is verified");

        addUserPage.UserRoleDropDown(0);
        addUserPage.EmployeeName("Ananya Dash");
        addUserPage.Username();
        // addUserPage.disable
        addUserPage.Password();
        addUserPage.clickOnConfirmPassword();
        addUserPage.clickOnSaveButton();
    }
    @Test
    public void searchTheUserCreatedAndVerifyit() {
        loginpage.username("Admin");
        loginpage.password("admin123");
        loginpage.clickOnLoginButton();
        homepage.clickOnAdminTab();

        String actualText = viewSystemUsersPage.verifySystemUserText();
        String expectedText = "System Users";
        Assert.assertEquals(actualText, expectedText, "Test is verified");
        viewSystemUsersPage.entreuserNameField();
        viewSystemUsersPage.UserRollDropDown();
        viewSystemUsersPage.StatusDropDown();
        viewSystemUsersPage.clickOnsearchButton();
        //verify result list
    }

@Test
    public void verifyThatAdminShouldDeleteTheUserSuccessfully(){
    loginpage.username("Admin");
    loginpage.password("admin123");
    loginpage.clickOnLoginButton();
    homepage.clickOnAdminTab();

    String actualText = viewSystemUsersPage.verifySystemUserText();
    String expectedText = "System Users";
    Assert.assertEquals(actualText, expectedText, "Test is verified");
    viewSystemUsersPage.entreuserNameField();
    viewSystemUsersPage.UserRollDropDown();
    viewSystemUsersPage.StatusDropDown();
    viewSystemUsersPage.clickOnsearchButton();
    viewSystemUsersPage.clickOndeleteButton();
    viewSystemUsersPage.verifypopupdisplay();
    viewSystemUsersPage.clickOnpopupButton();
    //delete message go so quickly cant take xpath

}
@Test
    public void searchTheDeleteUserAndVerifyTheMessageNoRecordFound(){
    loginpage.username("Admin");
    loginpage.password("admin123");
    loginpage.clickOnLoginButton();
    homepage.clickOnAdminTab();

    String actualText = viewSystemUsersPage.verifySystemUserText();
    String expectedText = "System Users";
    Assert.assertEquals(actualText, expectedText, "Test is verified");
    viewSystemUsersPage.entreuserNameField();
    viewSystemUsersPage.UserRollDropDown();
    viewSystemUsersPage.StatusDropDown();
    viewSystemUsersPage.clickOnsearchButton();
    //no record found

}



    }





















