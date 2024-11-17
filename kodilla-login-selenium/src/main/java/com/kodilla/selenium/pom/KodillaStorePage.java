package com.kodilla.selenium.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class KodillaStorePage {

    private WebDriver driver;

    public KodillaStorePage(WebDriver driver) {
        this.driver = driver;
    }

    public int search(String query) {
        WebElement searchBox = driver.findElement(By.id("searchField"));
        searchBox.clear();
        searchBox.sendKeys(query);

        WebDriverWait wait = new WebDriverWait(driver, 10);
        try {
            List<WebElement> results = wait.until(
                    ExpectedConditions.presenceOfAllElementsLocatedBy(By.cssSelector(".element"))
            );
            System.out.println("Results found: " + results.size());
            return results.size();
        } catch (Exception e) {
            System.out.println("No search results found for query: '" + query + "'.");
            return 0;
        }
    }
}