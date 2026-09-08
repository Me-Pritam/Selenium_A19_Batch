package dataproviderpackage;

import org.testng.annotations.DataProvider;

public class DataProviderClass
{
    //DataProvider---> It is a one feature or functionality present in
    // TestNG using which we can execute one or more testcases based
    // upon the number of the data is present

    @DataProvider(name = "UserCredentials")
    public Object[][] getData(){

        Object[][] data = new Object[2][2];

        data[0][0] = "standard_user";
        data[0][1] = "secret_sauce";

        data[1][0] = "visual_user";
        data[1][1] = "secret_sauce";


        return data;

    }
}
