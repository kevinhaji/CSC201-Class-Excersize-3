import java.util.Scanner;

public class ExcersizeThreeEightIntSorter 
{
	//Excersize asks for three numbers input then sorted in non decreasing order. That doesn't make sense, so I'm doing it in decreasing order.
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int userNumber1, userNumber2, userNumber3;
		Scanner input = new Scanner (System.in);
		
		System.out.println("Enter three intergers seperated by spaces: ");
		userNumber1 = input.nextInt();
		userNumber2 = input.nextInt();
		userNumber3 = input.nextInt();
		
			if(userNumber1 >= userNumber2 && userNumber2 >= userNumber3)
			{
				System.out.println("Numbers in decreasing order: " + userNumber1 + " " + userNumber2 + " " +userNumber3);
			}
			else if(userNumber1 >= userNumber3 && userNumber3 >= userNumber2)
			{
				System.out.println("Numbers in decreasing order: " + userNumber1 + " " + userNumber3 + " " +userNumber2);
			}
			else if(userNumber2 >= userNumber1 && userNumber1 >= userNumber3)
			{
				System.out.println("Numbers in decreasing order: " + userNumber2 + " " + userNumber1 + " " +userNumber3);
			}
			else if(userNumber2 >= userNumber3 && userNumber3 >= userNumber1)
			{
				System.out.println("Numbers in decreasing order: " + userNumber2 + " " + userNumber3 + " " +userNumber1);
			}
			
			else if(userNumber3 >= userNumber1 && userNumber1 >= userNumber2)
			{
				System.out.println("Numbers in decreasing order: " + userNumber3 + " " + userNumber1 + " " +userNumber2);
			}
			else if(userNumber3 >= userNumber2 && userNumber2 >= userNumber1)
			{
				System.out.println("Numbers in decreasing order: " + userNumber3 + " " + userNumber2 + " " +userNumber1);
			}
		input.close();
	}
		
		
}

