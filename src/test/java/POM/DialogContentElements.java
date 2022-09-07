package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

public class DialogContentElements extends BasePOM{

    public DialogContentElements() {

        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//ms-add-button[contains(@tooltip,'TITLE.ADD')]//button")
    private WebElement addButton;

    @FindBy(css = "ms-text-field[formcontrolname='name']>input")
    private WebElement nameInput;

    @FindBy(css = "ms-text-field[formcontrolname='code']>input")
    private WebElement codeInput;

    @FindBy(css = "ms-text-field[formcontrolname='budgetAccountIntegrationCode']>input")
    private WebElement integrationCodeInput;

    @FindBy(css = "ms-integer-field[formcontrolname='priority']>input")
    private WebElement priorityInput;

    @FindBy(css = "ms-save-button>button")
    private WebElement saveButton;

    @FindBy(xpath = "//div[contains(text(),'success')]")
    private WebElement successMessage;

    @FindBy(css = "ms-text-field[placeholder='GENERAL.FIELD.NAME']>input")
    private WebElement nameSearchInput;

    @FindBy(css = "ms-search-button>div>button")
    private WebElement searchButton;

    @FindBy(css = "ms-edit-button>button")
    private WebElement editButton;

    @FindBy(css = "ms-delete-button>button")
    private WebElement deleteButton;

    @FindBy(xpath = "//span[text()=' Delete ']/..")
    private WebElement deleteSubmitButton;

    @FindBy(css = "ms-text-field[formcontrolname='shortName']>input")
    private WebElement shortNameInput;


    public void createCountry() {
        addButton.click();
        nameInput.sendKeys("KorayTestCountry999");
        codeInput.sendKeys("KTC999");
        saveButton.click();
    }

    public void validateSuccessMessage() {
        wait.until(ExpectedConditions.visibilityOf(successMessage));
        Assert.assertTrue(successMessage.isDisplayed());
        Assert.assertTrue(successMessage.getText().toLowerCase().contains("successfully"));
    }

    public void editCountry() {
        nameSearchInput.sendKeys("KorayTestCountry999");
        searchButton.click();
        editButton.click();
        nameInput.clear();
        nameInput.sendKeys("KorayTestCountry321");
        saveButton.click();
    }

    public void deleteCountry() {
        nameSearchInput.sendKeys("KorayTestCountry321");
        searchButton.click();
        waitUntilVisibleAndClickableThenClick(deleteButton);
        waitUntilVisibleAndClickableThenClick(deleteSubmitButton);
    }

    public void createCitizenship(String name, String shortName) {
        addButton.click();
        nameInput.sendKeys(name);
        shortNameInput.sendKeys(shortName);
        saveButton.click();
    }

    public void editCitizenship(String existingName, String newName) {
        nameSearchInput.sendKeys(existingName);
        searchButton.click();
        wait.until(ExpectedConditions.numberOfElementsToBe(By.cssSelector("tbody[role='rowgroup']>tr"), 1));
        editButton.click();
        wait.until(ExpectedConditions.visibilityOf(nameInput));
        nameInput.clear();
        nameInput.sendKeys(newName);
        saveButton.click();
    }

    public void deleteCitizenship(String name) {
        nameSearchInput.sendKeys(name);
        searchButton.click();
        wait.until(ExpectedConditions.numberOfElementsToBe(By.cssSelector("tbody[role='rowgroup']>tr"), 1));
        deleteButton.click();
        deleteSubmitButton.click();
    }

    public void createFee(String name, String code, String integrationCode, String priority) {
        addButton.click();
        nameInput.sendKeys(name);
        codeInput.sendKeys(code);
        integrationCodeInput.sendKeys(integrationCode);
        priorityInput.sendKeys(priority);
        saveButton.click();
    }

    public void editFee(String existingFeeName, String newFeeName) {
        nameSearchInput.sendKeys(existingFeeName);
        searchButton.click();
        wait.until(ExpectedConditions.numberOfElementsToBe(By.cssSelector("tbody[role='rowgroup']>tr"), 1));
        editButton.click();
        wait.until(ExpectedConditions.visibilityOf(nameInput));
        nameInput.clear();
        nameInput.sendKeys(newFeeName);
        saveButton.click();
    }

    public void deleteFee(String name) {
        nameSearchInput.sendKeys(name);
        searchButton.click();
        wait.until(ExpectedConditions.numberOfElementsToBe(By.cssSelector("tbody[role='rowgroup']>tr"), 1));
        deleteButton.click();
        deleteSubmitButton.click();
    }

}
