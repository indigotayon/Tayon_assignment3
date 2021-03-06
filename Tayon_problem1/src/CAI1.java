import java.util.Scanner;
import java.security.SecureRandom;


public class CAI1 {

	SecureRandom rand= new SecureRandom();
	int random_int1;
	int random_int2;
	Scanner scan = new Scanner(System.in);
	int correctAns;
	int userAns;
	Boolean isCorrect = false;
	
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
		if(userAns == isAnswerCorrect())
		{
			System.out.print("Very Good!");
			System.exit(0);
		}
		
	}
	
	public void displayIncorrectResponse()
	{
		while(userAns != isAnswerCorrect())
		{
		
			System.out.print("No. Please try again.\n");
			System.out.println("How much is " + random_int1+ " times " + random_int2 + "?");
			readResponse(); 
			displayCorrectResponse();
				
		}
	}
	
	public static void main(String[] args) 	
	{
		CAI1 cai1 = new CAI1();
		cai1.quiz();
	}

}
