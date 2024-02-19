package Assisted;
import java.util.*;
public class FourthSmallest 
{
	public static void main(String[] args)
	{
		
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter length of array : ");
			int n=sc.nextInt();
			ArrayList<Integer> arr=new ArrayList<>();
			
			System.out.print("enter The elements : ");
			for(int i=0;i<n;i++) 
			{
				
				arr.add(sc.nextInt());
				
			}
			
			Collections.sort(arr);
			System.out.println("4th smallest element in the array is : "+arr.get(3));

		}

}