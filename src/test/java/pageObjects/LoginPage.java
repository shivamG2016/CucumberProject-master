package pageObjects;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    WebDriver localDriver;

    // here we have to create a constructor

    public LoginPage(WebDriver remoteDriver) {


        localDriver = remoteDriver;

        PageFactory.initElements(remoteDriver, this);

    }

    @FindBy(xpath = "//input[@id='loginForm:accountId']")
    WebElement userNameFiled;
    @FindBy(xpath = "//input[@id='loginForm:password']")
    WebElement passwordFiled;
    @FindBy(xpath = "//input[@id='loginForm:loginButton']")
    WebElement loginBtn;


    // Here we have to create Action methods

    public void enterUserName(String username) {

        userNameFiled.sendKeys(username);

    }
    public void enterPassword(String password) {

        passwordFiled.sendKeys(password);

    }

    public void clickONLoginBtn() {

        loginBtn.click();

    }

}
