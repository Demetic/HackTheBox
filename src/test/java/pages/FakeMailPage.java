package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class FakeMailPage {

    public FakeMailPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//a[@class='color cetc']")
    public WebElement fakerEmailCopyButton;
    @FindBy(xpath = "//tbody//td[1]")
    public WebElement fakerEmailOpen;






}
