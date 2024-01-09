package Assisted;
import java.util.*;

public class MultiplyMatrices
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter size of matrix : ");
		int n=sc.nextInt();
		int[][] mat1=new int[n][n];
		int[][] mat2=new int[n][n];
		int[][] result=new int[n][n];
		System.out.println("enter 1st matrix elements :");
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				
				mat1[i][j]=sc.nextInt();
			}
		}
		System.out.println("\nenter 2nd matrix elements :");
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++) 
			{
				
				mat2[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				for(int k=0;k<n;k++)
				{
					result[i][j]+=mat1[i][k]*mat2[k][j];
				}
			}
		}
		System.out.println("product of two matrcies is "+Arrays.deepToString(result));
		

	}

}
