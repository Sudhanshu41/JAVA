public class ArrayOperations {
    private int[] numbers;

    public ArrayOperations(int[] numbers) {
        this.numbers = numbers;
    }

    private  class Statistics{
        double mean(){
            long sum=0;
            for (int number:numbers) {
                sum+=number;
                
            }
            return (double)sum/numbers.length;
        }
        double median(){
            return 0;
        }
    }

    public static void main(String[] args) {
        ArrayOperations opr = new ArrayOperations(new int[]{1,3,5,9});
        ArrayOperations.Statistics stat = opr.new Statistics();
        System.out.println(stat.mean());
    }
}
