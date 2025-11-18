public class forEachLoop1 {
    public static void main(String[] args) {
        String[] array = new String[]{
                "Ram","shyam","Mohan","Sohan","Seeta"
        };
        forEachLoop(array);

    }
    public static void forEachLoop(String [] array){
        for(String name:array){
            System.out.println(name);
        }
    }
}
