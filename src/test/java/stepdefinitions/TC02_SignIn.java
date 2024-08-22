package stepdefinitions;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.poi.ss.usermodel.*;
import org.openqa.selenium.Keys;
import pages.HomePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ExcelReader;
import utilities.WaitUtils;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Set;

import static java.sql.Types.BOOLEAN;
import static org.apache.poi.ss.formula.DataValidationEvaluator.ValidationEnum.FORMULA;


public class TC02_SignIn {
    static String firstWindow;
    static Sheet sheet;
    static String username;
    static String password;
    FileInputStream signIn = new FileInputStream("src/test/resources/Test Data.xlsx");


    Workbook workbook = WorkbookFactory.create(signIn);

    HomePage homePage = new HomePage();


    public TC02_SignIn() throws IOException {
    }

    @Given("user navigates to the HTB home page")
    public void userNavigatesToTheHTBHomePage() {
//        Driver.getDriver().get(ConfigReader.getProperty("url"));
    }

    @When("user clicks on the login button")
    public void userClicksOnTheLoginButton() {
//        homePage.loginLink.click();
    }

    @Then("user clicks on the HTB Labs")
    public void userClicksOnTheHTBLabs() {
//        homePage.HTBlabs.click();
//        firstWindow = Driver.getDriver().getWindowHandle();
    }

    @And("user enters a valid email address,username,password")
    public void userEntersAValidEmailAddress() {

//        Set<String> newWindowHandles = Driver.getDriver().getWindowHandles();
//
//        for (String windowHandle : newWindowHandles) {
//            if (!windowHandle.equals(firstWindow)) {
//                Driver.getDriver().switchTo().window(windowHandle);
//                break;
//            }
//        }

//        sheet = workbook.getSheetAt(0);

        String path ="src/test/resources/Test Data.xlsx";
        ExcelReader excelReader =new ExcelReader(path,"Sheet1");
        for (int i = 1; i <excelReader.rowCount() ; i++) {
            Driver.getDriver().get(ConfigReader.getProperty("url"));
            homePage.loginLink.click();
            homePage.HTBlabs.click();
            firstWindow = Driver.getDriver().getWindowHandle();
            Set<String> newWindowHandles = Driver.getDriver().getWindowHandles();

            for (String windowHandle : newWindowHandles) {
                if (!windowHandle.equals(firstWindow)) {
                    Driver.getDriver().switchTo().window(windowHandle);
                    break;
                }
            }
            username = excelReader.getCellData(i, 0);
            password = excelReader.getCellData(i, 1);
            homePage.loginEmail.sendKeys(username + Keys.TAB);
            WaitUtils.waitFor(1);
            homePage.loginPassword.sendKeys(password);
            homePage.signIn.click();
            homePage.signIn.click();
//            homePage.verifySignIn.isDisplayed();
            Driver.getDriver().close(); // Close the current window
            Driver.getDriver().switchTo().window(firstWindow);

        }
        Driver.quitDriver();


//        for (Row row : sheet) {
//            if (row.getRowNum() == 1) {
//                username = row.getCell(0).getStringCellValue();
//                password = row.getCell(1).getStringCellValue();
//
//                break;
//            }
//
//        }
//        homePage.loginEmail.sendKeys(username + Keys.TAB);
//        WaitUtils.waitFor(1);
//        homePage.loginPassword.sendKeys(password);
    }


    @And("user clicks the sign-in button")
    public void userClicksTheSignInButton() {
//        homePage.signIn.click();
    }

    @And("verify the user is signed in successfully")
    public void verifyTheUserIsSignedInSuccessfully() {
//        homePage.verifySignIn.isDisplayed();
    }
}