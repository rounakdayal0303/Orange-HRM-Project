import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class DashboardPage {

    private WebDriver driver;
    private By pimMenu = By.xpath("//span[text()='PIM']");

    public DashboardPage(WebDriver driver) {
        this.driver = driver;
    }

    public AddEmployeePage navigateToPIM() {
        Actions actions = new Actions(driver);
        WebElement pimElement = driver.findElement(pimMenu);
        actions.moveToElement(pimElement).click().perform();
        return new AddEmployeePage(driver);
    }

    public void logout() {
        // Implement logout functionality here
    }
}
