public class Caar extends Vehicle1{
    @Override
    public  void service(){
        super.service();
        System.out.println("Car ko bhi service chyie");
    }

    public static void main(String[] args) {
        Caar obj = new Caar();
        obj.service();
    }
}
