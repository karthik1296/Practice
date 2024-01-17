package Assisted;
import java.util.*;
public class BubbleSort 
{
	public static void main(String[] args) {
		int[] arr= {200,78,45,23,12,63};
		bubbleSortNormalMethod(arr);
		bubbleSortOptimizedMethod(arr);
	}

	private static void bubbleSortOptimizedMethod(int[] arr) {
		int temp;
		boolean swap=true;
		while(swap) {
			swap=false;
			for(int i=0;i<arr.length-1;i++) {
				if(arr[i]>arr[i+1]) {
					swap(arr,i,i+1);
					swap=true;
				}
			}
			System.out.println("sorting by optimized method with 'O(nlogn)' complexity is "+Arrays.toString(arr));
		}
		
	}
	public static int[] swap(int[] arr,int i,int j) {
		int temp=arr[i];
		arr[i]=arr[i+1];
		arr[i+1]=temp;
		return arr;
	}

	private static void bubbleSortNormalMethod(int[] arr) {
		int temp;
		for(int i=0;i<arr.length-1;i++) {
			for(int j=0;j<arr.length-1;j++) {
				if(arr[j]>arr[j+1]) {
					swap(arr,j,j+1);
				}
			}
		}
		System.out.println("sorting by general method with 'O(n2)' complexity is "+Arrays.toString(arr));
		
	}

}
