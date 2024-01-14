package number;

public class prime_number {

	public static void main(String[] args) {
		int n=2;
		int count=0;
		for(int i=1;i<=n;i++) {
			if(n%i==0) {
				count++;
			}
		}
		if(count==2) {
			System.out.println(n+" is prime number");
		}
		else
			System.out.println(n+" is not prime number");

	}

}

//prime numbers: any number divisible by 5 and itself
