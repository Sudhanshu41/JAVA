package FunctionalProgramming;

public class TestingTruthFunctionalInterface {
    public static void main(String[] args) {
        Truth candidate = num ->{
            for (int i = 2; i <num  ; i++) {
                if (num%i==0){
                    return false;
                }
            }
            return true;
        };
        System.out.println(candidate.isCandidate(5));
    }
}
