package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utility.Utility;
import org.openqa.selenium.By;
import org.testng.Reporter;

public class AddUserPage extends Utility {
    By UserRoleDropDown = By.xpath("//div[@class='orangehrm-card-container']/form/div[1]/div/div[1]");
    By EmployeeName = By.xpath("//div[@class='orangehrm-card-container']/form/div[1]/div/div[2]");
    By Username = By.xpath("//div[@class='orangehrm-card-container']/form/div[1]/div/div[4]");
    By StatusDropDown = By.xpath("//div[@class='orangehrm-card-container']/form/div[1]/div/div[3]");
    By Password = By.xpath("//div[@class='orangehrm-card-container']/form/div[2]/div/div[1]");
    By clickOnConfirmPassword = By.xpath("//div[@class='orangehrm-card-container']/form/div[2]/div/div[2]");
    By clickOnSaveButton = By.xpath("//div[@class='orangehrm-card-container']/form/div[3]/button[2]");
    By CancleButton = By.xpath("//div[@class='orangehrm-card-container']/form/div[3]/button[1]");
    By addUserText = By.xpath("//div[@class='orangehrm-card-container']/h6");

    public void UserRoleDropDown(int i) {
        Reporter.log("Clicking on  UserRoleDropDown  " + UserRoleDropDown.toString());
        clickOnElement(UserRoleDropDown);

    }

    public void EmployeeName(String ananyaDash) {
        Reporter.log("Clicking on  EmployeeName  " + EmployeeName.toString());
        clickOnElement(EmployeeName);

    }

    public void Username() {
        Reporter.log("Clicking on Username " + Username.toString());
        clickOnElement(Username);

    }

    public void StatusDropDown() {
        Reporter.log("Clicking on StatusDropDown " + StatusDropDown.toString());
        clickOnElement(StatusDropDown);

    }

    public void Password() {
        Reporter.log("Clicking on Password " + Password.toString());
        clickOnElement(Password);

    }

    public void clickOnConfirmPassword() {
        Reporter.log("Clicking on clickOnConfirmPassword " + clickOnConfirmPassword.toString());
        clickOnElement(clickOnConfirmPassword);
    }

    public void clickOnSaveButton() {
        Reporter.log("Clicking on clickOnSaveButton" + clickOnSaveButton.toString());
        clickOnElement(clickOnSaveButton);
    }

    public void CancleButton() {
        Reporter.log("Clicking on CancleButton" + CancleButton.toString());
        clickOnElement(CancleButton);
    }

    public String verifyaddUserText() {
        return getTextFromElement(addUserText);

    }
}
