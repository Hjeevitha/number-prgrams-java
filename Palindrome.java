package number;

public class Palindrome {

	public static void main(String[] args) {

		int n=121;
		int orginal=n;
		int rev=0;
		while(n>0) {
			int rem=n%10;
			rev=rev*10+rem;
			n=n/10;
		}
		System.out.println(rev);
		if(rev==orginal) 
			System.out.println("given number is palindrome");      
		else
		System.out.println("given number is not palindrome");

	}	
}
