public class StringTest {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("First");
        sb.append(45);
        sb.append("  , now this is");
        System.out.println(sb);
    }
}
