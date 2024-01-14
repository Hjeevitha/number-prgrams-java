package number;

public class Sum_factorial {

	public static void main(String[] args) {
		int n=132;

		while(n>0) {
			int fact=1;
			int last=n%10;
			int sum=0;
			for(int i=1;i<=last;i++) {
				fact=fact*i;
				sum=sum+i;
			}
			System.out.println(last+" factorial is "+fact);
			System.out.println("sum of factorial "+sum);
			System.out.println();
			n=n/10;
		}
		

	}

}
