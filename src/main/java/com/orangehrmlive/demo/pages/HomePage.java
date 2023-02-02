package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utility.Utility;
import org.openqa.selenium.By;
import org.testng.Reporter;

public class HomePage extends Utility {
    By OrangeHRMlogo = By.xpath("//div[@class='oxd-brand-banner']/img");
    By clickOnAdmin = By.xpath("//nav[@class='oxd-navbar-nav']/div[2]/ul/li[1]");//check
    By PIM = By.xpath("//div[@class='oxd-sidepanel-body']/ul/li[2]");
    By Live = By.xpath("//div[@class='oxd-sidepanel-body']/ul/li[3]");
    By Dashboard = By.xpath("//div[@class='oxd-sidepanel-body']/ul/li[8]");
    By WelcomeText = By.xpath("//span[@class='oxd-topbar-header-breadcrumb']");

    public void OrangeHRMlogo() {
        Reporter.log("Clicking on  OrangeHRMlogo  " + OrangeHRMlogo.toString());
        clickOnElement(OrangeHRMlogo);

    }

    public void clickOnAdminTab() {
        Reporter.log("Clicking on  clickOnAdmin  " + clickOnAdmin.toString());
        clickOnElement(clickOnAdmin);

    }

    public void PIM() {
        Reporter.log("Clicking on  Admin  " + PIM.toString());
        clickOnElement(PIM);

    }

    public void Live() {
        Reporter.log("Clicking on  Admin  " + Live.toString());
        clickOnElement(Live);
    }
    public void Dashboard(){
        Reporter.log("Clicking on  Dashboard  " + Dashboard.toString());
        clickOnElement(Dashboard);
    }
    public String verifyWelcomeText(){
        return getTextFromElement(WelcomeText);
    }



    }

