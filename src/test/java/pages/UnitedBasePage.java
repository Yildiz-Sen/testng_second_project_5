package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class UnitedBasePage {

    public UnitedBasePage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }







}
