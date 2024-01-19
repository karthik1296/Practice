package Assisted;
import java.util.*;

public class ArrayRotate 
{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter length of array : ");
		int n=s.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			System.out.print("enter "+(i+1)+" element : ");
			arr[i]=s.nextInt();
		}
		rotateRight(arr,5);
		System.out.println("array right rotated by 5 steps is : "+Arrays.toString(arr));

	}

	public static void rotateRight(int[] arr, int n) {
		while(n!=0) {
			for(int i=0;i<arr.length-1;i++) {
				swap(arr,i,i+1);
			}
			n--;
		}
		
	}

	public static void swap(int[] arr, int i, int j) {
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
		
	}
	
}

