package Multi_threading;

public class TestingState {
    public static void main(String[] args) throws InterruptedException {
        ThreadState t1 = new ThreadState();
        System.out.printf("Created the Thread %s",
                t1.getState());
        t1.start();
        t1.join();
        System.out.printf("Thread finished %s",
                t1.getState());
    }
}
