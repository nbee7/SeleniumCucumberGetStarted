package stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;


public class GoogleSearchStep {

    WebDriver driver;

    @Given("Browser is open")
    public void browser_is_open() {
        System.out.println("browser is open");
        System.setProperty("webdriver.chrome.driver","E:\\Chromedriver\\chromedriver.exe");

        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));

    }
    @And("user is on google search page")
    public void user_is_on_google_search_page() {
        System.out.println("user is on google search page");
        driver.navigate().to("https://www.google.com/");
    }
    @When("user enters a keywoard in search box")
    public void user_enters_a_keywoard_in_search_box() {
        System.out.println("user input keyworad in search box");
        driver.findElement(By.name("q")).sendKeys("kusonime");
    }
    @And("click enter")
    public void click_enter() {
        System.out.println("user click enter");
        driver.findElement(By.name("q")).sendKeys(Keys.ENTER);

//        ini buat memperlambat kalo kecepetan automationnya
//        Thread.sleep(2000);
    }
    @Then("user is navigated to search result")
    public void user_is_navigated_to_search_result() {
        System.out.println("user navigated search result");
        driver.getPageSource().contains("Kusonime - Download Anime Batch Subtitle Indonesia");
        driver.close();
        driver.quit();
    }
}
