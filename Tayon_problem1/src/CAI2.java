import java.security.SecureRandom;
import java.util.Scanner;

public class CAI2 
{
	SecureRandom rand= new SecureRandom();
	int random_int1;
	int random_int2;
	Scanner scan = new Scanner(System.in);
	int correctAns;
	int userAns;
	
	
	public void quiz()
	{
		askQuestion();
		readResponse();
		isAnswerCorrect();
		displayCorrectResponse();
		displayIncorrectResponse();
		
	
	}	
	
	public void askQuestion()
	{
		
		random_int1 = rand.nextInt(10);
		random_int2 = rand.nextInt(10);
		
		System.out.println("How much is " + random_int1+ " times " + random_int2 + "?");
		
	}
	
	public int readResponse()
	{
		
		System.out.print("\nYour answer:");
		userAns = scan.nextInt();
	
		return userAns; 
		
	}
	
	public int isAnswerCorrect()
	{
		return correctAns = random_int1*random_int2;
		
	}
	
	public void displayCorrectResponse()
	{
		
		int random_q = rand.nextInt(4)+1;
		if(userAns == isAnswerCorrect())
		{
			switch(random_q)
			{
			case 1:System.out.println("Very good!");
			break;
			case 2:System.out.println("Excellent!");
			break;
			case 3:System.out.println("Nice work!");
			break;
			case 4:System.out.println("Keep up the good work!");
			break;
			
			}
			
			System.exit(0);
		}
		
	}
	
	public void displayIncorrectResponse()
	{
		
		while(userAns != isAnswerCorrect())
		{
			int random_q = rand.nextInt(4)+1;
			switch(random_q)
			{
			case 1:System.out.println("No. Please try again.");
			break;
			case 2:System.out.println("Wrong. Try once more.");
			break;
			case 3:System.out.println("Dont give up!");
			break;
			case 4:System.out.println("No. Keep trying.");
			break;
			
			}
			
			System.out.println("How much is " + random_int1+ " times " + random_int2 + "?");
			readResponse(); 
			displayCorrectResponse();
				
		}
	}
	
	public static void main(String[] args) 	
	{
		CAI2 cai2 = new CAI2();
		cai2.quiz();
	}
}



