package Multi_threading;

public class TestingTermination {
    public static void main(String[] args) throws InterruptedException {
        TerminationThread t1 = new TerminationThread(1);
        TerminationThread t2 = new TerminationThread(2);
        TerminationThread t3 = new TerminationThread(3);
        t1.start();
        t1.join();
        t2.start();
        t2.join();
        t3.start();
        t3.join();
    }
}
