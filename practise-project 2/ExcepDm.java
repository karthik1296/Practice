package Assisted;
import java.util.*;

class InvalidAgeException extends Exception
{
	public InvalidAgeException(String str)
	{
		super(str);
	}
}
public class ExcepDm
{

	public static void main(String[] args) throws Exception
	{
		System.out.println("Enter any alphabet : ");
		int x = System.in.read();
		System.out.println("Given Alphabet : " + (char)x);
		
		Scanner sc = new Scanner(System.in);
		try
		{
			System.out.println("Enter person age");
			int age = sc.nextInt();
			if(age<18)
				throw new InvalidAgeException("Age must be 18 / above 18 years");
			else
				System.out.println("Voter Reg is completed");
		}
		catch(InvalidAgeException ex)
		{
			System.out.println(ex.getMessage());
		}
		finally
		{
			System.out.println("this is final block");
		}

	}

}
