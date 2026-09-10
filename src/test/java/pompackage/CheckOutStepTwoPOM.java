package pompackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckOutStepTwoPOM
{
    @FindBy(xpath = "//button[@id='finish']")
    private WebElement finishButton;

    public CheckOutStepTwoPOM(WebDriver driver)
    {
        PageFactory.initElements(driver,this);
    }

    public WebElement getFinishButton() {
        return finishButton;
    }
}
