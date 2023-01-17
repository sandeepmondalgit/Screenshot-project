package Stepdef;
import SauceDemo.SwagLabs;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.io.IOException;

public class MyStepdefs {

    SwagLabs test = new SwagLabs();
    @Given("user should open url")
    public void userShouldOpenUrl() throws IOException {
        test.urlPage();
    }
    @When("user able to login")
    public void userAbleToLogin() throws IOException {
        test.login();
    }
    @Given("user choose a product")
    public void userChooseAProduct() throws IOException {
        test.AddToCart();
        test.Cart();
        test.CheckOut();
    }
    @When("user give the details")
    public void userGiveTheDetails() throws IOException {
        test.Information();
    }
    @Then("User should overview order")
    public void userShouldOverviewOrder() throws IOException {
        test.Overview();
    }
    @When("User back to homepage")
    public void userBackToHomepage() throws InterruptedException, IOException {
        test.BackToHome();
    }
    @Then("User can logout")
    public void userCanLogout() throws InterruptedException, IOException {
        test.Logout();
    }
    @Given("User able to close the browser")
    public void userAbleToCloseTheBrowser() throws InterruptedException {
        test.Quit();
    }
}
