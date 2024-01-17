package Assisted;
import java.util.*;
public class TryCatchDm {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		try
		{
			System.out.println("enter 1st value:");
			int A=sc.nextInt();
			System.out.println("enter 2nd value:");
			int B=sc.nextInt();
			int C=A+B;
			System.out.println(C);
		}
		catch(Exception e)
		{
			System.out.println(e);
			System.out.println("your given value is not a integer");
		}
	}

}
