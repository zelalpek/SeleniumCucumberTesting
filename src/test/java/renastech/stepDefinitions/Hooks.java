package renastech.stepDefinitions;

import io.cucumber.java.Before;
import org.junit.BeforeClass;
import renastech.utils.BrowserUtils;
import renastech.utils.ConfigurationsReader;
import renastech.utils.Driver;

public class Hooks extends BrowserUtils {

    @Before
    public void setup(){

        Driver.getDriver();

        BrowserUtils.setWaitTime();
        driver.manage().window().maximize();
        driver.get(ConfigurationsReader.getProperties("urlHRM"));
        System.out.println("website is launched");

    }


}
