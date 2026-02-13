package in.polymorphism;

public class OverLoading {
    OverLoading(){
        System.out.println("Default Constructor called!");
    }
    OverLoading(String pop){
        System.out.println(pop);
    }
    public int add(int a,int b){
        return a+b;
    }
    public int add(int a,int b,int c,int d){
        return a + b + c + d;
    }
    public String add(String a,String b){
        return a+b;
    }

    public static void main(String[] args) {
        OverLoading o = new OverLoading();
        System.out.println(o.add(5,4));

        System.out.println(o.add("a","a"));
    }

}
