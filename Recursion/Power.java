package recursion;

public class Power {

	
		public static double myPow(double x, int n) {
			// Your code goes here
			//double y;
			if(n==0)
	    	return 1.0;
	        /*else
	       return x*myPow(x,n-1);*/
			
	        double partial_ans=myPow(x,n/2);
	        if(n<0){
	 if(n%2==1)
	      { 
	          return (1/partial_ans)*(1/partial_ans)*(1/x);
	      }
	        else
	        {  return partial_ans*partial_ans;
	       }
	        }
	else if(n>0)
	        {
	            if(n%2==0)
	            {
	                return   partial_ans*partial_ans;
	            }
	            else{
	                return partial_ans*partial_ans*x;
	            }
	        }
	        return -1;
	    }
	    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(myPow(2.0d,-2));

	}

}
