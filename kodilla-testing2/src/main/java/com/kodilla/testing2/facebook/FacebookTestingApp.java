package com.kodilla.testing2.facebook;

import com.kodilla.testing2.config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class FacebookTestingApp {
    private static final String FACEBOOK_URL = "https://www.facebook.com/";

    public static void main(String[] args) {

        WebDriver chromeDriver = WebDriverConfig.getDriver(WebDriverConfig.CHROME);
        chromeDriver.get("https://pl-pl.facebook.com/");
        try {
            Thread.sleep(500);
            WebElement cookiesElement = chromeDriver.findElement(By.xpath("(//div[contains(@class, 'x1i10hfl') and contains(@class, 'xjbqb8w') and contains(@class, 'x1ejq31n')])[6]"));
            cookiesElement.click();

            Thread.sleep(500);
            WebElement newCountElement = chromeDriver.findElement(By.xpath("(//a[@data-testid='open-registration-form-button'])"));
            newCountElement.click();

            Thread.sleep(500);
            WebElement newNameElement = chromeDriver.findElement(By.xpath("(//input[@name='firstname'])"));
            WebElement newLastNameElement = chromeDriver.findElement(By.xpath("(//input[@name='lastname'])"));
            WebElement newDayElement = chromeDriver.findElement(By.xpath("(//select[@name='birthday_day'])"));
            WebElement newMonthElement = chromeDriver.findElement(By.xpath("(//select[@name='birthday_month'])"));
            WebElement newYearElement = chromeDriver.findElement(By.xpath("(//select[@name='birthday_year'])"));
            Select selectDay = new Select(newDayElement);
            Select selectMonth = new Select(newMonthElement);
            Select selectYear = new Select(newYearElement);
            newNameElement.sendKeys("Marek");
            newLastNameElement.sendKeys("Kruk");
            selectDay.selectByValue("13");
            selectMonth.selectByValue("9");
            selectYear.selectByValue("1990");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }




    }
}
