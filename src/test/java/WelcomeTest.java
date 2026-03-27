import org.example.Welcome;
import org.example.FakeClock;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WelcomeTest {

    @Test
    //Vendredi 10H
    void testsMorningWeek() {

        FakeClock clock = new FakeClock(LocalDateTime.of(2026, 3, 27, 10, 0));

        // Injection du faux temps
        Welcome welcome = new Welcome(clock);

        // Appel de la méthode
        String message = welcome.getMessage();

        assertEquals("Bonjour", message);
    }

    @Test
    //Vendredri 15H
    void testsAfternoonWeek() {
        FakeClock clock = new FakeClock(LocalDateTime.of(2026, 3, 27, 15, 0));

        Welcome welcome = new Welcome(clock);
        String message = welcome.getMessage();
        assertEquals("Bon après-midi", message);
    }

    @Test
    //Mardi 21H
    void testsEveningWeek(){
        FakeClock clock = new FakeClock(LocalDateTime.of(2026, 3, 25, 21, 0));

        Welcome welcome = new Welcome(clock);
        String message = welcome.getMessage();
        assertEquals("Bonsoir", message);
    }

    @Test
    //Samedi 10H
    void testsWeekend() {

        FakeClock clock = new FakeClock(LocalDateTime.of(2026, 3, 28, 10, 0));

        Welcome welcome = new Welcome(clock);

        String message = welcome.getMessage();

        assertEquals("Bon week-end", message);
    }
}