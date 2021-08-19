package ss4_oop.baitap;

public class StopWatch {
    private long startTime;
    private  long endTime;

    public StopWatch(long startTime,long endTime) {
        this.startTime = startTime;
        this.endTime =endTime;
    }

    public StopWatch() {

    }

    public long getStartTime() {
        return startTime;
    }

    public long getEndTime() {
        return endTime;
    }

    public void start(){
        this.startTime =System.currentTimeMillis();
    }
    public void stop(){
        this.endTime = System.currentTimeMillis();
    }
    public long getElapsedTime(){
        long millisecond = getEndTime() - getStartTime();
        return millisecond;

    }

    public static void main(String[] args) {
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        System.out.println(stopWatch.getStartTime());
        for (int i =0;i<1000000;i++){
            for (int j = 0;j<100000;j++){
                int sum =i+j;
            }
        }
        stopWatch.stop();
        System.out.println(stopWatch.getEndTime());
        System.out.println(stopWatch.getElapsedTime());
    }
}
