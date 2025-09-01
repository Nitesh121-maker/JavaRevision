public class BankAccount {
    String accountHolder ;
    int balance;
    // Constructor
    BankAccount(String accountHolder, int balance){
       this.accountHolder = accountHolder;
       this.balance       = balance;
    }

    void deposit(){
        System.out.println("Account Holder Name: "+accountHolder);
        System.out.println(accountHolder+" Deposited Anount: "+balance);
    }

    void withdraw(){
        System.out.println("Account Holder Name: "+accountHolder);
        System.out.println(accountHolder+" Withdrawal Anount: "+balance);
    }

    // Main method 
    public static void  main(String[] args){
        BankAccount account1 = new BankAccount("Nitesh Chauhan", 100000);

        account1.deposit();
        account1.withdraw();
    }
}
