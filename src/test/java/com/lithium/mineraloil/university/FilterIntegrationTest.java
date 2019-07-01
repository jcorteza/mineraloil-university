package com.lithium.mineraloil.university;

import com.lithium.mineraloi.university.OnboardingUIController;
import com.lithium.mineraloi.university.browser.BaseUITest;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class FilterIntegrationTest extends BaseUITest {

    @DisplayName("When input has text and button clicked, timeline appears")
    @Test
    void filterTest() {
        OnboardingUIController controller = new OnboardingUIController();
        controller.interactWithInput();
        Assertions.assertThat(controller.getStatusText()).allSatisfy(statusText -> statusText.contains("that"));
    }

}
