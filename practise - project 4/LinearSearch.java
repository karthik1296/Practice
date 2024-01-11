package Assisted;
import java.util.*;

public class LinearSearch 
{
	public static void main(String[] args) 
	{
		
		int[] arr= {25,12,7,89,45,65,99,28,67};
		Scanner s=new Scanner(System.in);
		System.out.print("enter value to search : ");
		int value=s.nextInt();
		for(int i=0;i<arr.length;i++) 
		{
			if(arr[i]==value)
			{
				System.out.println("value found at "+(i+1));
				return;
			}
		}
		System.out.println("value not found");

	}

}
