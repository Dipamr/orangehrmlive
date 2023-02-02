package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utility.Utility;
import org.openqa.selenium.By;
import org.testng.Reporter;

public class ViewSystemUsersPage extends Utility {

    By SystemUserText = By.xpath("//div[@class='oxd-table-filter-header-title']");
    By entreuserNameField = By.xpath("//div[@class='oxd-form-row']/div/div[1]");
    By UserRollDropDown = By.xpath("//div[@class='oxd-form-row']/div[1]/div[2]/div/div[2]");
    By employeeNameField = By.xpath("//div[@class='oxd-autocomplete-wrapper']/div");
    By StatusDropDown = By.className("oxd-input-group oxd-input-field-bottom-space");
    By clickOnsearchButton = By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']");
    By ResetButton = By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--ghost']");

    By clickOnaddButton = By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--secondary']");
    By clickOndeleteButton = By.xpath("//div[@id='app']/div[1]/div[2]/div[2]/div/div[2]/div[3]/div/div[2]/div[1]/div/div[6]/div/button[1]/i");
    By popupdisplay = By.xpath("//div[@class='oxd-sheet oxd-sheet--rounded oxd-sheet--white oxd-dialog-sheet oxd-dialog-sheet--shadow oxd-dialog-sheet--gutters orangehrm-dialog-popup']");
    By clickOnpopupButton = By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--label-danger orangehrm-button-margin']");

    public String verifySystemUserText() {
        return getTextFromElement(SystemUserText);

    }

    public void entreuserNameField() {
        Reporter.log("Clicking on  entreuserNameField  " + entreuserNameField.toString());
        clickOnElement(entreuserNameField);

    }

    public void UserRollDropDown() {
        Reporter.log("Clicking on  UserRollDropDown  " + UserRollDropDown.toString());
        clickOnElement(UserRollDropDown);

    }

    public void employeeNameField() {
        Reporter.log("Clicking on employeeNameField " + employeeNameField.toString());
        clickOnElement(employeeNameField);


    }

    public void StatusDropDown() {
        Reporter.log("Clicking on StatusDropDown " + StatusDropDown.toString());
        clickOnElement(StatusDropDown);


    }

    public void clickOnsearchButton() {
        Reporter.log("Clicking on clickOnsearchButton " + clickOnsearchButton.toString());
        clickOnElement(clickOnsearchButton);

    }

    public void ResetButton() {
        Reporter.log("Clicking on ResetButton " + ResetButton.toString());
        clickOnElement(ResetButton);


    }

    public void clickOnaddButton() {
        Reporter.log("Clicking on clickOnaddButton" + clickOnaddButton.toString());
        clickOnElement(clickOnaddButton);


    }

    public void clickOndeleteButton() {
        Reporter.log("Clicking on clickOndeleteButton " + clickOndeleteButton.toString());
        clickOnElement(clickOndeleteButton);

    }

    public String verifypopupdisplay() {
        return getTextFromElement(popupdisplay);
    }

    public void clickOnpopupButton() {
        Reporter.log("Clicking on  clickOnpopupButton  " + clickOnpopupButton.toString());
        clickOnElement(clickOnpopupButton);
    }
}
