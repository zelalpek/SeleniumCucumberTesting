package renastech.pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import renastech.utils.BrowserUtils;

public class Verification extends BrowserUtils {

    public Verification() {
        PageFactory.initElements(driver, this); }

    @FindBy(xpath ="//h2[.='Payment successfull!']" )
    private WebElement verificationText;




    public void setVerificationText(String expected){

        String actual= verificationText.getText();

        Assert.assertEquals(actual,expected,"test failed ");

    }
}
