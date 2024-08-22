package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class HomePage {

    public HomePage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//div[contains(text(),'Login')]")
    public WebElement loginLink;
    @FindBy(xpath = "(//a[@class='sub-link d-flex align-items-center justify-content-between bg-hover'])[4]")
    public WebElement HTBlabs;
    @FindBy(xpath = "//input[@id='loginEmail']")
    public WebElement loginEmail;
    @FindBy(xpath = "//input[@id='loginPassword']")
    public WebElement loginPassword;
    @FindBy(xpath = "//button[@aria-label='Sign in']")
    public WebElement signIn;
    @FindBy(xpath = "//span[@class='font-size14 color-white align-center cursorPointer userNameText ml-2']")
    public WebElement verifySignIn;




}
