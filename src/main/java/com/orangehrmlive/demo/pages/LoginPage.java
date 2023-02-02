package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utility.Utility;
import org.openqa.selenium.By;

public class LoginPage extends Utility {
    By username = By.xpath("//div/input[@name='username']");
    By password = By.xpath("//div/input[@name='password']");
    By LoginButton = By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']");
    By LoginPanelText = By.xpath("//div[@class='orangehrm-login-form']");
    By hoverOnlogout = By.xpath("//div[@class='oxd-topbar-header-userarea']");
    By clickOnLogoutLink = By.xpath("//a[contains(text(),'Logout')]");

    public void username(String Username) {
        sendTextToElement(username, Username);
    }

    public void password(String Password) {
        sendTextToElement(password, Password);
    }

    public void clickOnLoginButton() {
        clickOnElement(LoginButton);

    }

    public String verifyLoginPanelText() {
        return getTextFromElement(LoginPanelText);

    }
    public void hoverOnlogout(){
        clickOnElement(hoverOnlogout);
    }

    public void clickOnLogoutLink() {
        clickOnElement(clickOnLogoutLink);

    }
}