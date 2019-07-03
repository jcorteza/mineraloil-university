package com.lithium.mineraloi.university;

import com.lithium.mineraloi.university.browser.DriverManager;
import com.lithium.mineraloil.selenium.elements.BaseElement;
import com.lithium.mineraloil.selenium.elements.Driver;
import com.lithium.mineraloil.selenium.elements.TextElement;
import org.openqa.selenium.By;

import java.util.List;

public class UserTimelineView {
    private Driver driver;

    public UserTimelineView() {
        driver = DriverManager.INSTANCE.getDriver();
    }

    public BaseElement getAnchorElement() {
        return driver.createBaseElement(By.xpath("//nav/a[2]"));
    }

    public BaseElement getButtonElement() {
        return driver.createBaseElement(By.xpath("//button"));
    }

    public List<TextElement> getUserNameElement() {
        return driver.createTextElement(By.xpath("//p[@class='name']")).toList();
    }
}
