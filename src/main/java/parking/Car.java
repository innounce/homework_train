package parking;

import java.time.Duration;
import java.time.LocalDateTime;

public class Car {
    private String id;
    private LocalDateTime enter;
    private LocalDateTime leave;

    public Car(String id, LocalDateTime enter) {
        this.id = id;
        this.enter = enter;
    }

    private LocalDateTime leave(){

        LocalDateTime leave = LocalDateTime.of(2019, 9,17,10,8,0);
        return leave;
    }

    public void setLeave(LocalDateTime leave) {
        if(leave.isAfter(enter))
            this.leave = leave;
    }

    public Long durationMinute() {
        return Duration.between(enter , leave).toMinutes();
    }

    public Long durationHours() {
        return (long)Math.ceil( Duration.between(enter , leave).toMinutes()/60.0 ) ;
    }

}
