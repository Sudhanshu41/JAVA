package in.darkdevil.collection;

import java.util.ArrayList;
import java.util.List;

public class TestingList {
    public static void main(String[] args) {
        List<String> strList = new ArrayList<String>();
        strList.add("Sudhanshu");
        strList.add("Kumar");
        strList.add(1,"Yadav");

        for(int i=0;i< strList.size();i++){
            System.out.print(" "+strList.get(i));
        }
        if (strList.contains("Yadav")){
            System.out.println("\n Yadav Exists");
            System.out.println(strList.indexOf("Yadav"));
        }

    }
}
