package com.lithium.mineraloil.university;

import com.lithium.mineraloi.university.OnboardingUIController;
import com.lithium.mineraloi.university.browser.BaseUITest;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class FilterIntegrationTest extends BaseUITest {

    @DisplayName("When input has text and button clicked, timeline appears and each tweet contains 'the'")
    @Test
    void filterTest() {
        String keyword = "the";
        OnboardingUIController controller = new OnboardingUIController();

        controller.interactWithInput(keyword);

        Assertions.assertThat(controller.getStatusText()).allSatisfy(statusText -> Assertions.assertThat(statusText.toLowerCase()).contains(keyword));
    }

}
