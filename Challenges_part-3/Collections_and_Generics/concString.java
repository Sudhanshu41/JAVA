package Collections_and_Generics;

public class concString {
    public static void main(String[] args) {
        System.out.println(Concatenate("Sudhanshu"));
        System.out.println(Concatenate("Sudhanshu","Kumar"));
        System.out.println(Concatenate("Subscribe","to","you"));

    }

    public static String Concatenate(String... strs){
        StringBuilder sb = new StringBuilder();
        for (String str : strs) {
            sb.append(str).append(" ");
        }
        return sb.toString();
    }
}