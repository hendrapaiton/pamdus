package com.garugi.pamdus.controller;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class LandingControllerTest {

    @Test
    public void testIndex() {
        // Arrange
        LandingController controller = new LandingController();

        // Act
        String viewName = controller.index();

        // Assert
        assertEquals("landing", viewName);
    }
}
