package Multi_threading;

public class HelloThread extends Thread{
    private final int threadnumber;

    public HelloThread(int threadnumber) {
        this.threadnumber = threadnumber;
    }

    @Override
    public void run() {
        for (int i=0;i<10;i++){
            System.out.printf("Hello Thread %d\n",threadnumber);

        }
    }
}
