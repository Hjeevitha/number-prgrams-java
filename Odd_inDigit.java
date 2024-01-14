package number;

public class Odd_inDigit {

	public static void main(String[] args) {
		int n=76543;
		do {
			int rem=n%10;
			if(rem%2!=0) {
				System.out.println(rem);
			}
			n=n/10;
		}while(n>0);
	}

}
