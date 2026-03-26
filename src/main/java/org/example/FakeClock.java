package org.example;
import java.time.LocalDateTime;

public class FakeClock implements Clock {

    private final LocalDateTime fakeTime;

    public FakeClock(LocalDateTime fakeTime) {
        this.fakeTime = fakeTime;
    }

    @Override
    public LocalDateTime now() {
        return fakeTime;
    }
}
