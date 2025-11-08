public class MaxMinEleArr {
    public static void main(String[] args) {
        System.out.println("Welcome to Max Min Ele Array");
        int [] num = ArrayUtility.inputArray();
        int max = MaxArr(num);
        int min = MinArr(num);
        System.out.println("The maximum number is " + max);
        System.out.println("The minimum number is " + min);
    }
    public static int MaxArr(int [] arr){
        if(arr.length == 0){
            return Integer.MIN_VALUE;
        }
        int maximum = arr[0];

        for(int i = 1; i < arr.length; i++){
            if(arr[i] > maximum){
                maximum = arr[i];
            }
        }
        return maximum;
    }
    public static int MinArr(int [] arr){
        int minimum = Integer.MAX_VALUE;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] < minimum){
                minimum = arr[i];
            }
        }
        return minimum;
    }
}
