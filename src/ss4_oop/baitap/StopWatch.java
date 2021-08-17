package ss4_oop.baitap;

import java.time.LocalTime;
import java.util.Locale;

public class StopWatch {
    private LocalTime startTime;
    private LocalTime endTime;

    public StopWatch() {
        startTime = LocalTime.now();
    }

    public StopWatch(LocalTime startTime, LocalTime endTime) {
        this.endTime = endTime;
        this.startTime = startTime;
    }

    public LocalTime getEndTime() {

        return endTime;
    }

    public LocalTime getStartTime() {
        return startTime;
    }

    public void star() {
        startTime = LocalTime.now();
    }

    public void stop() {
        endTime = LocalTime.now();
    }
    //  public getElapsedTime(){

    //  }

}
