package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utility.Utility;
import org.openqa.selenium.By;
import org.testng.Reporter;

public class AdminPage extends Utility {

    By UserManagement = By.xpath("//li[@class='oxd-topbar-body-nav-tab --parent --visited']");
    By Job = By.xpath("//div[@class='oxd-topbar-body']/nav/ul/li[3]");
    By OrganizationTabs = By.xpath("//div[@class='oxd-topbar-body']/nav/ul/li[3]");

    public void UserManagement() {
        Reporter.log("Clicking on  UserManagement  " + UserManagement.toString());
        clickOnElement(UserManagement);
    }

    public void Job() {
        Reporter.log("Clicking on  Job  " + Job.toString());
        clickOnElement(Job);

    }

    public void OrganizationTabs() {
        Reporter.log("Clicking on  OrganizationTabs  " + OrganizationTabs.toString());
        clickOnElement(OrganizationTabs);
    }
}
