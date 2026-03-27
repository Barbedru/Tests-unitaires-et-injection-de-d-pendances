
package org.example;


import java.time.LocalDateTime;
import java.time.DayOfWeek;

public class Welcome {

    // Dépendance injectée
    private Clock clock;

    /**
     * Constructeur avec injection de dépendance
     *
     * On ne crée pas le Clock ici !
     * On le reçoit de l'extérieur (test ou production)
     */

    public Welcome(Clock clock) {
        this.clock = clock;
    }


    public String getMessage(){
        // On récupère l'heure via la dépendance
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