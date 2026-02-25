package in.darkdevil.collection;

import java.util.HashSet;
import java.util.Set;

public class TestingSet {
    public static void main(String[] args) {
        Set<String> names = new HashSet<>();
        System.out.println(names.add("Sudhanshu"));
        System.out.println(names.add("Yadav"));
        System.out.println(names.add("Fool"));
        Utility.prin(names);
        System.out.println(names.add("Sudhanshu"));
        System.out.println(names.size());
    }
}
