package number;
// sum of square of each digit of given number == given number
public class neon_number {

	public static void main(String[] args) {
		int n=9;
		int square=n*n;int sum=0;
		while(square>0) {
			int rem=square%10;
			sum=sum+rem;
			square=square/10;	
		}
		if(n==sum) {
			System.out.println(n+" is a neon number");
		}
		else {
			System.out.println(n+" is not a square number");
		}

	}

}
