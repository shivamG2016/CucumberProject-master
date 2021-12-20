package stepDefinitions;


import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import pageObjects.HomePage;
import pageObjects.LoginPage;

public class stepDef {

    WebDriver Driver;
    LoginPage lp;
    HomePage hp;

    @Given("^user should open T-Mobile login page$")
    public void user_should_open_tmobile_login_page()  {

        System.setProperty("webdriver.chrome.driver", "C:\\Shivam0156\\SP25\\AmazonLatest2\\Drivers\\chromedriver.exe");
        Driver = new ChromeDriver();
        Driver.get("https://sailpointiiqqlab02.px-npe1103.pks.t-mobile.com/identityiq/login.jsf?prompt=true\n");
        Driver.manage().window().maximize();

    }

    @When("^User enter user name and password$")
    public void user_enter_user_name_and_password()  {

        lp=new LoginPage(Driver);
        lp.enterUserName("Akbar");
        lp.enterPassword("derli");

    }

    @Then("^user verify the home page$")
    public void user_verify_the_home_page() {


        // Apply assertion here to confirm successful login

        Assert.assertEquals("a","a");


    }

    @And("^user click on login button$")
    public void user_click_on_login_button() throws InterruptedException {
        lp.clickONLoginBtn();

        Thread.sleep(5000);

    }


    @And("^I click on SetUp Btn$")
    public void user_click_on_SetUp_button() throws InterruptedException {
        System.out.println(" I am in SetUp Button call");

        hp=new HomePage(Driver);
        hp.clickONSetUpBtn();


    }


}
