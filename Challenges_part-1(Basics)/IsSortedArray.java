public class IsSortedArray {
    public static void main(String[] args) {
        System.out.println("Welcome to sorted array checkpost");
        int [] new_arr = ArrayUtility.inputArray();
        boolean isInc = isIncreasing(new_arr);
        boolean isDec = isDecreasing(new_arr);
        if (isInc || isDec) {
            System.out.println("your array is sorted.");
        }
        else  {
            System.out.println("your array is not sorted.");
        }

    }
    public static boolean isIncreasing(int [] arr){
        for (int i = 1; i < arr.length; i++){
            if (arr[i] < arr[i-1]){
                return false;
            }
        }

        return true;
    }
    public static boolean isDecreasing(int [] arr){
        for (int i = 1; i < arr.length; i++){
            if (arr[i] > arr[i-1]){
                return false;
            }
        }
        return true;
    }

}
