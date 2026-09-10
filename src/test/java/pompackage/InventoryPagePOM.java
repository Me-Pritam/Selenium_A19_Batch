package pompackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class InventoryPagePOM
{
    @FindBy(xpath = "//div[@class='inventory_item']")
    private List<WebElement> allProducts;

    public InventoryPagePOM(WebDriver driver)
    {
        PageFactory.initElements(driver,this);
    }

    public List<WebElement> getAllProducts() {
        return allProducts;
    }

    public void selectDesiredProductByName(String productName)
    {
        for(WebElement element : allProducts)
        {
            String actualProductName = element.findElement(By.xpath(".//descendant::div[@class='inventory_item_label']/a")).getText();

            if (actualProductName.equals(productName)){

                element.findElement(By.xpath("./descendant::div[@class='inventory_item_label']/a"))
                        .click();

                break;

            }


        }
    }
}
