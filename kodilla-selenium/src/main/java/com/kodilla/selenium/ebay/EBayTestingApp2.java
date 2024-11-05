package com.kodilla.selenium.ebay;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class EBayTestingApp2 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "c:\\Selenium-drivers\\Chrome\\chromedriver.exe");
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(chromeOptions);
        driver.get("https://ebay.com/");

        WebElement categoryCombo = driver.findElement(By.className("gh-sb"));
        Select categorySelect = new Select(categoryCombo);
        categorySelect.selectByVisibleText("Books");

        WebElement inputField = driver.findElement(By.name("_nkw"));
        inputField.sendKeys("Harry Potter");
        inputField.submit();

        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#item5e5ef12909 > div")));

        List<WebElement> productCards = driver.findElements(By.cssSelector("li.s-item"));

        for (WebElement product : productCards) {
            System.out.println(product.getText());
            System.out.println("-----");
        }
    }
}