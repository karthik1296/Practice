package Assisted;
import java.util.*;

public class QuickSort 
{
	public static void main(String[] args) {
		int[] arr= {70,1,180,30,9,140,6,20,50};
		sort(arr);
		System.out.println(Arrays.toString(arr));

	}

	private static void sort(int[] arr) {
		sort(arr,0,arr.length-1);
		
	}

	private static void sort(int[] arr, int start, int end) {
		
		if(start<end) {
			int p=partition(arr,start,end);
			sort(arr,start,p-1);
			sort(arr,p+1,end);
		}
	}

	private static int partition(int[] arr, int start, int end) {
		int pivot=arr[end];
		int x=start-1;
		for(int i=start;i<end;i++) {
			if(arr[i]<pivot) {
				x++;
				swap(arr,x,i);
				System.out.println(i+Arrays.toString(arr));
			}
		}
		swap(arr,x+1,end);
		return x+1;
	}

	private static void swap(int[] arr, int x, int i) {
		int temp=arr[x];
		arr[x]=arr[i];
		arr[i]=temp;
		
	}

}
