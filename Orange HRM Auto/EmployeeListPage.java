import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.List;

public class EmployeeListPage {

    private WebDriver driver;

    public EmployeeListPage(WebDriver driver) {
        this.driver = driver;
    }

    public boolean verifyEmployee(String firstName, String lastName) {
        String employeeFullName = firstName + " " + lastName;
        List<WebElement> employeeList = driver.findElements(By.xpath("//div[@class='oxd-table-body']/div[@class='oxd-table-card']"));

        for (WebElement employee : employeeList) {
            String name = employee.findElement(By.xpath(".//div[@class='oxd-table-cell oxd-padding-cell'][2]/div")).getText();
            if (name.equals(employeeFullName)) {
                System.out.println("Name Verified for: " + employeeFullName);
                return true;
            }
        }
        return false;
    }
}
