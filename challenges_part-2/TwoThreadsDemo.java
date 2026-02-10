// Program: Two threads performing different number operations

class PrimeThread extends Thread {
    // Method to check if a number is prime
    boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

    // Run method for thread 1
    public void run() {
        System.out.println("Thread 1: Prime Numbers (1 to 100)");
        for (int i = 1; i <= 100; i++) {
            if (isPrime(i)) {
                System.out.println("Prime: " + i);
                try {
                    Thread.sleep(500); // sleep for 0.5 seconds
                } catch (InterruptedException e) {
                    System.out.println(e);
                }
            }
        }
    }
}

class DivisibleThread extends Thread {
    // Run method for thread 2
    public void run() {
        System.out.println("Thread 2: Numbers divisible by 2, 4, and 6 (1 to 100)");
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0 && i % 4 == 0 && i % 6 == 0) {
                System.out.println("Divisible by 2,4,6: " + i);
                try {
                    Thread.sleep(500); // sleep for 0.5 seconds
                } catch (InterruptedException e) {
                    System.out.println(e);
                }
            }
        }
    }
}

public class TwoThreadsDemo {
    public static void main(String[] args) {
        PrimeThread t1 = new PrimeThread();
        DivisibleThread t2 = new DivisibleThread();

        // Start both threads
        t1.start();
        t2.start();
    }
}
