package pompackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckOutStepOnePOM
{
    @FindBy(xpath = "//input[@name='firstName']")
    private WebElement firstNameField;

    @FindBy(xpath = "//input[@name='lastName']")
    private WebElement lastNameField;

    @FindBy(xpath = "//input[@name='postalCode']")
    private WebElement pinCOdeField;

    @FindBy(xpath = "//input[@name='continue']")
    private WebElement continueButton;

    public CheckOutStepOnePOM(WebDriver driver)
    {
        PageFactory.initElements(driver,this);
    }

    public WebElement getFirstNameField() {
        return firstNameField;
    }

    public WebElement getLastNameField() {
        return lastNameField;
    }

    public WebElement getPinCOdeField() {
        return pinCOdeField;
    }

    public WebElement getContinueButton() {
        return continueButton;
    }
}
