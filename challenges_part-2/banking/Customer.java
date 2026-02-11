package banking;

public class Customer {
    public static void main(String[] args) {
        BankAccount ba = new BankAccount("1qwed23","Sudhanshu");
        ba.depositMoney(2000);
        System.out.println(ba.withdrawMoney(1000));
        ba.depositMoney(-10);
        ba.withdrawMoney(-4000);
    }
}
