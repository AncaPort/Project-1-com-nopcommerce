package testsuite;
/**
 * Write down the following test into ‘LoginTest’ class
 */

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginTest extends BaseTest {

    String baseUrl = "https://demo.nopcommerce.com/";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    /**
     * 1. userShouldNavigateToLoginPageSuccessfully *
     * * click on the ‘Login’ link
     * * * Verify the text ‘Welcome, Please Sign
     * * In!’
     */
    @Test
    public void userShouldNavigateToLoginPageSuccessfully() {//method
        WebElement loginLink = driver.findElement(By.linkText("Log in"));//click on the ‘Login’ link
        loginLink.click();
        //Verify the text ‘Welcome, Please Sign In!’
        String expectedResult = "Welcome, Please Sign In!";
        String actualResult = driver.findElement(By.xpath("//h1[text()='Welcome, Please Sign In!']")).getText();
        Assert.assertEquals("User is not signin successfully", expectedResult, actualResult);

    }

    /**
     * 2. userShouldLoginSuccessfullyWithValidCredentials
     * * click on the ‘Login’ link
     * * Enter valid username
     * * Enter valid password
     * * Click on ‘LOGIN’ button
     * * Verify the ‘Log out’ text is display
     */
    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials() {
        //click on the ‘Login’ link
        WebElement loginLink = driver.findElement(By.linkText("Log in"));//click on the ‘Login’ link
        loginLink.click();
        //Enter valid username
        driver.findElement(By.id("Email")).sendKeys("prime123@gmail.com");
        //Enter valid password
        driver.findElement(By.id("Password")).sendKeys("prime123");
        //Click on ‘LOGIN’ button
        driver.findElement(By.xpath("//button[text()='Log in']")).click();
        //Verify the ‘Log out’ text is display
        String expectedResult = "Log out";
        String actualResult = driver.findElement(By.xpath("//a[text()='Log out']")).getText();
        Assert.assertEquals("user is not logout successfully", expectedResult, actualResult);
    }

    /**
     * 3. verifyTheErrorMessage
     * * click on the ‘Login’ link
     * * Enter invalid username
     * * Enter invalid password
     * * Click on Login button
     * * Verify the error message ‘Login was unsuccessful.
     * Please correct the errors and try again. No customer account found’
     */
    @Test
    public void verifyTheErrorMessage() {
        //click on the ‘Login’ link
        WebElement loginLink = driver.findElement(By.linkText("Log in"));//click on the ‘Login’ link
        loginLink.click();
        //Enter invalid username
        driver.findElement(By.id("Email")).sendKeys("abcd123@gmail.com");
        //Enter invalid password
        driver.findElement(By.id("Password")).sendKeys("acd123");
        //Click on ‘LOGIN’ button
        driver.findElement(By.xpath("//button[text()='Log in']")).click();
        //Verify the error message ‘Login was unsuccessful.
        //* Please correct the errors and try again. No customer account found’
        String expectedResult = ("Login was unsuccessful. Please correct the errors and try again.\nNo customer account found");
        String actualResult = driver.findElement(By.xpath("//div[@class='message-error validation-summary-errors']")).getText();
        Assert.assertEquals("user is not login successfully", expectedResult, actualResult);
    }

    @After
    public void tearDown(){
        closeBrowser();
    }
}
