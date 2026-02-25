package in.darkdevil.multithreading;

public class needOfMultiThreading {
    public static void main(String[] args) {
        long starttime = System.currentTimeMillis();
        //First Task
        for (int i = 1; i <=1000 ; i++) {
            System.out.printf("%d* ",i);
        }
        System.out.println("* task complete");

        //Second Task
        for (int i = 1; i <=1000 ; i++) {
            System.out.printf("%d$ ",i);
        }
        System.out.println("$ task complete");

        //Third Task
        for (int i = 1; i <=1000 ; i++) {
            System.out.printf("%d# ",i);
        }
        System.out.println("# task complete");
        long endtime = System.currentTimeMillis();
        System.out.printf("%d ",endtime-starttime);
    }
}
