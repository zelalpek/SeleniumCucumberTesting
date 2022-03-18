package renastech.stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import renastech.pages.Home;
import renastech.pages.Payment;
import renastech.pages.Verification;
import renastech.utils.BrowserUtils;
import renastech.utils.ConfigurationsReader;
import renastech.utils.Driver;

import java.time.Year;
import java.util.Map;

public class Steps extends BrowserUtils {


    @Given("The user wants to see payment gateway website")
    public void the_user_wants_to_see_payment_gateway_website() {
        Driver.getDriver();
        driver.get(ConfigurationsReader.getProperties("url"));
        BrowserUtils.setWaitTime();
        driver.manage().window().maximize();
        System.out.println("website is launched");
    }
    @When("The user wants to buy elephant toy")
    public void the_user_wants_to_buy_elephant_toy() {
        Home home= new Home();
        home.setBuyNow();


    }
    @Then("The user wants to enter payment information as")
    public void the_user_wants_to_enter_payment_information_as(Map<String,String> dataTable) {
        Payment payment= new Payment();
        payment.setCardnumber(dataTable.get("CNumber"));
        payment.setMonth(dataTable.get("EMonth"));
        payment.setYear(dataTable.get("EYear"));
        payment.setCvvCode(dataTable.get("CVV"));

    }
    @Then("The user wants to pay now")
    public void the_user_wants_to_pay_now() {
       Payment payNow= new Payment();
       payNow.setPayButton();

    }
    @Then("The user wants to verify message as {string}")
    public void the_user_wants_to_verify_message_as(String expected) {
       Verification verification = new Verification();
       verification.setVerificationText(expected);

    }


}
