package Base;

import Util.DriverUtil;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class Base {
    @BeforeMethod
    public void setUp(){
        DriverUtil.getDriver().manage().window().maximize();
    }

//    @AfterMethod
//    public void closing(){
//
//    }
}
