package in.darkdevil.multithreading.join;

import in.darkdevil.multithreading.runnable.PrintTask;

public class TestingJoin {
    public static void main(String[] args) throws InterruptedException {
        long starttime = System.currentTimeMillis();
        PrintTask p1 = new PrintTask('*');
        PrintTask p2 = new PrintTask('$');
        PrintTask p3 = new PrintTask('#');
        Thread t1 = new Thread(p1);
        t1.start();
        System.out.println("\n Thread 1 Started");
        t1.join();
        Thread t2 = new Thread(p2);
        t2.start();
        System.out.println("\n Thread 2 Started");
        t2.join();
        Thread t3 = new Thread(p3);
        t3.start();
        System.out.println("\n Thread 3 Started");
        t3.join();
        long endtime = System.currentTimeMillis();
        System.out.printf(" %s total time takem %d ",Thread.currentThread().getName(),endtime-starttime);
    }
}
