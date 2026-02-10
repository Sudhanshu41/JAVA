public class ArrToStr {
    public static void main(String[] args) {
        String[] arr = new String[]{"name", " is"," Sudhanshu"};
        StringBuilder sb = new StringBuilder();
        for (String s : arr) {
            sb.append(s).append("");
        }
        System.out.println(sb);
    }
}
