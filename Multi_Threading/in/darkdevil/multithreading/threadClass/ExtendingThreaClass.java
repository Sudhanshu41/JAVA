package in.darkdevil.multithreading.threadClass;

public class ExtendingThreaClass {
    public static void main(String[] args) {
        long starttime = System.currentTimeMillis();
       firstTask t1 = new firstTask();
       secondTask t2 = new secondTask();
       thirdTask t3 = new thirdTask();
        System.out.println("\n Starting first thread");
        t1.start();
        System.out.println("\n Starting second thread");
        t2.start();
        System.out.println("\n Starting third thread");
        t3.start();

        long endtime = System.currentTimeMillis();
        System.out.printf(" %s total time takem %d ",Thread.currentThread().getName(),endtime-starttime);
    }
}
