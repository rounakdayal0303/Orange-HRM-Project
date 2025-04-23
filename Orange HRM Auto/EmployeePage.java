import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AddEmployeePage {

    private WebDriver driver;

    private By addEmployeeButton = By.linkText("Add Employee");
    private By firstNameField = By.name("firstName");
    private By middleNameField = By.name("middleName");
    private By lastNameField = By.name("lastName");
    private By saveButton = By.xpath("//button[@type='submit']");
    private By employeeListLink = By.linkText("Employee List");

    public AddEmployeePage(WebDriver driver) {
        this.driver = driver;
    }

     public void clickAddEmployee() {
         // This step might not be needed if the "Add Employee" page is directly loaded
     }

    public void enterEmployeeDetails(String firstName, String middleName, String lastName) {
        driver.findElement(firstNameField).sendKeys(firstName);
        driver.findElement(middleNameField).sendKeys(middleName);
        driver.findElement(lastNameField).sendKeys(lastName);
    }

    public void saveEmployee() {
        driver.findElement(saveButton).click();
    }

    public EmployeeListPage navigateToEmployeeList() {
        driver.findElement(employeeListLink).click();
        return new EmployeeListPage(driver);
    }

    public void addEmployee(String firstName, String middleName, String lastName) {
         enterEmployeeDetails(firstName, middleName, lastName);
         saveEmployee();
    }
}
