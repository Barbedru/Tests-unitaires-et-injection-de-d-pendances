package org.example;

import java.time.LocalDateTime;

public class RealClock implements Clock {
    @Override
    public LocalDateTime now() {
        return LocalDateTime.now();
    }
}
