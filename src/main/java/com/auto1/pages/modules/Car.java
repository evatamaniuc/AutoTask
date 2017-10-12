package com.auto1.pages.modules;

import org.openqa.selenium.WebElement;

public class Car {

    private WebElement carNameData;
    private WebElement carImageData;
    private WebElement stockNumberData;
    private WebElement mileageData;
    private WebElement firstRegistrationData;
    private WebElement horsePowerData;
    private WebElement bodyTypeData;
    private WebElement fuelTypeData;
    private WebElement gearBoxData;

    public Car(WebElement carNameData, WebElement carImageData, WebElement stockNumberData, WebElement mileageData,
               WebElement firstRegistrationData, WebElement horsePowerData, WebElement bodyTypeData, WebElement fuelTypeData, WebElement gearBoxData) {
        this.carNameData = carNameData;
        this.carImageData = carImageData;
        this.stockNumberData = stockNumberData;
        this.mileageData = mileageData;
        this.firstRegistrationData = firstRegistrationData;
        this.horsePowerData = horsePowerData;
        this.bodyTypeData = bodyTypeData;
        this.fuelTypeData = fuelTypeData;
        this.gearBoxData = gearBoxData;
    }

    public WebElement getCarNameData() {
        return carNameData;
    }

    public void setCarNameData(WebElement carNameData) {
        this.carNameData = carNameData;
    }

    public WebElement getCarImageData() {
        return carImageData;
    }

    public void setCarImageData(WebElement carImageData) {
        this.carImageData = carImageData;
    }

    public WebElement getStockNumberData() {
        return stockNumberData;
    }

    public void setStockNumberData(WebElement stockNumberData) {
        this.stockNumberData = stockNumberData;
    }

    public WebElement getMileageData() {
        return mileageData;
    }

    public void setMileageData(WebElement mileageData) {
        this.mileageData = mileageData;
    }

    public WebElement getFirstRegistrationData() {
        return firstRegistrationData;
    }

    public void setFirstRegistrationData(WebElement firstRegistrationData) {
        this.firstRegistrationData = firstRegistrationData;
    }

    public WebElement getHorsePowerData() {
        return horsePowerData;
    }

    public void setHorsePowerData(WebElement horsePowerData) {
        this.horsePowerData = horsePowerData;
    }

    public WebElement getBodyTypeData() {
        return bodyTypeData;
    }

    public void setBodyTypeData(WebElement bodyTypeData) {
        this.bodyTypeData = bodyTypeData;
    }

    public WebElement getFuelTypeData() {
        return fuelTypeData;
    }

    public void setFuelTypeData(WebElement fuelTypeData) {
        this.fuelTypeData = fuelTypeData;
    }

    public WebElement getGearBoxData() {
        return gearBoxData;
    }

    public void setGearBoxData(WebElement gearBoxData) {
        this.gearBoxData = gearBoxData;
    }
}
