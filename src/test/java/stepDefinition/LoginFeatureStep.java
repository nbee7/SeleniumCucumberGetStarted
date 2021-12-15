package stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginFeatureStep {


    @Given("user is on login page")
    public void user_is_on_login_page() {
        System.out.println("masuk ke login page");
    }
    @When("user enters username and password")
    public void user_enters_username_and_password() {
        System.out.println("masukan username dan password");
    }
    @When("click on login button")
    public void click_on_login_button() {
        System.out.println("klik login button");
    }
    @Then("user is navigated to the home page")
    public void user_is_navigated_to_the_home_page() {
        System.out.println("user berhasil login ke home page");
    }
}
