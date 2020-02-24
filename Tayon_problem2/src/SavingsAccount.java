
public class SavingsAccount 
{

    static private double annualInterestRate = 0.0;
    private double savingBalance;

    
    public void calculateMonthlyInterest()
    {
            double monthInt;
            monthInt= (double)(this.savingBalance*(annualInterestRate/100)/12);
            this.savingBalance += monthInt;
    }
    
    public static void modifyInterestRate(double newIntRate)
    {
            annualInterestRate=newIntRate;
    }
    
    public SavingsAccount(double savingBalance)
    {
            this.savingBalance = savingBalance;
    }

    
    public void getSavingBalance()
    {
            System.out.printf("$%.2f", this.savingBalance);
    }
}

          
         





