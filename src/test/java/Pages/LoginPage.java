package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class LoginPage extends BasePage {

    @FindBy(css ="input[name='uid']")
    WebElement userIDBox;

    @FindBy(css ="input[name='password']")
    WebElement passwordBox;

    @FindBy(css = "input[name='btnLogin']")
    WebElement loginButton;

    @FindBy(css = "h2[class='barone']")
    WebElement pageText;

    public void loginGuru99(String userid,String password){
        userIDBox.sendKeys(userid);
        passwordBox.sendKeys(password);
        loginButton.click();
    }
    public void pageTextVerify(){
        String expectedText="Guru99 Bank";
     //   Assert.assertTrue(expectedText.equals(pageText.getText()),"Guru99 Bank is not present");
//        Assert.assertTrue(pageText.isDisplayed(),"Guru99 Bank is not present");

    }

}
