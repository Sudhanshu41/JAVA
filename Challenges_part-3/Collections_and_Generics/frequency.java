package Collections_and_Generics;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class frequency {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,4,6,1,7,8,1);
        System.out.println(Collections.frequency(list,1));
    }
}
