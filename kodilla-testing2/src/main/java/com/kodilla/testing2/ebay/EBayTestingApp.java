package com.kodilla.testing2.ebay;

import com.kodilla.testing2.config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class EBayTestingApp {
    public static final String EBAYESEARCHFIELD = "_nkw";

    public static void main(String[] args) {

        WebDriver chomeDriver = WebDriverConfig.getDriver(WebDriverConfig.CHROME);
        chomeDriver.get("https://www.ebay.pl");

        WebElement searchField = chomeDriver.findElement(By.name(EBAYESEARCHFIELD));
        searchField.sendKeys("laptop Asus");
        searchField.submit();
    }
}
