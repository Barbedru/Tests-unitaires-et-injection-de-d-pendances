package org.example;

import java.time.LocalDateTime;

public interface Clock {

    /**
     * Retourne la date et l'heure actuelle
     */

    LocalDateTime now();
}
