class BankAccount {
 double balance;

        public BankAccount(double initialBalance) {
        this.balance = initialBalance;
        System.out.println("BankAccount constructor called.");
        }

         public void deposit(double amount) {
         balance += amount;
         System.out.println("Deposited: " + amount);
         }

         public void withdraw(double amount) {


            if (balance >= amount) {
                 balance -= amount;
                  System.out.println("Withdrawn: " + amount);
                  } else {
                  System.out.println("Insufficient balance.");
                  }
              }
         public double getBalance() {
         return balance;
         }
}
// Subclass: SavingsAccount
         class SavingsAccount extends BankAccount {
 double interestRate;


// Constructor for SavingsAccount
         public SavingsAccount(double initialBalance, double interestRate) {
         super(initialBalance);
// Calling the BankAccount constructor using super()
         this.interestRate = interestRate;
         System.out.println("SavingsAccount constructor called.");
         }
         public void applyInterest() {
         balance += balance * interestRate;
         System.out.println("Interest applied.");
         }
 }

