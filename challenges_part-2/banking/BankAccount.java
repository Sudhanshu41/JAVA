package banking;

 class BankAccount {
     private String accountNumber;
     private String accountHolder;
     private double Balance;

     public BankAccount(String accountNumber, String accountHolder) {
         this.accountNumber = accountNumber;
         this.accountHolder = accountHolder;
     }

     public void depositMoney(double money){
         if (money<=0){
             System.out.println("Invalid deposit");
         }else{
         Balance+=money;
         }
     }
     public double withdrawMoney(double money){
         if (money<=0){
             System.out.println("Invalid withdraw");
         } else if (Balance>=money) {
             Balance-=money;
         }else {
             money = Balance;
             Balance=0;
         }

         return money;
     }
}
