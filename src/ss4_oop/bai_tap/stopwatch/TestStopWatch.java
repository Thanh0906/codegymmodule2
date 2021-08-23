package ss4_oop.bai_tap.stopwatch;

public class TestStopWatch {
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
