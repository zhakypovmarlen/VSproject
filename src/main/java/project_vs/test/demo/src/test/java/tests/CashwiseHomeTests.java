package tests;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.github.javafaker.Faker;

import pages.CashwiseHomePage;
import utilities.ApplicationFlow;
import utilities.Config;
import utilities.Driver;

public class CashwiseHomeTests {
    
    Faker faker = new Faker();

    @BeforeMethod
    public void setup(){
        Driver.getDriver().get(Config.getValue("cashwiseURL"));
    }


    @Test
    public void contactUs(){
        CashwiseHomePage cashWiseHomePage = new CashwiseHomePage();
        cashWiseHomePage.sendMyInfo(faker.harryPotter().character(), faker.phoneNumber().subscriberNumber(9), faker.internet().emailAddress());
        Assert.assertTrue(cashWiseHomePage.contactSubmittedPopup.isDisplayed());
        ApplicationFlow.pause(2000);
    }

    @Test
    public void languageOptionTest(){
        CashwiseHomePage cashWiseHomePage = new CashwiseHomePage();
        cashWiseHomePage.languageOptionsBtn.click();
        for(WebElement option : cashWiseHomePage.languageOptions){
            System.out.println(option.getText());
        }
        Assert.assertEquals(cashWiseHomePage.languageOptions.size(), 2);
        ApplicationFlow.pause(2000);
    }

    @AfterClass
    public void cleanup(){
        Driver.getDriver().quit();
    }


}
