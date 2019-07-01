package com.lithium.mineraloi.university;

import java.util.List;
import java.util.stream.Collectors;

public class OnboardingUIController {
    private OnboardingUIView view;

    public OnboardingUIController() {
        view = new OnboardingUIView();
    }

    public void interactWithInput(String keyword) {
        view.getFilterInputElement().type(keyword);
        view.getButtonElement().click();
    }

    public List<String> getStatusText() {
        return view.getStatusElement().stream()
                .map(element -> element.getInnerText())
                .collect(Collectors.toList());
    }
}
