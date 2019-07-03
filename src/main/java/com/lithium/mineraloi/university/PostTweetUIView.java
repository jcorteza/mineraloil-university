package com.lithium.mineraloi.university;

import com.lithium.mineraloi.university.browser.DriverManager;
import com.lithium.mineraloil.selenium.elements.BaseElement;
import com.lithium.mineraloil.selenium.elements.Driver;
import com.lithium.mineraloil.selenium.elements.TextElement;
import org.openqa.selenium.By;

import java.util.List;

public class PostTweetUIView {
    private Driver driver;

    public PostTweetUIView() {
        driver = DriverManager.INSTANCE.getDriver();
    }

    public BaseElement getAnchorElement() {
        return driver.createBaseElement(By.xpath("//nav/a[3]"));
    }

    public TextElement getTextAreaElement() {
        return driver.createTextElement(By.xpath("//textarea"));
    }

    public BaseElement getButtonElement() {
        return driver.createBaseElement(By.xpath("//button[@id='postTweetButton']"));
    }

    public TextElement getInfoMessageElement() {
        return driver.createTextElement(By.xpath("//p[@id='postTweetInfoMessage']"));
    }
}
