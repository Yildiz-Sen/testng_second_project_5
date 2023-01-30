package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UnitedMainMenuPage {

    public UnitedMainMenuPage(){
        super();
    }

    @FindBy(id = "#headerNav0-modal")
    public WebElement bookMenu;

    @FindBy(id = "#headerNav1-modal")
    public WebElement myTripsMenu;

    @FindBy(id = "#headerNav2-modal")
    public WebElement travelsInfoMenu;

    @FindBy(id = "headerNav3-modal")
    public WebElement mileageplusMenu;

    @FindBy(id = "headerNav4-modal")
    public WebElement dealsMenu;

    @FindBy(id = "headerNav5-modal")
    public WebElement helpMenu;
}
