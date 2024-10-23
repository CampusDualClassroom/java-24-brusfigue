package com.campusdual.classroom;

import java.util.LinkedList;
import java.util.Queue;

public class Exercise24 {
    public static Queue<String> createQueue() {
        Queue<String> queue = new LinkedList<>();

        queue.offer("Smith");
        queue.offer("Montessori");
        queue.offer("Peralta");
        queue.offer("House");

        return queue;

    }
    public static void printAndEmptyQueue(Queue<String> queue) {

        System.out.println(queue.peek()+ "\n");

        while(!queue.isEmpty()){
            System.out.println(queue.poll());
        }
    }

    public static void main(String[] args) {

        Queue<String> createQueue = createQueue();
        System.out.println("Elementos de la cola: ");
        printAndEmptyQueue(createQueue);
    }

}
