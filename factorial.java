package number;

//factorail of number: product 0f all positive integers less and = to given number

public class factorial {

	public static void main(String[] args) {
		int fact=1;
		int n=6;
		for(int i=1;i<=n;i++) {
			fact=fact*i;
		}
		System.out.println(fact);

	}

}
