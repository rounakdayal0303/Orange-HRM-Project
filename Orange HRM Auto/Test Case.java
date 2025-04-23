import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import java.time.Duration;

public class OrangeHRMTest {

    private WebDriver driver;
    private LoginPage loginPage;
    private DashboardPage dashboardPage;
    private AddEmployeePage addEmployeePage;
    private EmployeeListPage employeeListPage;

    @BeforeClass
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        loginPage = new LoginPage(driver);
    }

    @Test
    public void testAddAndVerifyEmployees() {
        dashboardPage = loginPage.login("Admin", "admin123");
        addEmployeePage = dashboardPage.navigateToPIM();

        // Add multiple employees
        addEmployeePage.addEmployee("John", "David", "Smith");
        addEmployeePage.addEmployee("Alice", "Jane", "Doe");
        addEmployeePage.addEmployee("Bob", "Michael", "Johnson");

        employeeListPage = addEmployeePage.navigateToEmployeeList();

        // Verify employees
        employeeListPage.verifyEmployee("John", "Smith");
        employeeListPage.verifyEmployee("Alice", "Doe");
        employeeListPage.verifyEmployee("Bob", "Johnson");
    }

    @AfterClass
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
