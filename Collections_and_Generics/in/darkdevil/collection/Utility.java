package in.darkdevil.collection;

import java.util.Collection;

public class Utility {
    public static <E> void prin (Collection<E> collection){
        System.out.print("Collection is: ");
        for (E coll : collection) {
            System.out.printf(" %s ",coll);
        }
        
    }
}
