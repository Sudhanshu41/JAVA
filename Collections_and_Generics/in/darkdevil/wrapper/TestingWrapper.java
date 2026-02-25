package in.darkdevil.wrapper;

public class TestingWrapper  {
    public static void main(String[] args) {
        Integer first = Integer.valueOf(55); // String mai bhi pass kr skte hai "55" isse ye integer mai convert kr dega
        // Integer first = 55; Ye bhi sahi tareka hai! THIS IS CALLED AUTOBOXING
        System.out.println(first);
        int second = first;// YE HAI UNBOXING!!

    }
}
