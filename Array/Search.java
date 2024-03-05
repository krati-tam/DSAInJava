package array;

import java.util.Scanner;

public class Search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=27;
		@SuppressWarnings("resource")
		Scanner sc= new Scanner(System.in);
		System.out.print("enter the size of array :-");
		int n=sc.nextInt();
	
		int arr[]= new int[n];
		System.out.println("enter the elements :-");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
			
		}
		/*for(int i=0;i<n;i++)
		{
			System.out.println(arr[i]);
			
		}*/
		

	    for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==x)
            	{System.out.println("true");}
        } 
            System.out.println("false"); 
        
	    
	}

	}


