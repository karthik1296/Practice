package Assisted;
import java.util.*;

public class InsertionSort 
{
public static void main(String[] args) {
		
		int[] arr= {99,52,87,65,24,13,44};
		for(int i=0;i<arr.length;i++) {
			for(int j=i;j>0;j--) {
				if(arr[j-1]>arr[j]) {
					swap(arr,j-1,j);
				}
				
			}
		}
		System.out.println(Arrays.toString(arr));
		

	}

	private static void swap(int[] arr, int i, int j) {
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
		
	}

}
