package scripts;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pages.UnitedBasePage;
import pages.UnitedMainMenuPage;
import utilities.ConfigReader;
import utilities.Driver;

public class UnitedBase {

    WebDriver driver;
    UnitedBasePage unitedBasePage;
    UnitedMainMenuTest unitedMainMenuTest;
    UnitedMainMenuPage unitedMainMenuPage;


    @BeforeMethod
    public void setUp(){
        driver = Driver.getDriver();
        unitedBasePage = new UnitedBasePage();
        driver.get(ConfigReader.getProperty("appURL"));
    }

    @AfterMethod
    public void tearDown(){
        Driver.quitDriver();
    }

}
