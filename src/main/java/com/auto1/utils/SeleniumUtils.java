package com.auto1.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumUtils {
    private static WebDriver driver;

    public static void waitUntilElementIsReload(WebDriver newDriver, WebElement element) {
        WebDriverWait wait = new WebDriverWait(newDriver, 20);
        wait.until(ExpectedConditions.stalenessOf(element));
    }

    public static void waitForTextToAppear(WebDriver newDriver, String textToAppear, WebElement element) {
        WebDriverWait wait = new WebDriverWait(newDriver,20);
        wait.until(ExpectedConditions.textToBePresentInElement(element, textToAppear));
    }

}
