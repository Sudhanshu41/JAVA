public class SumDiagonal {
    public static void main(String[] args) {
        System.out.println("Welcome to Sum Diagonal Elements");
        int [][] numArray = ArrayUtility.input2DArray();
        int DiagSum = DiagonalSum(numArray);
        System.out.println("The Sum Of Diagonal Elements is " + DiagSum);
    }
    public static int DiagonalSum (int [][] numArray){
        int sum = 0;
        for(int i=0;i<numArray.length;i++){
            for(int j=0;j<numArray[i].length;j++) {
                if (i == j) {
                    sum += numArray[i][j];
                }
            }
        }
        return sum;
    }
}
