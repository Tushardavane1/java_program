//Write a Java program to create a class known as "BankAccount" with methods called deposit()
// and withdraw(). Create a subclass called SavingsAccount that overrides the withdraw() method
// to prevent withdrawals if the account balance falls below one hundred.
class BankAccount 
{
    public void deposit()
    {
        System.out.println("your money is the deposit");
    }
    public void withdraw()
    {
        System.out.println("Your money is the withdraw");
    }
}
class SavingsAccount extends BankAccount
{
        
        public void deposit1()
        {
            System.out.println("Money is deposit in your acc.");
        }

        @Override
        public void withdraw()
        {
            System.out.println("Money is withdraw to your acc.");
        }
}
public class Balance {
    public static void main(String agrs[])
    {
        SavingsAccount obj = new SavingsAccount();
        obj.deposit();
        obj.withdraw();
    }
    
}
