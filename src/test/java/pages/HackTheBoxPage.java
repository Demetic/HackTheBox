package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class HackTheBoxPage {

    public HackTheBoxPage(){
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
    @FindBy(xpath = "//*[.='Albania']")
    public WebElement countryAlbania;

    @FindBy(xpath = "//input[@id='createAccountCountry']")
    public WebElement countryDD;
    @FindBy(xpath = "(//input[@id='dayOfBirth'])[1]")
    public WebElement dayOfBirth;
    @FindBy(xpath = "//input[@id='yearOfBirth']")
    public WebElement yearOfBirth;
    @FindBy(xpath = "//input[@id='monthOfBirth']")
    public WebElement monthOfBirthDD;
//    @FindBy(xpath = "//*[.='July']")
//    public WebElement monthOfBirthJuly;
    @FindBy(xpath = "//*[.='January']")
    public WebElement monthOfBirthJanuary;

    @FindBy(xpath = "//*[.='February']")
    public WebElement monthOfBirthFebruary;

    @FindBy(xpath = "//*[.='March']")
    public WebElement monthOfBirthMarch;

    @FindBy(xpath = "//*[.='April']")
    public WebElement monthOfBirthApril;

    @FindBy(xpath = "//*[.='May']")
    public WebElement monthOfBirthMay;

    @FindBy(xpath = "//*[.='June']")
    public WebElement monthOfBirthJune;

    @FindBy(xpath = "//*[.='July']")
    public WebElement monthOfBirthJuly;

    @FindBy(xpath = "//*[.='August']")
    public WebElement monthOfBirthAugust;

    @FindBy(xpath = "//*[.='September']")
    public WebElement monthOfBirthSeptember;

    @FindBy(xpath = "//*[.='October']")
    public WebElement monthOfBirthOctober;

    @FindBy(xpath = "//*[.='November']")
    public WebElement monthOfBirthNovember;

    @FindBy(xpath = "//*[.='December']")
    public WebElement monthOfBirthDecember;
    @FindBy(xpath = "//input[@id='checkbox-20']")
    public WebElement UserAgreementCheckBox;
    @FindBy(xpath = "//button[@aria-label='Create account']")
    public WebElement CreateAccountButton;
    @FindBy(xpath = "//div[normalize-space()='Resend email verification']")
    public WebElement EmailVerification;
    @FindBy(xpath = "//h2[@class='tk-neue-haas-unica text-left font-size20 color-white font-weight-light pt-6']")
    public WebElement userThankYouAlert ;
    @FindBy(xpath = "//a[.='Resend email verification']")
    public WebElement resendLink ;
    @FindBy(xpath = "//a[@class='button button-primary']")
    public WebElement verifyEmailLink  ;
    @FindBy(xpath = "//span[normalize-space()='Software Engineer']")
    public WebElement sofwareEngineer  ;
    @FindBy(xpath = "//span[normalize-space()='Continue']")
    public WebElement contiune ;
    @FindBy(xpath = "//span[normalize-space()='User Settings']")
    public WebElement userSettings;
    @FindBy(xpath = "//div[@id='scrolling-techniques-7']//div[4]//div[1]//div[1]//div[1]//div[1]//div[1]")
    public WebElement softwareDevelopment;
    @FindBy(xpath = "(//div[@class='v-input--selection-controls__ripple'])[4]")
    public WebElement softwareDevelopment1;
    @FindBy(xpath = "//span[normalize-space()='Continue']")
    public WebElement continuelast;
    @FindBy(xpath = "//span[normalize-space()='Complete']")
    public WebElement complete;
    @FindBy(xpath = "//span[@class='font-size14 color-white align-center cursorPointer userNameText ml-2']")
    public WebElement EnterUser;
    @FindBy(xpath = "//span[normalize-space()='Account Settings']")
    public WebElement accountSetting;
    @FindBy(xpath = "//span[normalize-space()='User Settings']")
    public WebElement userSettings1;
    @FindBy(xpath = "//input[@id='userSettingsUsername']")
    public WebElement userSettingsUsernam;
    @FindBy(xpath = "//div[contains(text(),'Save changes')]")
    public WebElement saveChanges;
    @FindBy(xpath = "//div[@class='mt-0 role cursorPointer rounded col selected']//div[@class='mt-4 col col-10']")
    public WebElement NonTechnical;
    @FindBy(xpath = "(//button[@type='button'])[3]")
    public WebElement skipOnBoarding;
    @FindBy(xpath = "(//div[@class='v-autocomplete__selection'])[2]")
    public List<WebElement> monthOptions;






















}