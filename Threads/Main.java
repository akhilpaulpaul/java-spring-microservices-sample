package Threads;

import java.util.Arrays;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executors;

//public class Main {
//    public static void main(String[] args) {
//        var employeeFiles = new ConcurrentHashMap<Integer, String>();
//        employeeFiles.put(101, "Sam");
//        System.out.println("Started");
//        try(var executor = Executors.newVirtualThreadPerTaskExecutor()) {
//            executor.submit(() -> {
//                System.out.println("Virtual thread");
//                try {
//                    Thread.sleep(3000);
//                    System.out.println("Virtual thread task done");
//                }
//                catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//            });
//            var name = employeeFiles.get(101);
//            System.out.println("Main thread continue");
//        }
//        System.out.println("All finished");
//    }
//}

//class MyThread extends Thread {
//    public void run() {
//        for (int i = 0; i < 5; i++) {
//            System.out.println(Thread.currentThread().getName() + " - " + i);
//            try {
//                Thread.sleep(1000); // Sleep for 1 second
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        }
//    }
//}

//public class Main {
//    public static void main(String[] args) {
//        MyThread t1 = new MyThread();
//        MyThread t2 = new MyThread();
//
//        t1.start();
//        t2.start();
//    }
//}
//
//
class Counter {
    private int count = 0;

    public synchronized void increment() {
        count++;
    }

    public int getCount() {
        return count;
    }
}

class SyncThread extends Thread {
    private Counter counter;

    public SyncThread(Counter counter) {
        this.counter = counter;
    }

    public void run() {
        for (int i = 0; i < 1000000; i++) {
            counter.increment();
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Counter counter = new Counter();
        SyncThread t1 = new SyncThread(counter);
        SyncThread t2 = new SyncThread(counter);

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Final count: " + counter.getCount());
    }
}