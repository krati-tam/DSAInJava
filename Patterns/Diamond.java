package patterns;

public class Diamond {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=9;
		int stars=1;
		int spaces=n-1;

		//UPPER DIAMOND 
		for(int i=1;i<=(n/2+1);i++)
		{
			for(int j=1;j<=spaces;j++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=stars;j++)
			{
				System.out.print("* ");
			}
		
			System.out.println("");
			
			
			spaces=spaces-2;
			stars=stars+2;
		}
		
		//LOWER DIAMOND
		spaces=2;
		stars=n-2;
		
		for(int i=1;i<=(n/2);i++)
		{
			for(int j=1;j<=spaces;j++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=stars;j++)
			{
				System.out.print("* ");
			}
		
			System.out.println("");
			
			spaces=spaces+2;
			stars=stars-2;
	}

	}
}
