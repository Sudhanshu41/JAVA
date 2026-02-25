package in.darkdevil.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class TestingCollections {
    public static void main(String[] args) {
        List<Integer> numList = new ArrayList<>();
        numList.add(5);
        numList.add(8);
        numList.add(-76);
        Collections.sort(numList);
        Utility.prin(numList);
        Collections.reverse(numList);
        Utility.prin(numList);
        List<Integer> unmodifiable = Collections.unmodifiableList(numList);
//        unmodifiable.add(55);
        numList.add(89);
        System.out.println(unmodifiable);
    }
}
