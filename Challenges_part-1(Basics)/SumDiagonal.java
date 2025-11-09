public class SumDiagonal {
    public static void main(String[] args) {
        System.out.println("Welcome to Sum Diagonal Elements");
        int [][] numArray = ArrayUtility.input2DArray();
        long sumleft = sumOfLeftDiagonal(numArray);
        System.out.println("Sum of left diagonal is: "+sumleft);
        long sumright = sumOfRightDiagonal(numArray);
        System.out.println("Sum of right diagonal is: "+sumright);
        long totalDiagonal = sumOfDiagonal(numArray);
        System.out.println("Total diagonal is: "+totalDiagonal);

    }
    public static long sumOfDiagonal(int [][] numArray) {
        long leftSum = sumOfLeftDiagonal(numArray);
        long rightSum = sumOfRightDiagonal(numArray);
        long sum = leftSum + rightSum;
        if(numArray.length %2 !=0){
            int ind = numArray.length/2;
            sum -= numArray[ind][ind];
        }
        return sum;
    }
    public static long sumOfLeftDiagonal(int [][] numArray) {
        long sum = 0;
        for (int i = 0; i < numArray.length; i++) {
          sum += numArray[i][i];
        }
        return sum;
    }
    public static long sumOfRightDiagonal(int [][] numArray) {
        long sum = 0;
        for (int i = 0; i < numArray.length; i++) {
            int col = numArray[i].length - i - 1;
            sum += numArray[i][col];

        }
        return sum;
    }
}


