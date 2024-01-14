package number;

public class product_digits {

	public static void main(String[] args) {
		int prod=0;
		int n=1234;
		while(n>0) {
			int rem=n%10;
			prod=prod*rem;
			n=n/10;
		}
		System.out.println("the product is "+prod);
	}

}
