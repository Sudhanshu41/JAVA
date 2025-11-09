public class SumandAvg2DArr {
    public static void main(String[] args) {
        System.out.println("Welcome to sum and average of 2D array");
        int numArr[][] = ArrayUtility.input2DArray();
        long sum = Sum(numArr);
        System.out.println("The sum of all elements in an array is: "+sum);
        double avg = Average(numArr);
        System.out.println("The average of all elements in an array is: "+avg);

    }
    public static long Sum(int [][] numArray){
        int sum = 0;
        for(int i=0;i<numArray.length;i++){
            for(int j=0;j<numArray[i].length;j++){

                sum+=numArray[i][j];
            }
        }
        return sum;
    }
    public static double Average(int [][] numArray){
        if(numArray.length==0){
            return 0;
        }
        int rows = numArray.length;
        int cols = numArray[0].length;
        double size = rows * cols;
        return Sum(numArray)/size;
    }
}
