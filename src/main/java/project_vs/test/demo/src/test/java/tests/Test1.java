package tests;

import static org.junit.Assert.assertTrue;

import java.io.ObjectInputFilter.Config;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import utilities.ApplicationFlow;
import utilities.Driver;


public class Test1 
{

    @Before
    public void startup(){
        Driver.getDriver().get(utilities.Config.getValue("url"));
    }
    
    @Test
    public void test1(){
        Driver.getDriver().findElement(By.name("q")).sendKeys("Denzel Washington" + Keys.ENTER);
        
        
    }

    @After
    public void cleanup(){
        Driver.getDriver().quit();
    }

}
