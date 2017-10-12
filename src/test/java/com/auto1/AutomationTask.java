package com.auto1;

import com.auto1.pages.MainPage;
import com.auto1.pages.modules.Car;
import com.auto1.settings.WebDriverConfig;
import com.auto1.utils.SeleniumUtils;
import org.testng.annotations.Test;

import java.util.List;

import static org.testng.Assert.assertTrue;

public class AutomationTask extends WebDriverConfig{

    private String filterData = "BMW";

    //Verify that BMW filter return BMW cars with their data
    @Test
    public void bmwFilter() {
        MainPage mainPage = new MainPage(driver);
        mainPage.getBWMFilter().click();
        assertTrue(mainPage.getSelectContainer().getText().contains(filterData), "Filter does not contains " + filterData);
        SeleniumUtils.waitUntilElementIsReload(driver, mainPage.getCarName());
        SeleniumUtils.waitForTextToAppear(driver, filterData,  mainPage.getCarName());
        List<Car> cars = mainPage.getCarItems();
        for (int i=0; i<=cars.size()-1; i++){
            Car car = cars.get(i);
            assertTrue(!car.getCarNameData().getText().isEmpty(), "Car " + i + " not contains " + filterData);
            assertTrue(car.getCarNameData().getText().contains(filterData), "Car " + i + " not contains " + filterData);
            assertTrue(car.getCarImageData().isDisplayed(), "Car " + i + " image is not displayed");
            assertTrue(car.getCarImageData().getAttribute("src").contains(".jpeg"), "Car " + i + " image is not jpeg");
            assertTrue(!car.getStockNumberData().getText().isEmpty(), "Car " + i + " stock number is empty");
            assertTrue(!car.getMileageData().getText().isEmpty(), "Car " + i + " mileage is empty");
            assertTrue(!car.getFirstRegistrationData().getText().isEmpty(), "Car " + i + " first registration is empty");
            assertTrue(!car.getHorsePowerData().getText().isEmpty(), "Car " + i + " horsepower is empty");
            assertTrue(!car.getBodyTypeData().getText().isEmpty(), "Car " + i + " body type is empty");
            assertTrue(!car.getFuelTypeData().getText().isEmpty(), "Car " + i + " fuel type is empty");
            assertTrue(!car.getGearBoxData().getText().isEmpty(), "Car " + i + " gear box is empty");
        }
    }
}
