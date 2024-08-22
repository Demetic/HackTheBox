package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilities.ConfigReader;
import utilities.Driver;

public class TC01_User_Generation_Spotify {
    @Given("user navigates to spotify home page")
    public void user_navigates_to_spotify_home_page() {
        Driver.getDriver().get(ConfigReader.getProperty("url"));
    }
    @Given("user clicks sign up button")
    public void user_clicks_sign_up_button() {

    }
    @Given("user click the e mail field then click next button")
    public void user_click_the_e_mail_field_then_click_next_button() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Given("user enter valid e mail adress")
    public void user_enter_valid_e_mail_adress() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Given("user enter valid password then click next button")
    public void user_enter_valid_password_then_click_next_button() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Given("user enter valid name")
    public void user_enter_valid_name() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Given("user enter valid date of birth")
    public void user_enter_valid_date_of_birth() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Given("user enter gender then click next button")
    public void user_enter_gender_then_click_next_button() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("user click term and conditions check box then user click sign up button")
    public void user_click_term_and_conditions_check_box_then_user_click_sign_up_button() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("verify new profile created")
    public void verify_new_profile_created() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

}
