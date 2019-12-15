package tasks.aavtrainTestTask14;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class registrationAccount {
    public String firstName;
    public String lastName;
    public String emailAddress;
    public String username;
    public String addressa;
    public String addressb;
    public String phoneNumber;
    public String city;
    public String state;
    public String zip;
    public String password;
    private WebDriver driver;

    @Given("^pierwsza instrukcja$")
    public void pierwszaInstrukcja() {
        // Skonfiguruj sterownik przeglądarki
        System.setProperty("webdriver.chrome.driver", "src/main/resources/drivers/chromedriver.exe");
        // Uruchom nowy egzemplarz przeglądarki Chrome
        driver = new ChromeDriver();
        // Zmaksymalizuj okno przeglądarki
        driver.manage().window().maximize();
        // Przejdź do Google
        driver.get("https://aavtrain.com/");
    }

    @And("^druga instrukcja$")
    public void drugaInstrukcja() {
        WebElement registrationHere = driver.findElement(By.xpath("/html/body/table/tbody/tr/td[2]/table/tbody/tr/td/div[2]/div[2]/table/tbody/tr/td[2]/div/table/tbody/tr[1]/td/div/a"));
        registrationHere.click();
    }

    @When("^trzecia instrukcja (.*) (.*) (.*) (.*) (.*) (.*) (.*) (.*) (.*) (.*) (.*)$")
    public void trzeciaInstrukcjaFirstNameLastNameEmailAddressUsernameAddressaAddressbPhoneNumberCityStateZipPassword(String firstName, String lastName, String emailAddress, String username, String addressa, String addressb, String phoneNumber, String city, String state, String zip, String password) throws Throwable {
        // Znajdź element wprowadzania tekstu na podstawie jego nazwy
        WebElement element1 = driver.findElement(By.name("first_name"));
        // Wpisz informacje do wyszukania
        element1.sendKeys(firstName);        // Znajdź element wprowadzania tekstu na podstawie jego nazwy
        WebElement element122 = driver.findElement(By.name("last_name"));
        // Wpisz informacje do wyszukania
        element122.sendKeys(lastName);        // Znajdź element wprowadzania tekstu na podstawie jego nazwy
        WebElement element2 = driver.findElement(By.name("email"));
        // Wpisz informacje do wyszukania
        element2.sendKeys(emailAddress);        // Znajdź element wprowadzania tekstu na podstawie jego nazwy
        WebElement element3 = driver.findElement(By.name("user_name"));
        // Wpisz informacje do wyszukania
        element3.sendKeys(username);        // Znajdź element wprowadzania tekstu na podstawie jego nazwy
        WebElement element4 = driver.findElement(By.name("address1"));
        // Wpisz informacje do wyszukania
        element4.sendKeys(addressa);        // Znajdź element wprowadzania tekstu na podstawie jego nazwy
        WebElement element5 = driver.findElement(By.name("address2"));
        // Wpisz informacje do wyszukania
        element5.sendKeys(addressb);        // Znajdź element wprowadzania tekstu na podstawie jego nazwy
        WebElement element6 = driver.findElement(By.name("phone"));
        // Wpisz informacje do wyszukania
        element6.sendKeys(phoneNumber);        // Znajdź element wprowadzania tekstu na podstawie jego nazwy
        WebElement element7 = driver.findElement(By.name("city"));
        // Wpisz informacje do wyszukania
        element7.sendKeys(city);        // Znajdź element wprowadzania tekstu na podstawie jego nazwy
        WebElement element8 = driver.findElement(By.name("prov"));
        // Wpisz informacje do wyszukania
        element8.sendKeys(state);        // Znajdź element wprowadzania tekstu na podstawie jego nazwy
        WebElement element9 = driver.findElement(By.name("zip"));
        // Wpisz informacje do wyszukania
        element9.sendKeys(zip);        // Znajdź element wprowadzania tekstu na podstawie jego nazwy
        WebElement element10 = driver.findElement(By.name("password"));
        // Wpisz informacje do wyszukania
        element10.sendKeys(password);
    }

    @And("^czwarta instrukcja$")
    public void czwartaInstrukcja() {
        WebElement submit = driver.findElement(By.name("Submit"));
        submit.click();
    }

    @Then("^piata instrukcja$")
    public void piataInstrukcja() {
        // Asercja do zrobienia!!!!!
        //WebElement fieldRegistration = driver.findElement(By.xpath("/html/body/table/tbody/tr/td[2]/table/tbody/tr/td/div[2]/div/strong/text()[1]"));
    }

    @And("^szosta instrukcja$")
    public void szostaInstrukcja() {
        driver.quit();
    }
}