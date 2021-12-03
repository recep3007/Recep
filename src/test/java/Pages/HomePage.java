package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class HomePage extends BasePage{
    @FindBy(xpath = "//td[contains(text(),'mngr')]")
    WebElement homePageText;


    public void homePageText(){
        String str="Manger Id: mngr368294";
        boolean boo=homePageText.getText().contains(str);
        Assert.assertTrue(boo,"Verification Failed with Given Text expected "+homePageText.getText());

    }
}
