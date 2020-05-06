package br.com.devdojo.collections.test;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueTest {
    public static void main(String[] args) {
        Queue<String > queue = new PriorityQueue<>();
        queue.add("D");
        queue.add("A");
        queue.add("B");

        System.out.println(queue.remove());
        System.out.println(queue.size());
    }
}
