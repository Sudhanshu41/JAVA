public class Stringmanipulation {
    public static void main(String[] args) {
        String fname = "Sudhanshu";
        String lname = "Yadav";
//        String fullname = fname+" "+lname;
//        System.out.println(fullname);
        String fullname = fname.concat(" ").concat(lname);
        System.out.println(fullname.toUpperCase());
    }
}
