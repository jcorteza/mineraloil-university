package com.lithium.mineraloi.university;

import com.lithium.mineraloi.university.browser.DriverManager;
import com.lithium.mineraloil.selenium.elements.BaseElement;
import com.lithium.mineraloil.selenium.elements.Driver;
import com.lithium.mineraloil.selenium.elements.TextElement;
import org.openqa.selenium.By;

import java.util.List;

public class OnboardingUIView {
    private Driver driver;

    public OnboardingUIView() {
        driver = DriverManager.INSTANCE.getDriver();
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
