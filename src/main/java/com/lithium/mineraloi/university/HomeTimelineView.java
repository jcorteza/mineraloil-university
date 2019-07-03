package com.lithium.mineraloi.university;

import com.lithium.mineraloi.university.browser.DriverManager;
import com.lithium.mineraloil.selenium.elements.BaseElement;
import com.lithium.mineraloil.selenium.elements.Driver;
import com.lithium.mineraloil.selenium.elements.TextElement;
import org.openqa.selenium.By;

import java.util.List;

public class HomeTimelineView {
    private Driver driver;

    public HomeTimelineView() {
        driver = DriverManager.INSTANCE.getDriver();
    }

    public BaseElement getAnchorElement() {
        return driver.createBaseElement(By.xpath("//nav/a[1]"));
    }

    public TextElement getFilterInputElement() {
        return driver.createTextElement(By.xpath("//input[@id='filterInput']"));
    }

    public BaseElement getButtonElement() {
        return driver.createBaseElement(By.xpath("//button[@id='filterButton']"));
    }

    public List<TextElement> getStatusElements() {
        return driver.createTextElement(By.xpath("//p[@class='tweetText']")).toList();
    }
}
