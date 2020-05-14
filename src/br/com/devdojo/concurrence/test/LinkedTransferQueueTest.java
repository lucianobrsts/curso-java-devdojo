package br.com.devdojo.concurrence.test;

import java.util.concurrent.LinkedTransferQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TransferQueue;

public class LinkedTransferQueueTest {
    public static void main(String[] args) throws InterruptedException {
        TransferQueue<String> tq = new LinkedTransferQueue<>();
        System.out.println(tq.add("Luciano"));
        tq.put("DevDojo");
        System.out.println(tq.offer("Luciano Brito"));
//        System.out.println(tq.offer("Luciano", 10, TimeUnit.NANOSECONDS));tq.transfer("Luciano");
        System.out.println(tq.tryTransfer("DevDojo"));
        System.out.println(tq.tryTransfer("Luciano", 1, TimeUnit.SECONDS));

        System.out.println(tq.remainingCapacity());

        System.out.println(tq.element());
        System.out.println(tq.peek());
        System.out.println(tq.poll());
        System.out.println(tq.poll(10,TimeUnit.MICROSECONDS));
        System.out.println(tq.remove());
        System.out.println(tq.take());

    }
}
