package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class UnitedMainMenuPage extends UnitedBasePage{



    public UnitedMainMenuPage(){
        super();
    }

    @FindBy(css = "div[role='tablist'] a")
    public List<WebElement> mainMenu;

    @FindBy(xpath = "(//ul[@role='tablist'])[1]/li")
    public List<WebElement> bookTravelTabs;

    @FindBy(id = "roundtrip")
    public WebElement roundTripButton;

    @FindBy(css = "label[for='roundtrip']")
    public WebElement roundTripDisplay;

    @FindBy(id = "oneway")
    public WebElement oneWayButton;

    @FindBy(css = "label[for='oneway']")
    public WebElement oneWayDisplay;

    @FindBy(css = "div[aria-label='Book with miles']")
    public WebElement bookWithMilesCheckbox;

    @FindBy(id = "award")
    public WebElement bookWithMilesCheckboxSelect;

    @FindBy(css = "div[aria-label='Flexible dates']")
    public WebElement flexibleDatesCheckbox;

    @FindBy(id = "flexibleDates")
    public WebElement flexibleDatesCheckboxSelect;

    @FindBy(id = "bookFlightOriginInput")
    public WebElement fromButton;

    @FindBy(css = "button[class*='clearButton']")
    public WebElement clearFromButton;

    @FindBy(id = "bookFlightDestinationInput")
    public WebElement toButton;

    @FindBy(css = "input[name='DepartDate']")
    public WebElement departDateButton;

    @FindBy(css = "button[aria-label*='Move backward']")
    public WebElement previousMonthButton;

    @FindBy(css = "td[aria-label*='February 28']")
    public WebElement dateInput;

    @FindBy(css = "button[class*='passengerButton']")
    public WebElement passengerButton;

    @FindBy(css = "button[aria-label='Substract one Adult']")
    public WebElement addAnAdult;

    @FindBy(css = "button[class*='listBoxMainButton']")
    public WebElement selectClassButton;

    @FindBy(css = "li[aria-label='Business or First']")
    public WebElement selectBusinessOrFirstClass;

    @FindBy(css = "button[aria-label='Find flights']")
    public WebElement findFlightsButton;

    @FindBy(xpath = "(//div[@class='app-components-Shopping-ColumnSortResultHeader-styles__detailHeading--2d8nC'])[2]")
    public WebElement departureDetails;




















   /* @FindBy(css = "button[class*='menuButton']")
    public WebElement mainMenuButton;

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

    */
}
