package Assisted;
import java.util.*;
public class BinarySearch
{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int[] arr= {45,7,8,12,64,23};
		Arrays.sort(arr);
		System.out.println("sorted array is : "+Arrays.toString(arr)+"\nenter element to search : ");
		int key=s.nextInt();
		int low=0;
		boolean flag=false;
		int high=arr.length-1;
		int mid=0;
		do {
			mid=(low+high)/2;
			if(key==arr[mid]) {
				System.out.println("value found at "+(mid+1));
				flag=true;
			}
			else if(key<arr[mid]) {
				high=mid-1;
			}
			else {
				low=mid+1;
			}
		}while(low<=high && !flag);
		if(!flag) {
			System.out.println("value not found");
		}
	}

}
