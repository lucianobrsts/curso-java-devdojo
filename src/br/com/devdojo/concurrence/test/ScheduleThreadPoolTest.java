package br.com.devdojo.concurrence.test;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public class ScheduleThreadPoolTest {
    private static final ScheduledExecutorService scheduleExecutorService = Executors.newScheduledThreadPool(1);
    private static void beep() {
       final Runnable beeper = new Runnable() {
           @Override
           public void run() {
               System.out.println(new SimpleDateFormat("HH:mm:ss").format(new Date()) + " beep.");

               try {
                   TimeUnit.SECONDS.sleep(2);
               } catch (InterruptedException e) {
                   e.printStackTrace();
               }
           }
       };
//       scheduleExecutorService.scheduleAtFixedRate(beeper,1, 5, TimeUnit.SECONDS);

        ScheduledFuture<?> scheduledFuture = scheduleExecutorService.scheduleWithFixedDelay(beeper, 1, 5, TimeUnit.SECONDS);
        scheduleExecutorService.schedule(new Runnable() {
            @Override
            public void run() {
                System.out.println("Cancelando");
                scheduledFuture.cancel(false);
                scheduleExecutorService.shutdown();
            }
        }, 10, TimeUnit.SECONDS);
    }

    public static void main(String[] args) {
        beep();
    }
}
