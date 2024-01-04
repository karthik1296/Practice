package Assisted;
import java.util.*;

public class SumOfNElements 
{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter length of array : ");
		int n=s.nextInt();
		ArrayList<Integer> arr=new ArrayList<>();
		
		System.out.print("enter The elements : ");
		for(int i=0;i<n;i++) 
		{
			
			arr.add(s.nextInt());
			
		}
		
		int l=s.nextInt();
		System.out.print("Enter stop index between "+l+" and "+n+"  to calculate sum : ");
		int r=s.nextInt();
		try {
			if(l<r) {
				int sum=0;
				for(int i=l-1;i<r;i++) 
				{
					sum+=arr.get(i);
				}
				System.out.println("sum of all elements between "+l+" and "+r+" is "+sum);
			}
			else {
				System.out.println("invalid stop index or start index");
			}
		}catch(Exception e) {
			System.out.println(e+" exception occurs");
		}
		finally {
			s.close();
		}

	}

	
	
}
