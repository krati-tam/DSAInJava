package array;

public class MinMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[]= {12,24,36,48,06};
/*int max=a[0];
for(int i=0;i<a.length;i++)
{
	if(a[i]>max)
	{
		max=a[i];
	}
}
System.out.println(max);*/

int min=a[0];
for(int i=0;i<a.length;i++)
{
	if(a[i]<min)
	{
		min=a[i];
	}
}
System.out.println(min);
	}

}
