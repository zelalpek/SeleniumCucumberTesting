package renastech.pages;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import renastech.utils.BrowserUtils;
import renastech.utils.ConfigurationsReader;
import renastech.utils.Driver;

public class Payment extends BrowserUtils {


    public Payment() {
       PageFactory.initElements(driver, this);
    }


    @FindBy(id = "card_nmuber")
    private WebElement cardnumber;
    @FindBy(id = "month")
    private WebElement month;
    @FindBy(id = "year")
    private WebElement year;
    @FindBy(id = "cvv_code")
    private WebElement cvvCode;
    @FindBy(xpath = "//input[@value='Pay $20.00']")
    private WebElement payButton;




    public void setCardnumber(String CardNumber) {
        staticWait(1);
        cardnumber.sendKeys(CardNumber);
    }

    public void setMonth(String Month){
        staticWait(2);
        month.sendKeys(Month);
    }
    public void setYear(String Year){
        staticWait(2);
        year.sendKeys(Year);
    }
    public void setCvvCode(String CvvCode){
        staticWait(2);
        cvvCode.sendKeys(CvvCode);

    }
    public void setPayButton(){
       staticWait(2);
       payButton.click();
    }





}