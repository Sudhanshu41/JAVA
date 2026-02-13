public class Calculator {
    public static int add(int a,int b){
        return a+b;
    }
    public static int add(int a,int b,int c){
        return a+b+c;
    }
    public static double add(double a,double b){
        return a+b;
    }

    public static void main(String[] args) {

        System.out.println("Sum of 4 and 5: "+add(4,5));
        System.out.println("Sum of 4,5 and 6: "+add(4,5,6));
        System.out.println("Sum of 4.5 and 5.7 is: "+add(4.5,5.7));
    }
}
