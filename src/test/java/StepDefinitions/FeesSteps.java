package StepDefinitions;

import POM.DialogContentElements;
import POM.NavigationBarElements;
import io.cucumber.java.en.Then;

public class FeesSteps {

    NavigationBarElements navigationBarElements;
    DialogContentElements dialogContentElements;

    @Then("User create Fee {string} and {string} and {string} and {string}")
    public void user_create_fee_and_and_and(String name, String code, String integrationCode, String priority) {
        navigationBarElements = new NavigationBarElements();
        dialogContentElements = new DialogContentElements();

        navigationBarElements.navigateToFeesPage();
        dialogContentElements.createFee(name, code, integrationCode, priority);
    }

    @Then("User edit Fee {string} and change it to {string}")
    public void user_edit_fee_and_change_it_to(String existingFeeName, String newFeeName) {
        navigationBarElements = new NavigationBarElements();
        dialogContentElements = new DialogContentElements();

        navigationBarElements.navigateToFeesPage();
        dialogContentElements.editFee(existingFeeName, newFeeName);
    }

    @Then("User delete Fee {string}")
    public void user_delete_fee(String name) {
        navigationBarElements = new NavigationBarElements();
        dialogContentElements = new DialogContentElements();

        navigationBarElements.navigateToFeesPage();
        dialogContentElements.deleteFee(name);
    }

}
