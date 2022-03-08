import com.nopCommerce.demo.basePage.BasePage;
import com.nopCommerce.demo.basePage.LoginPage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.Properties;

public class LoginPageTest {
    BasePage basePage;
    Properties prop;
    WebDriver driver;
    LoginPage loginPage;

    @BeforeTest
    public void openBrowser() throws InterruptedException{
        basePage = new BasePage();
        prop = basePage.initialiseProperties();
        String browser = prop.getProperty("browser");
        driver = basePage.initialiseDriver(browser);
        driver.get(prop.getProperty("url"));
        Thread.sleep(2000);
        loginPage = new LoginPage(driver);
    }
    @Test
    public  void login ()throws InterruptedException{
        loginPage.doLogin(prop.getProperty("email"),prop.getProperty("password"));
        Thread.sleep(2000);

    }
    @Test
    public void tearDown(){
        driver.quit();
    }
        }
