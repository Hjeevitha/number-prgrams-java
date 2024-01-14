package number;

public class Happy_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int  n=20;
       while(n!=1 && n!=4) {
    	   int sum=0;
    	   int sq=0;
    	   while(n>0) {
    		   int rem=n%10;
    		   sq=rem*rem;
    		   sum=sum+sq;
    		   n=n/10;   
    	   }
    	   if(sum==1) {
    		   System.out.println("happy number");
    		   break;
    	   }
    	   else if(sum==4){
    		   System.out.println("sad number");
    		   break;
    	   }
    	   else {
    		   n=sum;
    	   }
       }
	}

}
