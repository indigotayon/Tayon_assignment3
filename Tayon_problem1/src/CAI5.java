import java.security.SecureRandom;
import java.util.Scanner;

public class CAI5 
{
	SecureRandom rand= new SecureRandom();
	int random_int1;
	int random_int2;
	Scanner scan = new Scanner(System.in);
	int correctAns;
	int userAns;
	int numCorrect = 0;
	int numWrong = 0;
	int levelChoice;
	int problemChoice;
	int problem;
	
	public void quiz()
	{
		char choice = 'Y';
		while (choice == 'Y') {
			readProblemType();
			readDifficulty();
			generateQuestionArgument();
			
			for(int i=0; i< 10; i++)
			{
				
				askQuestion();
				readResponse();
				isAnswerCorrect();
				displayCorrectResponse();
				displayIncorrectResponse();
				
			}
			displayCompletionMessage(numCorrect);
			
			System.out.println("Do you want to solve another problem? Insert 'Y' for yes, 'N' for no:");
			choice = scan.next().charAt(0);
			numCorrect = 0;
		}		
	}	
	
	public void readProblemType()
	{
		System.out.println("Please select a problem type:");
		System.out.println("Only Addition-1");
		System.out.println("Only Multiplication-2");
		System.out.println("Only Subtraction-3");
		System.out.println("Only Division-4");
		System.out.println("Random mixture-5");
		
		
		Scanner scan = new Scanner(System.in);
		problemChoice = scan.nextInt();
	}
	
	public void readDifficulty()
	{
		System.out.println("Please select a difficulty level:");
		System.out.println("Level-1");
		System.out.println("Level-2");
		System.out.println("Level-3");
		System.out.println("Level-4");
		
		Scanner scan = new Scanner(System.in);
		levelChoice = scan.nextInt();
	
	}
	
	public void generateQuestionArgument()
	{
		if(levelChoice == 1)
		{
		 random_int1 = rand.nextInt(9);
		 random_int2 = rand.nextInt(9);
		 
		}
		if(levelChoice == 2)
		{
		 random_int1 = rand.nextInt(99);
		 random_int2 = rand.nextInt(99);
		 
		}
		if(levelChoice == 3)
		{
		 random_int1 = rand.nextInt(999);
		 random_int2 = rand.nextInt(999);
		 
		}
		if(levelChoice == 4)
		{
		 random_int1 = rand.nextInt(9999);
		 random_int2 = rand.nextInt(9999);
		
		}
	}
	
	public void askQuestion()
	{
		generateQuestionArgument();
		
		problem = problemChoice;
		while(true)
		{
			if (problem == 1) {
				System.out.println("How much is " + random_int1+ " plus " + random_int2 + "?");
				break;
			}
			if (problem == 2) {
				System.out.println("How much is " + random_int1+ " times " + random_int2 + "?");
				break;
			}
			if (problem == 3) {
				System.out.println("How much is " + random_int1+ " minus " + random_int2 + "?");
				break;
			}
			if (problem == 4) {
				if (random_int2 == 0)
					generateQuestionArgument();
				else {
					System.out.println("How much is " + random_int1+ " divided by " + random_int2 + "?");
					break;
				}
			}
			else {
				problem = rand.nextInt(3) + 1;
			}
		}
	}
				
	
	public int readResponse()
	{
		System.out.print("\n Your answer:");
		userAns = scan.nextInt();
	
		return userAns; 
		
	}
	
	public int isAnswerCorrect()
	{
		if(problem == 1)
		{
			return correctAns = random_int1 + random_int2;
		}
		if(problem == 2)
		{
			return correctAns = random_int1 * random_int2;
		}
		if(problem == 3)
		{
			return correctAns = random_int1 - random_int2;
		}
		else
		{
			return correctAns = random_int1 /random_int2;
		}
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
			
			numCorrect++;
		}
		
	}
	
	public void displayIncorrectResponse()
	{
		
		if(userAns != isAnswerCorrect())
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
			numWrong++;
			
				
		}	
    }
     public void displayCompletionMessage(int numCorrect)
       {
    	 float percent = (float)numCorrect/10*100;
    	 System.out.printf("Your score is: %.2f%%%n", percent);
    	 if(percent > 75)
    	 {
    		 System.out.println("Congratulations, you are ready to go to the next level!");
    	 }
    	 else
    	 {
    		 System.out.println("Please ask your teacher for extra help.");
    	 }
	
       }
	
	
	public static void main(String[] args) 	
	{
		CAI5 cai5 = new CAI5();
		cai5.quiz();
	}

}
