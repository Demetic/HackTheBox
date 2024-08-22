package stepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.FakeMailPage;
import pages.HackTheBoxPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.WaitUtils;

import java.time.Duration;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class TC01_User_Generation_HackTheBox {
    static String username;
    static String fullName; //I try something for dynamic code
    Faker faker = new Faker();
    static String hackTheBoxWindow;
    static String fakeMailWindowHandle;
    HackTheBoxPage hackPage = new HackTheBoxPage();
    FakeMailPage fakePage = new FakeMailPage();

    @Given("user navigates to hackthebox home page")
    public void user_navigates_to_hackthebox_home_page() {
        WebDriver driver = Driver.getDriver();
        driver.get(ConfigReader.getProperty("url"));
        hackTheBoxWindow = driver.getWindowHandle();
        try {
            Assert.assertTrue("HackTheBox home page did not load correctly.",
                    driver.getTitle().contains("Hack The Box"));
        }catch(TimeoutException e){
            System.out.println("Page did not load: " + e.getMessage());

        }
    }

    @When("user clicks For Individuals button")
    public void user_clicks_for_individuals_button() {
        hackPage.forIndividualsLink.click();
        WaitUtils.waitFor(1);
        Assert.assertTrue("For Individuals button was not clicked or page did not load.",
                hackPage.joinForFreeLink.isDisplayed());
    }

    @Then("user clicks Join for free button")
    public void user_clicks_join_for_free_button() {
        hackPage.joinForFreeLink.click();
        WaitUtils.waitFor(1);
        Assert.assertTrue("Join for Free button was not clicked or page did not load.",
                hackPage.emailInput.isDisplayed());
    }

    @And("user enter valid e mail address then sign up button")
    public void user_enter_valid_e_mail_address_then_sign_up_button() {

        Driver.getDriver().switchTo().newWindow(WindowType.WINDOW);
        WaitUtils.waitFor(1);
        Driver.getDriver().get(ConfigReader.getProperty("fakerEmailUrl"));
        WaitUtils.waitFor(1);

        fakeMailWindowHandle = Driver.getDriver().getWindowHandle();
        fakePage.fakerEmailCopyButton.click();
        WaitUtils.waitFor(1);
        Driver.getDriver().switchTo().window(hackTheBoxWindow);
        WaitUtils.waitFor(1);

        hackPage.emailInput.click();
        hackPage.emailInput.sendKeys(Keys.CONTROL + "v");
        hackPage.signUpButton.click();

        Assert.assertTrue("Sign Up button was not clicked ",
                hackPage.registerPassword.isDisplayed());
    }

    @And("user enter valid password then click continue button")
    public void user_enter_valid_password_then_click_continue_button() {
        String pwd = faker.internet().password(12, 15, true, true, true).concat("1#A");
        hackPage.registerPassword.sendKeys(pwd);
        hackPage.continueButton.click();
        Assert.assertTrue("Continue button was not clicked or password input failed.",
                hackPage.username.isDisplayed());
    }

    @And("user enter valid username")
    public void user_enter_valid_username() {
        username = faker.letterify("????") + faker.numerify("####");
        hackPage.username.sendKeys(username);
        Assert.assertTrue("Username was not entered correctly.",
                hackPage.fullName.isDisplayed());
    }

    @And("user enter valid fullname")
    public void user_enter_valid_fullname() {
        fullName = faker.name().fullName();
        hackPage.fullName.sendKeys(fullName);
    }

    @Given("user select country")
    public void user_select_country() {
        hackPage.countryDD.click();
        List<WebElement> countryList=Driver.getDriver().findElements(By.xpath("//div[@class='v-list-item__content']"));
        System.out.println("countryList = " + countryList.size());

        Random random = new Random();

        // Select a random index, starting from 1 to skip the default empty option if present
        int randomIndex = random.nextInt(countryList.size() - 1) + 1;

        // Click the randomly selected month
        countryList.get(randomIndex).click();
//        hackPage.countryAlbania.click();
    }

    @Given("user enter valid date of birth")
    public void user_enter_valid_date_of_birth() {

//            hackPage.monthOfBirthDD.click();
//            hackPage.monthOfBirthJuly.click();
        hackPage.monthOfBirthDD.click();

        // Create a Random object
        Random random = new Random();

        // Generate a random number between 1 and 12
        int randomMonth = random.nextInt(12) + 1;

        // Use a switch statement to select the random month
        switch (randomMonth) {
            case 1:
                hackPage.monthOfBirthJanuary.click();
                break;
            case 2:
                hackPage.monthOfBirthFebruary.click();
                break;
            case 3:
                hackPage.monthOfBirthMarch.click();
                break;
            case 4:
                hackPage.monthOfBirthApril.click();
                break;
            case 5:
                hackPage.monthOfBirthMay.click();
                break;
            case 6:
                hackPage.monthOfBirthJune.click();
                break;
            case 7:
                hackPage.monthOfBirthJuly.click();
                break;
            case 8:
                hackPage.monthOfBirthAugust.click();
                break;
            case 9:
                hackPage.monthOfBirthSeptember.click();
                break;
            case 10:
                hackPage.monthOfBirthOctober.click();
                break;
            case 11:
                hackPage.monthOfBirthNovember.click();
                break;
            case 12:
                hackPage.monthOfBirthDecember.click();
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + randomMonth);
        }

            int randomDay = (int) (Math.random() * 28) + 1;
            hackPage.dayOfBirth.clear();
            hackPage.dayOfBirth.sendKeys(String.valueOf(randomDay));

        int randomYear = (int) (Math.random() * (2000 - 1970 + 1)) + 1970;
        hackPage.yearOfBirth.clear();
        hackPage.yearOfBirth.sendKeys(String.valueOf(randomYear));

    }

    @And("user click user agreement and the privacy notice check box")
    public void user_click_user_agreement_and_the_privacy_notice_check_box() {
        hackPage.UserAgreementCheckBox.click();
    }

    @And("user clicks create account button")
    public void user_clicks_create_account_button() {
        try {
            hackPage.CreateAccountButton.click();
            WaitUtils.waitFor(2);
            hackPage.CreateAccountButton.click();
            Assert.assertTrue("Create account button was not clicked or account creation failed.",
                    hackPage.resendLink.isDisplayed());
        } catch (NoSuchElementException e) {
            Assert.fail("system-generated alert indicating that you are a bot,.");
        }
    }

    @And("verify pending e mail verification alert")
    public void verify_pending_e_mail_verification_alert() {
        try {
            hackPage.resendLink.click();
            WaitUtils.waitFor(12);
            Assert.assertTrue("Email verification alert was not displayed.",
                    hackPage.EmailVerification.isDisplayed());
        } catch (AssertionError | NoSuchElementException e) {
            Assert.fail("Email verification alert was not displayed.");
        }
    }

    @And("user open verification email and verify e mail address link")
    public void user_open_verification_email_and_verify_e_mail_address_link() {
        Driver.getDriver().switchTo().window(fakeMailWindowHandle);
        WaitUtils.waitFor(5);
        fakePage.fakerEmailOpen.click();
        Driver.getDriver().switchTo().frame(1);
        hackPage.verifyEmailLink.click();
        WaitUtils.waitFor(5);
    }

    @And("verify user account created")
    public void verify_user_account_created() {

//        onhackTheBoxWindow = Driver.getDriver().getWindowHandle();

        WaitUtils.waitFor(5);

        Set<String> AllWindow= Driver.getDriver().getWindowHandles();
        for(String eachHandle :AllWindow){
            if(!eachHandle.equals(hackTheBoxWindow) && !eachHandle.equals(fakeMailWindowHandle)){

                Driver.getDriver().switchTo().window(eachHandle);

                break;
            }

        }

        hackPage.skipOnBoarding.click();
        hackPage.skipOnBoarding.click();


    }
}