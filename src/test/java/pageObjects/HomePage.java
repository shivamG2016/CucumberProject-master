package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {


    WebDriver localDriver;

    public HomePage(WebDriver remoteDriver) {


        localDriver = remoteDriver;

        PageFactory.initElements(remoteDriver, this);

    }

    @FindBy(xpath = "//body/div[2]/div[1]/div[1]/nav[1]/ul[1]/li[7]/a[1]")
    WebElement SetUpBtn;

// Actions Functions
public void clickONSetUpBtn() {

    SetUpBtn.click();

}







}
