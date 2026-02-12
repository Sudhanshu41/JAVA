import java.util.Objects;

public class Person {
    private String name;
    private  int age;

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Person)){
            return false;
        }
      Person  per = (Person) obj;
        return per.name.equals(name)&&per.age==age;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name,age);
    }
}
