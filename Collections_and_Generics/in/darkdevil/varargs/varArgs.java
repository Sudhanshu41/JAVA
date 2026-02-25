package in.darkdevil.varargs;

public class varArgs {
    public static void main(String[] args) {
        System.out.println(sum(4,5,6,78,9,7)); // varargs mai 0 element bhi call ho jata agar tum chate ho ki
        // minimun itne to argumnet call ho toh varargs se phle utne inimun define krdo like  public static int sum(int first,int second,int... a)
        // ab isse kya hoga tumhe minimum 2 arguments toh pass krne hi honge
    }


    public static int sum(int... a){
        int sum=0;
         for (int i : a) {
             sum+=i;
         }
         return sum;
    }


//    public static int sum(int first,int second,int... a){
//        int sum=first+second;
//        for (int i : a) {
//            sum+=i;
//        }
//        return sum;
//    }


//     public static int sum(int[] a){
//        int sum=0;
//         for (int i : a) {
//             sum+=i;
//         }
//         return sum;
     }

