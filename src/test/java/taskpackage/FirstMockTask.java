/*
1. Open Edge Browser
2. Open demo web shop
3. Perform LogIn
4. Go to Books page
5. Locate all the books from that Select the book which has name "Health Book".
6. Locate the price of the book and print this in console as "Actual price".
7. Make quantity as 10.
8. Add to Cart.
9. Go to Cart.
10. Verify The Quantity is same as given quantity
11. Verify Price is same as "Actual Price".
12. Verify the TOTAL PRICE is correct or not.
13. Delete the Book from Cart.
14. Verify the Book is not present in CART Page
*/


package taskpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;
import java.util.List;

public class FirstMockTask
{
    public static void main(String[] args)
    {
        String quantity= "10";

        try
        {
            System.setProperty("webdriver.edge.driver","./AllBrowserDrivers/msedgedriver.exe");
            WebDriver driver = new EdgeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5));
            driver.get("https://demowebshop.tricentis.com/");
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
            driver.findElement(By.xpath("//a[.='Log in']")).click();
            driver.findElement(By.xpath("//input[@name='Email']"))
                    .sendKeys("bmail@gmail.com");
            driver.findElement(By.xpath("//input[@name='Password']"))
                    .sendKeys("Password@1234");
            driver.findElement(By.xpath("//input[@value='Log in']"))
                    .click();
            driver.findElement(By.xpath("//div[@class='header-menu']/descendant::a[@href='/books']"))
                    .click();
            List<WebElement> allBookNames = driver.findElements(By.xpath("//div[@class='item-box']/descendant::h2/a"));

            for(WebElement name : allBookNames)
            {
                if (name.getText().equals("Health Book"))
                {
                    name.click();
                    break;
                }
            }
            String actualPrice = driver.findElement(By.xpath("//div[@class='product-price']/span"))
                                        .getText();
            System.out.println("The Actual Price of the Book is --> "+actualPrice);
            WebElement quantityBox = driver.findElement(By.xpath("//input[@id='addtocart_22_EnteredQuantity']"));
            quantityBox.clear();
            quantityBox.sendKeys(quantity);
            driver.findElement(By.xpath("//input[@id='add-to-cart-button-22']"))
                    .click();
            driver.findElement(By.xpath("//a[@href='/cart']"))
                    .click();
            String cartQuantity = driver.findElement(By.xpath("//table[@class='cart']/descendant::td[@class='qty nobr']/input"))
                    .getAttribute("value");
            if (cartQuantity.equals(quantity))
            {
                System.out.println("The Quantity is Same");
            }
            else{
                System.out.println("The Quantity is different");
            }
            String cartPrice= driver.findElement(By.xpath("//table[@class='cart']/descendant::td[@class='unit-price nobr']/span[@class='product-unit-price']")).getText();
            if (cartPrice.equals(actualPrice))
            {
                System.out.println("The Price is same");
            }
            else{
                System.out.println("The Price is different");
            }
            String totalPrice = driver.findElement(By.xpath("//table[@class='cart']/descendant::td[@class='subtotal nobr end']/span[@class='product-subtotal']"))
                    .getText();
            if (totalPrice.equals("100.00"))
            {
                System.out.println("The Total Price is same");
            }
            else {
                System.out.println("The total price is different");
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

    }
}
