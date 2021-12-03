package Test;

import Base.Base;
import Pages.BasePage;
import Pages.CustomerPage;
import Pages.HomePage;
import Pages.LoginPage;
import Util.DriverUtil;
import Util.PropertiesReadingUtil;
import org.testng.annotations.Test;

import java.util.HashMap;

public class Guru99Test extends Base {
    LoginPage loginPage;
    HomePage homePage;
    CustomerPage customerPage;

    @Test
    public void TC1PageTextVerify(){
        DriverUtil.getDriver().get(PropertiesReadingUtil.getProperties("guru99_url"));
        loginPage=new LoginPage();
        loginPage.pageTextVerify();
    }
    @Test
    public void TC2LoginGuru99(){
        DriverUtil.getDriver().get(PropertiesReadingUtil.getProperties("guru99_url"));
        loginPage=new LoginPage();
        loginPage.loginGuru99(PropertiesReadingUtil.getProperties("guru99_userID"),PropertiesReadingUtil.getProperties("guru99_password"));
    }
    @Test
    public void TC3HomePageVer() throws InterruptedException {
        DriverUtil.getDriver().get(PropertiesReadingUtil.getProperties("guru99_url"));
        loginPage=new LoginPage();
        loginPage.loginGuru99(PropertiesReadingUtil.getProperties("guru99_userID"),PropertiesReadingUtil.getProperties("guru99_password"));

        homePage=new HomePage();
        homePage.homePageText();

        }
        @Test

        public void TC4CustomerPage(){
            DriverUtil.getDriver().get(PropertiesReadingUtil.getProperties("guru99_url"));
            loginPage=new LoginPage();
            loginPage.loginGuru99(PropertiesReadingUtil.getProperties("guru99_userID"),PropertiesReadingUtil.getProperties("guru99_password"));

            customerPage=new CustomerPage();
            customerPage.VerificationNewCustomerPage();
            customerPage.CustomerDataEntry();
            customerPage.NewCustomerAddedSuccess();
        }

}
