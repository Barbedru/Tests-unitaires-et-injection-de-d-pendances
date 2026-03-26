package org.example;

import java.time.LocalDateTime;

//Interface qui représente une source de temps.


public interface Clock {

    /**
     * Retourne la date et l'heure actuelle
     */

    LocalDateTime now();
}
