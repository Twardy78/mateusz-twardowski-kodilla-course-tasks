package com.kodilla.testing2.crudapp;

import com.kodilla.testing2.config.WebDriverConfig;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.*;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class CrudAppTestSuite{
    private static final String BASE_URL = "https://twardy78.github.io";
    private WebDriver driver;
    private Random generator;


    @BeforeEach
    public void initTests() {
        driver = WebDriverConfig.getDriver(WebDriverConfig.CHROME);
        driver.get(BASE_URL);
        generator = new Random();
    }

    @AfterEach
    public void cleanUpAfterTest() {
        driver.close();
    }

    private String createCrudAppTestTask() throws InterruptedException {
        final String XPATH_TASK_NAME = "//form[contains(@action,\"tasks\")]/fieldset[1]/input";
        final String XPATH_TASK_CONTENT = "//form[contains(@action,\"tasks\")]/fieldset[2]/textarea";
        final String XPATH_ADD_BUTTON = "//form[contains(@action,\"tasks\")]/fieldset[3]/button";
        String taskName = "Task number " + generator.nextInt(100000);
        String taskContent = taskName + " content";
        Thread.sleep(5000);

        WebElement name = driver.findElement(By.xpath(XPATH_TASK_NAME));
        name.sendKeys(taskName);

        WebElement content = driver.findElement(By.xpath(XPATH_TASK_CONTENT));
        content.sendKeys(taskContent);

        WebElement addButton = driver.findElement(By.xpath(XPATH_ADD_BUTTON));
        addButton.click();
        Thread.sleep(2000);

        return taskName;
    }

    private void sendTestTaskToTrello(String taskName) throws InterruptedException {
        driver.navigate().refresh();

        while(!driver.findElement(By.xpath("//select[1]")).isDisplayed());

        driver.findElements(
                        By.xpath("//form[@class=\"datatable__row\"]")).stream()
                .filter(anyForm -> anyForm.findElement(By.xpath(".//p[@class=\"datatable__field-value\"]"))
                                .getText().equals(taskName))
                .forEach(theForm -> {
                    WebElement selectElement = theForm.findElement(By.xpath(".//select[1]"));
                    Select select = new Select(selectElement);
                    select.selectByIndex(1);
                    WebElement buttonCreateCard = theForm.findElement(By.xpath(".//button[contains(@class, \"card-creation\")]"));
                    buttonCreateCard.click();
                });
        Thread.sleep(5000);
    }

//    Wymaga poprawy XPath dla aplikacji terllo są stare i nie zdziałają
//
//    private boolean checkTaskExistsInTrello(String taskName) throws InterruptedException {
//        final String TRELLO_URL = "https://trello.com/login";
//        boolean result = false;
//        WebDriver driverTrello = WebDriverConfig.getDriver(WebDriverConfig.CHROME);	// [1]
//        driverTrello.get(TRELLO_URL);                                                // [2]
//
//        driverTrello.findElement(By.id("username")).sendKeys("twardy78@interia.pl");		        // [3]
//        driverTrello.findElement(By.id("password")).sendKeys("78Tward02");		    // [4]
//        WebElement el = driverTrello.findElement(By.id("login"));
//        el.submit();									                                // [5]
//
//        Thread.sleep(4000);								                            // [6]
//
//        driverTrello.findElement(By.id("password")).sendKeys("twoje_haslo");		    // [7]
//        driverTrello.findElement(By.id("login-submit")).submit();
//
//        Thread.sleep(4000);								                            // [8]
//
//        driverTrello.findElements(By.xpath("//a[@class=\"board-tile\"]")).stream()   // [9]
//                .filter(aHref -> aHref.findElements(By.xpath(".//div[@title=\"Kodilla Application\"]")).size() > 0)  // [10]
//                .forEach(WebElement::click);						                        // [11]
//
//        Thread.sleep(4000);								                            // [12]
//
//        result = driverTrello.findElements(By.xpath("//span")).stream()		        // [13]
//                .anyMatch(theSpan -> theSpan.getText().equals(taskName));    		        // [14]
//
//        driverTrello.close();							                            // [15]
//
//        return result;								                                // [16]
//    }

    private void deleteTestTaskToTrello(String taskName) throws InterruptedException {
        driver.navigate().refresh();

        while(!driver.findElement(By.xpath("//select[1]")).isDisplayed());

        driver.findElements(
                        By.xpath("//form[@class=\"datatable__row\"]")).stream()
                .filter(anyForm -> anyForm.findElement(By.xpath(".//p[@class=\"datatable__field-value\"]"))
                        .getText().equals(taskName))
                .forEach(theForm -> {
                    WebElement buttonDeleteCard = theForm.findElement(By.xpath(".//button[4]"));
                    buttonDeleteCard.click();
                });
        Thread.sleep(5000);
    }

    @Test
    public void shouldCreateTrelloCard() throws InterruptedException {
        String taskName = createCrudAppTestTask();
        sendTestTaskToTrello(taskName);
        Thread.sleep(5000);
        //assertTrue(checkTaskExistsInTrello(taskName));
        deleteTestTaskToTrello(taskName);
        Thread.sleep(5000);
    }
}
