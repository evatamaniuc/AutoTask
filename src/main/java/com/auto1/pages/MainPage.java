package com.auto1.pages;

import com.auto1.pages.modules.Car;
import com.auto1.settings.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.stream.Collectors;

public class MainPage extends WebDriverConfig{

    public MainPage(WebDriver driver) {
        super(driver);
    }

    static By selectContainer = By.cssSelector(".select2-container");
    static By bmwFilter = By.cssSelector("li[data-manufacture-id='130'] div");
    static By carItem = By.cssSelector(".car-item");
    static By carNameData = By.cssSelector(".car-name");
    static By carImageData = By.cssSelector(".car-img img");

    static By stockNumberData = By.cssSelector("tbody tr:nth-child(1) td:last-child");
    static By mileageData = By.cssSelector("tbody tr:nth-child(2) td:last-child");
    static By firstRegistrationData = By.cssSelector("tbody tr:nth-child(3) td:last-child");
    static By horsePowerData = By.cssSelector("tbody tr:nth-child(4) td:last-child");
    static By bodyTypeData = By.cssSelector("tbody tr:nth-child(5) td:last-child");
    static By fuelTypeData = By.cssSelector("tbody tr:nth-child(6) td:last-child");
    static By gearBoxData = By.cssSelector("tbody tr:nth-child(7) td:last-child");


    public WebElement getBWMFilter() {
        return driver.findElement(bmwFilter);
    }

    public WebElement getSelectContainer() {
        return driver.findElement(selectContainer);
    }

    public WebElement getCarName() {
        return driver.findElement(carNameData);
    }

    public List<Car> getCarItems() {
        List<WebElement> elements = driver.findElements(carItem);
        List<Car> cars = elements.stream().map(e -> {
            WebElement carName = e.findElement(carNameData);
            WebElement carImage = e.findElement(carImageData);
            WebElement stock = e.findElement(stockNumberData);
            WebElement mileage = e.findElement(mileageData);
            WebElement firstRegistration = e.findElement(firstRegistrationData);
            WebElement horsePower = e.findElement(horsePowerData);
            WebElement bodyType = e.findElement(bodyTypeData);
            WebElement fuelType = e.findElement(fuelTypeData);
            WebElement gearbox = e.findElement(gearBoxData);
            return new Car(carName, carImage, stock, mileage, firstRegistration, horsePower, bodyType, fuelType, gearbox); }).collect(Collectors.toList());
        return cars;

    }
}
