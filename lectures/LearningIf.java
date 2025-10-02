public class LearningIf {
    public static void main(String[] args) {
        boolean isMale = true;
        String name = "Sudhanshu";
        System.out.println("before if");
        if(isMale){
            System.out.println("Mr."+name);
        }
        else {
            System.out.println("Mrs."+name);
        }
        System.out.println("After if");
        boolean isSeniorCitizen = false;
        boolean isAnAdult = false;
        if(isSeniorCitizen){
            System.out.println("Hello Senior");

        }
        else if(isAnAdult) {

                System.out.println("Hello adult");
            }
        else {
                System.out.println("Hello child");
            }
        }
    }

