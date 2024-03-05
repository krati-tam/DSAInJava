package array;

import java.util.Scanner;

public class PositiveNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		@SuppressWarnings("resource")
		Scanner sc= new Scanner(System.in);
		System.out.print("enter the size of array :-");
		int n=sc.nextInt();
		//int sum=0;
		int c=0;
		int arr[]= new int[n];
		System.out.println("enter the elements :-");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
			
		}
		for(int i=0;i<n;i++)
		{
			System.out.println(arr[i]);
			
		}
		
		
		for(int i=0;i<n;i++)
		{
			if(arr[i]>0)
				c++;
		}
		System.out.println(c);
	}

}
