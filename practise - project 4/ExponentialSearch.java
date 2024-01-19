package Assisted;
import java.util.*;
public class ExponentialSearch 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		int[] arr= {99,52,87,65,24,13,44};
		Arrays.sort(arr);
		System.out.println("sorted array is : "+Arrays.toString(arr));
		System.out.print("enter a key to search : ");
		int value=s.nextInt();
		if(arr[0]==value) 
		{
			System.out.println("value found at 1 element");
		}
		else if(arr[1]==value)
		{
			System.out.println("value found at 2 element");
		}
		else
		{
			exponenetialSearch(arr,value);
		}
	}

	private static void exponenetialSearch(int[] arr,int value) 
	{
		int i=2;
		while(i<arr.length)
		{
			if(arr[i]>=value)
			{
				binarySearch(arr,i,i/2,value);
				return;
			}
			i=i*2;
		}
		binarySearch(arr,arr.length-1,i/2,value);
		
	}

	private static void binarySearch(int[] arr, int max, int min,int value) 
	{
		int low=min,high=max;
		int mid;
		while(low<=high) 
		{
			mid=(low+high)/2;
			if(arr[mid]==value)
			{
				System.out.println("value found at "+(mid+1));
				return;
			}
			else if(arr[mid]<value) 
			{
				low=mid+1;
			}
			else 
			{
				high=mid-1;
				
			}
		}
		System.out.println("value not found");
		
	}

}
