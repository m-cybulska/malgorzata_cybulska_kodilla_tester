package com.kodilla.selenium.pom;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class KodillaStoreTest {

    private KodillaStorePage storePage;
    private WebDriver driver;

    @BeforeEach
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "c:\\Selenium-drivers\\Chrome\\chromedriver.exe");

        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(chromeOptions);
        driver.navigate().to("https://kodilla.com/pl/test/store");
        storePage = new KodillaStorePage(driver);
    }

    @Test
    public void testSearchResults_Validation() {
        validateSearchResults("NoteBook", 2);
        validateSearchResults("School", 1);
        validateSearchResults("Brand", 1);
        validateSearchResults("Business", 0);
        validateSearchResults("Gaming", 1);
        validateSearchResults("Powerful", 0);
    }

    @Test
    public void testSearch_CaseInsensitiveValidation() {
        validateSearchResults("NOTEBOOK", 2);
        validateSearchResults("notebook", 2);
        validateSearchResults("nOtEbOoK", 2);
    }

    private void validateSearchResults(String query, int expectedCount) {
        int actualCount = storePage.search(query);
        System.out.println("Search query: '" + query + "' - Expected count: " + expectedCount + ", Actual count: " + actualCount);

        assertEquals(expectedCount, actualCount, "Unexpected number of results for query: " + query);
    }

    @AfterEach
    public void tearDown() {
        driver.quit();
    }
}