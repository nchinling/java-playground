package runnabletask;

import java.util.ArrayList;
import java.util.List;

public class Multithread {
    public static void main(String[] args) {
        int n = 8; // Number of threads
        List<Thread> threads = new ArrayList<>();

        // Create threads and add them to the list
        for (int i = 0; i < n; i++) {
            Thread thread = new Thread(new TaskRunnable(i));
            threads.add(thread);
            thread.start();
        }

        // Wait for all threads to finish
        for (Thread thread : threads) {
            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("All tasks completed.");
    }
}

class TaskRunnable implements Runnable {
    private final int taskId;

    public TaskRunnable(int taskId) {
        this.taskId = taskId;
    }

    @Override
    public void run() {
        try {
            // Simulate time-consuming task
            System.out.println("Task " + taskId + " started.");
            Thread.sleep(2000); // Simulating 2 seconds of work
            System.out.println("Task " + taskId + " completed.");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}