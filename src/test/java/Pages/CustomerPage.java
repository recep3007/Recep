package Pages;

import Util.DriverUtil;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.github.javafaker.Faker;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import java.sql.Driver;
import java.util.logging.SocketHandler;

public class CustomerPage extends BasePage{

    @FindBy(linkText = "New Customer")
    WebElement newCustomerButton;


    @FindBy(css = "input[name='name']")
    WebElement customerNameBox;

    @FindBy(css = "input[name='dob']")
    WebElement dateOfBirthBox;

    @FindBy(css = "textarea[name='addr']")
    WebElement addressBox;

    @FindBy(xpath = "//input[@name='city']" )
    public WebElement cityBox;

    @FindBy(xpath = "//input[@name='state']")
    public WebElement stateBox;

    @FindBy(xpath = "//input[@name='pinno']")
    public WebElement pinBox;

    @FindBy(xpath = "//input[@name='telephoneno']" )
    public WebElement mobileNumberBox;


    @FindBy(xpath = "//input[@name='emailid']")
    public WebElement emailBox;

    @FindBy(xpath = "//input[@name='password']" )
    public WebElement passwordBox;

    @FindBy(xpath = "//input[@name='sub']" )
    public WebElement submitButton;

    @FindBy(css = "p[class='heading3']")
    public WebElement succesText;



    public void VerificationNewCustomerPage (){
        newCustomerButton.click();
        boolean newCustomer= DriverUtil.getDriver().getTitle().contains("New Customer Entry Page");
        Assert.assertTrue(newCustomer,"Verifaction Failed ");
        System.out.println("-------New Entry Page-----");
    }

    public void CustomerDataEntry(){
        Faker faker=new Faker();
        customerNameBox.sendKeys(faker.name().fullName());
        dateOfBirthBox.sendKeys("05101995");
        addressBox.sendKeys(faker.address().streetAddress());
        cityBox.sendKeys(faker.address().city());
        stateBox.sendKeys(faker.address().state());
        pinBox.sendKeys("123456");
        mobileNumberBox.sendKeys("5365959452");
        emailBox.sendKeys(faker.internet().emailAddress());
        passwordBox.sendKeys("12345632");
        submitButton.click();
    }
    public void NewCustomerAddedSuccess(){
        String str="Customer Registered Successfully!!!";
        Assert.assertEquals(succesText.getText(),str,"");

    }
}
