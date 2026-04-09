import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PassengerBogieTest {

    @Test
    void testUC14_ValidCapacityCreation() throws InvalidCapacityException {
        PassengerBogie bogie = new PassengerBogie("Sleeper", 50);
        assertNotNull(bogie);
        assertEquals(50, bogie.getCapacity());
        assertEquals("Sleeper", bogie.getType());
    }

    @Test
    void testUC14_NegativeCapacityThrowsException() {
        Exception exception = assertThrows(InvalidCapacityException.class, () -> {
            new PassengerBogie("Sleeper", -10);
        });
        assertEquals("Capacity must be greater than zero", exception.getMessage());
    }

    @Test
    void testUC14_ZeroCapacityThrowsException() {
        Exception exception = assertThrows(InvalidCapacityException.class, () -> {
            new PassengerBogie("AC", 0);
        });
        assertEquals("Capacity must be greater than zero", exception.getMessage());
    }

    @Test
    void testUC14_ExceptionMessageValidation() {
        Exception exception = assertThrows(InvalidCapacityException.class, () -> {
            new PassengerBogie("General", -5);
        });
        assertEquals("Capacity must be greater than zero", exception.getMessage());
    }

    @Test
    void testUC14_ObjectIntegrityAfterCreation() throws InvalidCapacityException {
        PassengerBogie bogie = new PassengerBogie("AC", 60);
        assertEquals("AC", bogie.getType());
        assertEquals(60, bogie.getCapacity());
    }

    @Test
    void testUC14_MultipleValidBogiesCreation() throws InvalidCapacityException {
        PassengerBogie b1 = new PassengerBogie("Sleeper", 50);
        PassengerBogie b2 = new PassengerBogie("AC", 60);
        PassengerBogie b3 = new PassengerBogie("General", 70);

        assertNotNull(b1);
        assertNotNull(b2);
        assertNotNull(b3);
    }
}