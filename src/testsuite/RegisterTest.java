package testsuite;
/**
 * 5. Write down the following test into ‘RegisterTest’
 * class
 */

import browserfactory.BaseTest;
import com.google.common.base.Verify;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

public class RegisterTest extends BaseTest {

    String baseUrl = "https://demo.nopcommerce.com/";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    /**
     * 1. userShouldNavigateToRegisterPageSuccessfully
     * * click on the ‘Register’ link
     * * Verify the text ‘Register’
     */
    @Test
    public void userShouldNavigateToRegisterPageSuccessfully() {
        // click on the ‘Register’ link
        driver.findElement(By.xpath("//a[@class='ico-register']")).click();
        //Verify the text ‘Register’
        String expectedResult = "Register";
        String actualResult = driver.findElement(By.xpath("//h1[text()='Register']")).getText();
        Assert.assertEquals("user not able to register successfully", expectedResult, actualResult);
    }

    /**
     * 2. userSholdRegisterAccountSuccessfully *
     * click on the ‘Register’ link
     * * Select gender radio button
     * * Enter First name
     * * Enter Last name
     * * Select Day Month and Year
     * * Enter Email address
     * * Enter Password
     * * Enter Confirm password
     * * Click on REGISTER button
     * * Verify the text 'Your registration
     * completed’
     */
    @Test
    public void userSholdRegisterAccountSuccessfully() {
        // click on the ‘Register’ link
        driver.findElement(By.xpath("//a[@class='ico-register']")).click();
        // Select gender radio button
        driver.findElement(By.xpath("//input[@id='gender-female']")).click();
        //Enter First name
        driver.findElement(By.id("FirstName")).sendKeys("tom");
        //Enter Last name
        driver.findElement(By.id("LastName")).sendKeys("beckham");
        //Select Day Month and Year
        driver.findElement(By.name("DateOfBirthDay")).click();
        driver.findElement(By.name("DateOfBirthMonth")).click();
        driver.findElement(By.name("DateOfBirthYear")).click();
        //Enter Email address
        driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("tombeckham@gmail.com");
        //Enter Password
        driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("tom123");
        //Enter Confirm password
        driver.findElement(By.xpath("//input[@name='ConfirmPassword']")).sendKeys("tom123");
        //Click on REGISTER button
        driver.findElement(By.xpath("//button[@id='register-button']")).click();
        // Verify the text 'Your registration completed’
        String expectedResult = "Your registration completed";
        String actualResult = driver.findElement(By.xpath("//div[text()='Your registration completed']")).getText();
        Assert.assertEquals("your are not able to register", expectedResult, actualResult);
    }
    @After
    public void tearDown(){
        closeBrowser();
    }
}
