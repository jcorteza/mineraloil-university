package com.lithium.mineraloi.university;

import com.lithium.mineraloil.selenium.elements.TextElement;

import java.util.List;
import java.util.stream.Collectors;

public class OnboardingUIController {
    private HomeTimelineView homeTimelineView;
    private UserTimelineView userTimelineView;
    private PostTweetUIView postTweetUIView;

    public OnboardingUIController() {
        homeTimelineView = new HomeTimelineView();
        userTimelineView = new UserTimelineView();
        postTweetUIView = new PostTweetUIView();
    }

    public void clickHomeTimelineLink() {
        homeTimelineView.getAnchorElement().click();
    }

    public void interactWithInput(String keyword) {
        homeTimelineView.getFilterInputElement().type(keyword);
        homeTimelineView.getButtonElement().click();
    }

    public List<String> getHomeTimelineStatusText() {
        return homeTimelineView.getStatusElements().stream()
                .map(TextElement::getInnerText)
                .collect(Collectors.toList());
    }

    public void clickUserTimelineLink() {
        userTimelineView.getAnchorElement().click();
    }

    public List<String> getUserTimelineUserName() {
        userTimelineView.getButtonElement().click();
        return userTimelineView.getUserNameElement().stream()
                .map(TextElement::getInnerText)
                .collect(Collectors.toList());
    }

    public void clickPostTweetLink() {
        postTweetUIView.getAnchorElement().click();
    }

    public void inputTextArea(String text) {
        postTweetUIView.getTextAreaElement().type(text);
    }

    public void clickPostButton() {
        postTweetUIView.getButtonElement().click();
    }

    public String getInfoText() {
        postTweetUIView.getInfoMessageElement().waitUntilDisplayed();
        return postTweetUIView.getInfoMessageElement().getInnerText();
    }
}
