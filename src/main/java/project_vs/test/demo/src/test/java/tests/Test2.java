package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.github.javafaker.Faker;

import utilities.Config;
import utilities.Driver;

public class Test2 {

    Faker faker = new Faker();

    @BeforeMethod
    public void startup(){
        Driver.getDriver().get(Config.getValue("url"));
    }
    
    @Test
    public void test1(){
        Driver.getDriver().findElement(By.name("q")).sendKeys(faker.harryPotter().character() + Keys.ENTER);
    }


}
