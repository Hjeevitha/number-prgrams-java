package number;

public class Reverse_number {

	public static void main(String[] args) {
		
          int n=234;
          int rev=0;
          while(n>0) {
        	  int rem=n%10;
        	  rev=rev*10+rem;
        	  n=n/10;
          }
          System.out.println(rev);
          
          String s="101010";
          String re="";
          for(int i=s.length()-1;i>=0;i--) {
        	  re=re+s.charAt(i);  
          }
          System.out.println(re);
	}

}
