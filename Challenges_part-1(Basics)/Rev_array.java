public class Rev_array {
    public static void main(String[] args) {
        System.out.println("Welcome to Array Reversal");
        int [] arr = ArrayUtility.inputArray();
        reverse(arr);
        System.out.println("Reversed Array");
        ArrayUtility.DisplayArray(arr);
    }
    public static void reverse(int[] arr){
        for(int i=0;i<arr.length/2;i++){
            int swap = arr[i];
            arr[i] =  arr[(arr.length-1)-i];
            arr[(arr.length-1)-i] = swap;
        }
    }
}
