package com.lithium.mineraloil.university;

import com.lithium.mineraloi.university.OnboardingUIController;
import com.lithium.mineraloi.university.browser.BaseUITest;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class FilterIntegrationTest extends BaseUITest {

    OnboardingUIController controller = new OnboardingUIController();
    String successMessage = "Your tweet was successfully posted!";

    @DisplayName("Navigates to Home Timeline tab, renders filtered timeline, and each tweet contains 'the'")
    @Test
    void homeTimelineFilterTest() {
        String keyword = "the";

        controller.clickHomeTimelineLink();
        controller.interactWithInput(keyword);

        Assertions.assertThat(controller.getHomeTimelineStatusText()).allSatisfy(statusText -> Assertions.assertThat(statusText.toLowerCase()).contains(keyword));
    }

    @DisplayName("Navigates to User Timeline tab, renders timeline")
    @Test
    void userTimelineTest() {
        controller.clickUserTimelineLink();
        String userName = controller.getUserTimelineUserName().get(0);

        Assertions.assertThat(controller.getUserTimelineUserName()).allMatch(name -> name.matches(userName));
    }

    @DisplayName("Navigates to Post Tweet tab, posts tweet successfully")
    @Test
    void postTweetTest() {
        String testText = "Hello Twitter.";

        controller.clickPostTweetLink();
        controller.inputTextArea(testText);
        controller.clickPostButton();

        Assertions.assertThat(controller.getInfoText()).matches(successMessage);
    }

}
