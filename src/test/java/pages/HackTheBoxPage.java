package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class HactTheBoxPage {

    public HactTheBoxPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//a[normalize-space()='For individuals']")
    public WebElement forIndividualsLink;
     @FindBy(xpath = "//a[normalize-space()='Join For Free']")
    public WebElement joinForFreeLink;

    @FindBy(xpath = "//input[@id='registerEmail']")
    public WebElement emailInput;

    @FindBy(xpath = "//div[normalize-space()='Sign up']")
    public WebElement signUpButton;

    @FindBy(xpath = "//input[@id='registerPassword']")
    public WebElement registerPassword;
    @FindBy(xpath = "//button[@type='submit']")
    public WebElement continueButton;

    @FindBy(xpath = "//input[@id='createAccountUsername']")
    public WebElement username;

    @FindBy(name = "fullname")
    public WebElement fullName;
    @FindBy(linkText = "Albania")
    public WebElement country;

    @FindBy(xpath = "//input[@id='createAccountCountry']")
    public WebElement openDD;
    @FindBy(xpath = "(//input[@id='dayOfBirth'])[1]")
    public WebElement dayOfBirth;
    @FindBy(xpath = "//input[@id='yearOfBirth']")
    public WebElement yearOfBirth;
    @FindBy(xpath = "//div[@class='v-list-item-title'][normalize-space()='May']")
    public WebElement monthOfBirth;
    @FindBy(xpath = "//input[@id='checkbox-20']")
    public WebElement UserAgreementCheckBox;
    @FindBy(xpath = "//button[@aria-label='Create account']")
    public WebElement CreateAccountButton;
    @FindBy(xpath = "//div[normalize-space()='Resend email verification']")
    public WebElement EmailVerification;
    @FindBy(xpath = "//h2[normalize-space()='Thank you, manaman12.']")
    public WebElement userThankYouAlert ;






}
