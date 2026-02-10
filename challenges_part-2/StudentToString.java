public class StudentToString {
    String name;
    int marks;
    String city;

    public StudentToString(String name, int marks, String city) {
        this.name = name;
        this.marks = marks;
        this.city = city;
    }

    @Override
    public String toString() {
        return "Student details:{name:"+name+" marks:"+marks+" city:"+city+"}";
    }

    public static void main(String[] args) {
        StudentToString st = new StudentToString("Sudhanshu",89,"Agra");
        System.out.println(st);
    }
}
