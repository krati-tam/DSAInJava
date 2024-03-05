package array;

public class sortArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] arr= {11,12,13,14,15};
		int n=arr.length;
		
		for(int i=0;i<n;i++){
	             for(int j=i+1;j<n;j++){
	                 if(arr[i]>arr[j]){
	                     int k=arr[i];
	                     arr[i]=arr[j];
	                     arr[j]=k;
	                }
	}
	             

}
		for(int i=0;i<n;i++)
			{System.out.println(arr);
	}
	}
}
