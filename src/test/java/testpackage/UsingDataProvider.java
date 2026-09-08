package testpackage;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class UsingDataProvider
{
    @Test(dataProvider = "UserCredentials",dataProviderClass = dataproviderpackage.DataProviderClass.class)
    public void doLogIn(String userName,String password)
    {
        Reporter.log("The UserName ~ "+userName+" is entered",true);

        Reporter.log("The Password ~ "+password+" is entered",true);

        Reporter.log("The LogIn Button is Clicked",true);
    }
}
