package in.darkdevil.collection;

import java.util.LinkedList;
import java.util.Queue;

public class TestingQueue {
    public static void main(String[] args) {
        Queue<Integer> strQueue = new LinkedList<>();

        strQueue.add(1);
        strQueue.offer(2);
       Utility.prin (strQueue);
        System.out.println(strQueue.peek());
        System.out.println(strQueue.element());
    }
}
