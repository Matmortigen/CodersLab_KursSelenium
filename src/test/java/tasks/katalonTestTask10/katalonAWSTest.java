package tasks.katalonTestTask10;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.junit.Before;
import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class katalonAWSTest {

    private WebDriver driver;

    @Before
    public void SetUp() {
        System.setProperty("webdriver.chrome.driver",
                "src/main/resources/drivers/chromedriver.exe");
        driver = new ChromeDriver();
        // Zmaksymalizuj okno przeglądarki
        driver.manage().window().maximize();
        // Przejdź do Google
        driver.get("https://katalon-test.s3.amazonaws.com/demo-aut/dist/html/form.html");
    }


    @Test
    public void tearDown() {

        // put first name
        WebElement firstName = driver.findElement(By.id("first-name"));
        firstName.clear();
        firstName.sendKeys("1111");

        // put last name
        WebElement lastName = driver.findElement(By.id("last-name"));
        lastName.clear();
        lastName.sendKeys("Kowalski");

        // click Male gender
        WebElement maleGender = driver.findElement(By.xpath("//*[@id='infoForm']/div[3]/div/div/label[1]/input"));
        maleGender.click();

        // put date of birth
        WebElement birthDate = driver.findElement(By.id("dob"));
        birthDate.clear();
        birthDate.sendKeys("05/22/2010");

        //put address
        WebElement address = driver.findElement(By.id("address"));
        address.clear();
        address.sendKeys("Prosta 51");

        //put email
        WebElement email = driver.findElement(By.id("email"));
        email.clear();
        email.sendKeys("karol.kowalski@mailinator.com");

        //put password
        WebElement password = driver.findElement(By.id("password"));
        password.clear();
        password.sendKeys("Pass123");

        //put company
        WebElement company = driver.findElement(By.id("company"));
        company.clear();
        company.sendKeys("Coders Lab");

        //select role
        WebElement menu = driver.findElement(By.id("role"));
        Select role = new Select(menu);
        role.selectByVisibleText("Business Analyst");

        //select job expection
        WebElement expection = driver.findElement(By.xpath("//*[@id='expectation']/option[1]"));
        expection.click();

        //select ways of development
        WebElement waysDevelopment = driver.findElement(By.xpath("//*[@id='infoForm']/div[11]/div/div[2]/label/input"));
        waysDevelopment.click();
        WebElement waysDevelopment2 = driver.findElement(By.xpath("//*[@id='infoForm']/div[11]/div/div[5]/label/input"));
        waysDevelopment2.click();
        WebElement waysDevelopment3 = driver.findElement(By.xpath("//*[@id='infoForm']/div[11]/div/div[6]/label/input"));
        waysDevelopment3.click();

        //put comment
        WebElement comment = driver.findElement(By.id("comment"));
        comment.clear();
        comment.sendKeys("To jest mój pierwszy automat testowy");

        //submit
        WebElement submit = driver.findElement(By.id("submit"));
        submit.click();

        //assert success message
        WebElement successMessage = driver.findElement(By.id("submit-msg"));
        Assert.assertTrue(successMessage.getText().contains("Successfully submitted!"));

    }

    @After
    public void fillFormTest() {
        driver.quit();
    }

}
