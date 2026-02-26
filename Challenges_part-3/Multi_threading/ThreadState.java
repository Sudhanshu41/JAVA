package Multi_threading;

public class ThreadState extends Thread{


    @Override
    public void run()  {// run ke bad hi seedha exception throw nhi kr skte because run khud override ho rha iska mtlb ye hai ki jab parent hi exception throw nhi kr rha toh b=child kese exception throw krega!!!!

        try {
            Thread.sleep(4000);
            System.out.printf("From inside run %s",
                    Thread.currentThread().getState());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
