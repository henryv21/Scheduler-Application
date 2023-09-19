package Controllers;

import javafx.event.ActionEvent;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;

class AppointmentFormTest {

    private AppointmentForm appointmentFormUnderTest;

    @BeforeEach
    void setUp() {
        appointmentFormUnderTest = new AppointmentForm();
    }

    @Test
    void testHandleCancelButton() throws Exception {
        // Setup
        final ActionEvent event = new ActionEvent("o", null);

        // Run the test
        appointmentFormUnderTest.handleCancelButton(event);

        // Verify the results
    }

    @Test
    void testHandleCancelButton_ThrowsIOException() {
        // Setup
        final ActionEvent event = new ActionEvent("o", null);

        // Run the test
        assertThrows(IOException.class, () -> appointmentFormUnderTest.handleCancelButton(event));
    }

    @Test
    void testHandleSaveButton() throws Exception {
        // Setup
        final ActionEvent event = new ActionEvent("o", null);

        // Run the test
        appointmentFormUnderTest.handleSaveButton(event);

        // Verify the results
    }

    @Test
    void testHandleSaveButton_ThrowsSQLException() {
        // Setup
        final ActionEvent event = new ActionEvent("o", null);

        // Run the test
        assertThrows(SQLException.class, () -> appointmentFormUnderTest.handleSaveButton(event));
    }

    @Test
    void testHandleSaveButton_ThrowsIOException() {
        // Setup
        final ActionEvent event = new ActionEvent("o", null);

        // Run the test
        assertThrows(IOException.class, () -> appointmentFormUnderTest.handleSaveButton(event));
    }

    @Test
    void testCheckInputs() {
        // Setup
        // Run the test
        final boolean result = appointmentFormUnderTest.checkInputs();

        // Verify the results
        assertFalse(result);
    }

    @Test
    void testInitialize() throws Exception {
        // Setup
        final ResourceBundle resourceBundle = ResourceBundle.getBundle("baseName");

        // Run the test
        appointmentFormUnderTest.initialize(new URL("https://example.com/"), resourceBundle);

        // Verify the results
    }
}
