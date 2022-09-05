package POM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NavigationBarElements extends BasePOM {

    public NavigationBarElements() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//span[text()='Setup']/..")
    private WebElement setupButton;

    @FindBy(xpath = "//span[text()='Parameters']/..")
    private WebElement parametersButton;

    @FindBy(xpath = "//span[text()='Countries']/..")
    private WebElement countriesButton;

    @FindBy(xpath = "//span[text()='Citizenships']/..")
    private WebElement citizenshipButton;

    @FindBy(xpath = "//span[text()='Fees']/..")
    private WebElement feesButton;

    public void navigateToCountriesPage() {
        waitUntilVisibleAndClickableThenClick(setupButton);
        waitUntilVisibleAndClickableThenClick(parametersButton);
        waitUntilVisibleAndClickableThenClick(countriesButton);
    }

    public void navigateToCitizenshipPage() {
        waitUntilVisibleAndClickableThenClick(setupButton);
        waitUntilVisibleAndClickableThenClick(parametersButton);
        waitUntilVisibleAndClickableThenClick(citizenshipButton);
    }

    public void navigateToFeesPage() {
        waitUntilVisibleAndClickableThenClick(setupButton);
        waitUntilVisibleAndClickableThenClick(parametersButton);
        waitUntilVisibleAndClickableThenClick(feesButton);
    }

}
