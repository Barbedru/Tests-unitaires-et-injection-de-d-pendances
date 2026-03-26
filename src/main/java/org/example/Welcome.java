
package org.example;


import java.time.LocalDateTime;
import java.time.DayOfWeek;

public class Welcome {

    private Clock clock;
    public Welcome(Clock clock) {
        this.clock = clock;
    }


    public String getMessage(){
        LocalDateTime now = clock.now();

        int hour = now.getHour();
        DayOfWeek day = now.getDayOfWeek();

        if ((day == DayOfWeek.FRIDAY && hour >= 18)
                || day == DayOfWeek.SATURDAY
                || day == DayOfWeek.SUNDAY) {
            return "Bon week-end";

        } else if (hour >= 9 && hour < 13) {
            return "Bonjour";
        } else if (hour >= 13 && hour < 18) {
            return "Bon après-midi";
        } else {
            return "Bonsoir";
        }

    }

}