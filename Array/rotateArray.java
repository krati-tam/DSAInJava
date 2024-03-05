package array;


public class rotateArray {

			
			/*static void rotate()
				{int a[]=new int[5];
				
				int temp=0;
				for( int i=0;i<=a.length;i++)
				{
					a[i-1]=a[i];
				}
				a[a.length-1]=temp;
			}
		public static void main(String[] args) {
			
			// TODO Auto-generated method stub
			
			int a[]= {1,2,3,4,5};
			for(int i=0;i< a.length;i++)
			{
				System.out.println(a[i]);
			}
			System.out.println("ushi tushi");
			rotate();
			for(int i=0;i< a.length;i++)
			{
				System.out.println(a[i]);
			}
		}

	}*/
	public static void rotateLeft(int array[], int d)   
{   
for (int i = 0; i <=d; i++)   
{//calling function without passing the number of rotations  
rotateArrayByOne(array);   
}  } 
public static void rotateArrayByOne(int array[])   
{   
int i, temp;   
//temporary array to store the newly created array  
temp = array[0];   
for (i = 0; i < array.length - 1; i++) {  
//shifts array element to the left by 1  
array[i] = array[i + 1];  
array[array.length-1] = temp;   
} }  
public static void main(String args[]) {
	

int array[] = { 11, 22, 33, 44, 55, 66, 77 };   
//number of rotations to be performed  
//we can change the number of rotations accordingly  
 
//determines the length of array  


for( int i = 0 ; i < array.length ; i++)  
{  
//prints array before rotation  
System.out.print(array[i]+ " ");   
}  
System.out.println();  
 
System.out.println("\nArray after left rotation: ");   
for(int i = 0 ; i < array.length; i++)  
{  
//prints array after performing rotation      
System.out.print(array[i] + " ");  
}   }
}   
		
		
