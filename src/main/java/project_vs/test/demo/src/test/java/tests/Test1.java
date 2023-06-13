package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import com.github.javafaker.Faker;
import utilities.Driver;


public class Test1 {



    @Test
    public void startup(){
        Driver.getDriver().get(utilities.Config.getValue("url"));
    }
    @Test
    public void test1(){
        Driver.getDriver().findElement(By.name("q")).sendKeys("Denzel Washington" + Keys.ENTER);
        }

        @Test
        public void test2(){
            Faker faker = new Faker();
            Driver.getDriver().findElement(By.name("q")).sendKeys(faker.harryPotter().character() + Keys.ENTER);
        }

}
