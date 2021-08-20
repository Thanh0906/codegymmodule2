package ss4_oop.baitap.stopwatch;

public class StopWatch {
    private long startTime;
    private long endTime;

    public StopWatch(long startTime, long endTime) {
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public StopWatch() {

    }

    public long getStartTime() {
        return startTime;
    }

    public long getEndTime() {
        return endTime;
    }

    public void start() {
        this.startTime = System.currentTimeMillis();
    }

    public void stop() {
        this.endTime = System.currentTimeMillis();
    }

    public long getElapsedTime() {
        long millisecond = getEndTime() - getStartTime();
        return millisecond;

    }
}
