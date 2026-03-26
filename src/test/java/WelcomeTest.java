import org.example.Welcome;
import org.example.FakeClock;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WelcomeTest {

    @Test
    void shouldReturnBonjourInMorning() {

        FakeClock clock = new FakeClock(LocalDateTime.of(2024, 3, 20, 10, 0));

        // Injection du faux temps
        Welcome welcome = new Welcome(clock);

        // Appel de la méthode
        String message = welcome.getMessage();

        assertEquals("Bonjour", message);
    }

    @Test
    void shouldReturnWeekendMessageOnSunday() {

        FakeClock clock = new FakeClock(LocalDateTime.of(2026, 3, 28, 10, 0));

        Welcome welcome = new Welcome(clock);

        String message = welcome.getMessage();

        assertEquals("Bon week-end", message);
    }
}