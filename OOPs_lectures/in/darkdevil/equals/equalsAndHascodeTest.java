package in.darkdevil.equals;

public class equalsAndHascodeTest {
    public static void main(String[] args) {
        Person per = new Person("Sudh",23,"001");
        Person per2 = new Person("Sudh",26,"001");
        if (per.equals(per2)){
            System.out.println("Equal");
        }else {
            System.out.println("not equal");
        }
    }
}
