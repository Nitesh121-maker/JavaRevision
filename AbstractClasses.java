abstract class BankAccount {
    String accountHolder;

    BankAccount(String  accountHolder){
        this.accountHolder = accountHolder;
    }
    
    // Abstract Method

    abstract void withdraw(double amount);

    // New Method

    void showDetails(){
        System.out.println("Account Holder "+accountHolder);
    }
}


// Savings Account

class SavingsAccount extends BankAccount{
    SavingsAccount(String name){
        super(name);
    }

    @Override
    void withdraw(double amount){
        System.out.println("Withdrawn " + amount + " from Savings Account");
    }
}

// class current account

class CurrentAccount extends BankAccount{
    CurrentAccount(String name){
        super(name);
    }

    @Override
    void withdraw(double amount){
        System.out.print("Withdrawn " + amount + " from Current Account");
    }
}

class Main{
    public static void main(String[] args){
        BankAccount savings = new SavingsAccount("Nitesh");
        BankAccount current = new CurrentAccount("Sheetal");

        savings.showDetails();
        savings.withdraw(40000);

        current.showDetails();
        current.withdraw(30000);
    }
}