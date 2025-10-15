public class Parameter {
    public static void main(String[] args) {
            int num = sum(4,7); // yha pr jab hum value pass krte hai usse hum arguments bulate hai.
        System.out.println(num);
    }
    public static int sum(int a, int b) {
        //isne pehle humse liya input fir return kiha hume output aur yha hum ine parameters kehte hai
        System.out.println("first number recieved: "+a);
        System.out.println("second number recieved: "+b);
        return a + b;
    }
}
