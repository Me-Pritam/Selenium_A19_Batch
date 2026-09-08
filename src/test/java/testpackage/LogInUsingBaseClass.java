package testpackage;

import basepackage.LogInBaseClass;
import dataproviderpackage.DataProviderClass;
import org.testng.annotations.Test;

public class LogInUsingBaseClass extends LogInBaseClass
{

    @Test(dataProvider = "UserCredentials",dataProviderClass = dataproviderpackage.DataProviderClass.class)
    public void performLogIn(String username,String dpassword)
    {
        action.writeInInputField(login.getUserNameField(), username);
        action.writeInInputField(login.getPasswordField(),dpassword);
        action.clickOnElement(login.getLogInButton());
    }

}
