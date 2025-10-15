
public class chal1_pattern {
    public static void main(String[] args) {
          greetings();
        System.out.println();
        firstPattern();
        System.out.println();
        secondPattern();
        System.out.println();
        thirdPattern();
    }

    public static void firstPattern() {
        int rows = 0;
        while (rows < 5) {
            System.out.print("*");
            int i = 0;
            while (i < rows) {
                System.out.print(" *");
                i++;
            }
            System.out.println();
            rows++;
        }
    }

    public static void secondPattern() {
        int rows = 4;
        while (rows >= 0) {
            System.out.print("*");
            int i = 0;
            while (i < rows) {
                System.out.print(" *");
                i++;
            }
            System.out.println();
            rows--;
        }
    }
    public static void thirdPattern () {
        int trows = 5;
        int rows =0;

        while (rows<=5){
            int spaces = trows-rows;
            int s =0;
            while (s<spaces){
                System.out.print("  ");
                s++;
            }
            int stars = 0;
            while (stars<rows){
                System.out.print("* ");
                stars++;
            }
            System.out.println();
            rows++;

        }
    }


    public static void greetings () {
        System.out.println("Good Morning from Sudhanshu");
    }
}


