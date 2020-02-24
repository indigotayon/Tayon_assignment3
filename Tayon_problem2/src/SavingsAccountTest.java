
public class SavingsAccountTest {
	public static void main(String[] args)
	{

		
		SavingsAccount saver1, saver2;
	    saver1 = new SavingsAccount (2000.0);
	    saver2= new SavingsAccount (3000.0);
	          
	        
	   SavingsAccount.modifyInterestRate (4.00);
	   System.out.println("Setting interest to 4.0%");
	   System.out.print("Month \t Saver1 \t Saver2\n");
	   
	   for(int i=0; i<12; i++) 
	        {
	          saver1.calculateMonthlyInterest();  
	          saver2.calculateMonthlyInterest();
	          System.out.print("  " + (i+1) + ":\t");
	          saver1.getSavingBalance();
	          System.out.print("\t");
	          saver2.getSavingBalance();
	          System.out.println();
	        }
	      System.out.println();
	      System.out.println("Setting interest to 5.0%");
	      System.out.println();
	      SavingsAccount.modifyInterestRate(5.0);
	      
	      saver1.calculateMonthlyInterest();  
	      saver2.calculateMonthlyInterest();
	      
	      System.out.print("13: \t");
	      saver1.getSavingBalance();
	      System.out.print("\t");
	      saver2.getSavingBalance();
	      System.out.println();     
	          
	}
}
