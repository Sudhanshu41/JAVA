package Multi_threading;

public class TerminationThread extends Thread {
    private final int threadnumber;

    public TerminationThread(int threadnumber) {
        this.threadnumber = threadnumber;
    }

    @Override
    public void run() {

            System.out.printf("%s Thread Starting %d\n",Thread.currentThread().getName(),threadnumber);
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.printf("%s Thread Ended %d\n",Thread.currentThread().getName(),threadnumber);


    }
}
