package testsuite;
/**
 * 4. Write down the following test into ‘TopMenuTest’
 * class
 * 1. userShouldNavigateToComputerPageSuccessfully
 * * click on the ‘Computers’ Tab
 * * Verify the text ‘Computers’
 * 2. userShouldNavigateToElectronicsPageSuccessfully
 * * click on the ‘Electronics’ Tab
 * * Verify the text ‘Electronics’
 * 3. userShouldNavigateToApparelPageSuccessfully
 * * click on the ‘Apparel’ Tab
 * * Verify the text ‘Apparel’ 4.
 * userShouldNavigateToDigitalDownloadsPageSuccessfully
 * * click on the ‘Digital downloads’ Tab
 * * Verify the text ‘Digital downloads’
 */

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

public class TopMenuTest extends BaseTest {

    String baseUrl = "https://demo.nopcommerce.com/";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    /**
     * 1. userShouldNavigateToComputerPageSuccessfully
     * * * click on the ‘Computers’ Tab
     * * * Verify the text ‘Computers’
     */
    @Test
    public void userShouldNavigateToComputerPageSuccessfully() {
        //click on the ‘Computers’ Tab
        driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[text() ='Computers ']")).click();
        //Verify the text ‘Computers’
        String expectedResult = ("Computers");
        String actualResult = driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[text() ='Computers ']")).getText();
        Assert.assertEquals("user is not able to navigate on computers tab", expectedResult, actualResult);
    }

    /**
     * 2. userShouldNavigateToElectronicsPageSuccessfully
     * * click on the ‘Electronics’ Tab
     * * Verify the text ‘Electronics’
     */
    @Test
    public void userShouldNavigateToElectronicsPageSuccessfully() {
        //click on the ‘Electronics’ Tab
        driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[text() ='Electronics ']")).click();
        //Verify the text ‘Electronics’
        String expectedResult = ("Electronics");
        String actualResult = driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[text() ='Electronics ']")).getText();
        Assert.assertEquals("user is not able to navigate on Electronics tab", expectedResult, actualResult);
    }

    /**
     * 3. userShouldNavigateToApparelPageSuccessfully
     * * click on the ‘Apparel’ Tab
     * * Verify the text ‘Apparel’
     */
    @Test
    public void userShouldNavigateToApparelPageSuccessfully() {
        //click on the ‘Apparel’ Tab
        driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[text() ='Apparel ']")).click();
        //Verify the text ‘Apparel’
        String expectedResult = ("Apparel");
        String actualResult = driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[text() ='Apparel ']")).getText();
        Assert.assertEquals("user is not able to navigate on Apparel tab", expectedResult, actualResult);
    }

    /**
     * 4.
     * userShouldNavigateToDigitalDownloadsPageSuccessfully
     * * click on the ‘Digital downloads’ Tab
     * * Verify the text ‘Digital downloads’
     */
    @Test
    public void userShouldNavigateToDigitalDownloadsPageSuccessfully() {
        //click on the ‘Digital downloads’ Tab
        driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[text() ='Digital downloads ']")).click();
        //Verify the text ‘Digital downloads’
        String expectedResult = ("Digital downloads");
        String actualResult = driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[text() ='Digital downloads ']")).getText();
        Assert.assertEquals("user is not able to navigate on Digital downloads tab", expectedResult, actualResult);
    }

    /**
     * 5. userShouldNavigateToBooksPageSuccessfully
     * * click on the ‘Books’ Tab
     * * Verify the text ‘Books’
     */
    @Test
    public void userShouldNavigateToBooksPageSuccessfully() {
        //click on the ‘Books’ Tab
        driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[text() ='Books ']")).click();
        //Verify the text ‘Books’
        String expectedResult = ("Books");
        String actualResult = driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[text() ='Books ']")).getText();
        Assert.assertEquals("user is not able to navigate on Books tab", expectedResult, actualResult);
    }

    /**
     * 6. userShouldNavigateToJewelryPageSuccessfully
     * * click on the ‘Jewelry’ Tab
     * * Verify the text ‘Jewelry’
     */
    @Test
    public void userShouldNavigateToJewelryPageSuccessfully() {
        //click on the ‘Jewelry’ Tab
        driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[text() ='Jewelry ']")).click();
        // Verify the text ‘Jewelry’
        String expectedResult = ("Jewelry");
        String actualResult = driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[text() ='Jewelry ']")).getText();
        Assert.assertEquals("user is not able to navigate on Jewelry tab", expectedResult, actualResult);
    }

    /**
     * 7. userShouldNavigateToGiftCardsPageSuccessfully
     * * click on the ‘Gift Cards’ Tab
     * * Verify the text ‘Gift Cards’
     */
    @Test
    public void userShouldNavigateToGiftCardsPageSuccessfully() {
        //click on the ‘Gift Cards’ Tab
        driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[text() ='Gift Cards ']")).click();
        // Verify the text ‘Gift Cards’
        String expectedResult = ("Gift Cards");
        String actualResult = driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[text() ='Gift Cards ']")).getText();
        Assert.assertEquals("user is not able to navigate on Gift Cards tab", expectedResult, actualResult);
    }
    @After
    public void tearDown(){
        closeBrowser();
    }
}
