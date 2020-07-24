package com.codedifferently.collections.queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

public class QueueDemo {
    public static void main(String... args){
        QueueDemo qd = new QueueDemo();
        qd.example12();
    }

    public void example01(){
        Queue<String> queue = new LinkedList<>();
        queue.add("Thing One");
        queue.add("Cindy Lou Who");
        queue.add("Thing Two");
        queue.add("Sam-I-Am");
        System.out.println(queue.size());
        queue.remove();
        System.out.println(queue.peek());
    }

    public void example02(){

        // create object of Queue
        Queue<Integer> queue = new LinkedBlockingQueue<Integer>();

        // Add numbers to end of Queue
        queue.add(7855642);
        queue.add(35658786);
        queue.add(5278367);

        try {
            // when null is inserted
            queue.add(null);
        }
        catch (Exception e) {
            System.out.println("Exception: " + e);
        }
    }

    public void example03(){

        // create object of Queue
        Queue<Integer> queue = new LinkedBlockingQueue<Integer>(3);

        // Add numbers to end of Queue
        queue.add(7855642);
        queue.add(35658786);
        queue.add(5278367);

        try {
            // when capacity is full
            queue.add(10);
        }
        catch (Exception e) {
            System.out.println("Exception: " + e);
        }
    }

    public void example04(){
        Queue<String> queue = new LinkedList<>();
        queue.offer("Thing One");
        queue.offer("Cindy Lou Who");
        queue.offer("Thing Two");
        queue.offer("Sam-I-Am");
        System.out.println(queue.size());
    }

    public void example05() {

        // create object of Queue
        Queue<Integer> queue = new LinkedBlockingQueue<Integer>(3);

        if (queue.offer(10))
            System.out.println("The Queue is not full and 10 is inserted");
        else
            System.out.println("The Queue is full");

        if (queue.offer(15))
            System.out.println("The Queue is not full and 15 is inserted");
        else
            System.out.println("The Queue is full");

        if (queue.offer(25))
            System.out.println("The Queue is not full and 25 is inserted");
        else
            System.out.println("The Queue is full");

        if (queue.offer(20))
            System.out.println("The Queue is not full and 20 is inserted");
        else
            System.out.println("The Queue is full");

        // before removing print Queue
        System.out.println("Queue: " + queue);

    }

    public void example06() {
        // create object of Queue
        Queue<Integer> queue = new LinkedBlockingQueue<Integer>();

        // Add numbers to end of Queue
        queue.add(7855642);
        queue.add(35658786);
        queue.add(5278367);

        System.out.println(queue.remove());
        System.out.println(queue.peek());
    }

    public void example07() {
        // create object of Queue
        Queue<Integer> queue = new LinkedBlockingQueue<Integer>();

        System.out.println(queue.remove());
    }

    public void example08() {
        // create object of Queue
        Queue<Integer> queue = new LinkedBlockingQueue<Integer>();

        // Add numbers to end of Queue
        queue.add(7855642);
        queue.add(35658786);
        queue.add(5278367);

        System.out.println(queue.poll());
        System.out.println(queue.peek());
    }

    public void example09() {
        // create object of Queue
        Queue<Integer> queue = new LinkedBlockingQueue<Integer>();

        System.out.println(queue.poll());
    }

    public void example10() {
        // create object of Queue
        Queue<Integer> queue = new LinkedBlockingQueue<>();

        // Add numbers to end of Queue
        queue.add(7855642);
        queue.add(35658786);
        queue.add(5278367);

        System.out.println(queue.poll());
        System.out.println(queue.peek());
        System.out.println(queue.element());
    }

    public void example11() {
        // create object of Queue
        Queue<Integer> queue = new LinkedBlockingQueue<>();

        System.out.println(queue.element());
    }

    public void example12() {
        // create object of Queue
        Queue<Integer> queue = new LinkedBlockingQueue<>();

        System.out.println(queue.peek());
    }

}
