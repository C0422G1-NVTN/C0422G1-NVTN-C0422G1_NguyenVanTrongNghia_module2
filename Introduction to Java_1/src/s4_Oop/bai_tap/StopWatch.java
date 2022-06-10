package s4_Oop.bai_tap;

import java.util.Date;

public class StopWatch {
    private Date startTime;
    private Date endTime;

    public StopWatch(){
    }

    public void start(){
        startTime = new Date();
    }

    public void stop(){
        endTime = new Date();
    }

    public long getElapsedTime(){
        return endTime.getTime()-startTime.getTime();
    }

    public static void main(String[] args) {
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        for (long i = 0; i < 1000000000; i++) {

        }
        stopWatch.stop();
        System.out.println(stopWatch.getElapsedTime());
    }
}
