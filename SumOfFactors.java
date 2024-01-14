package number;

public class SumOfFactors {

	public static void main(String[] args) {
		int n=8;
		int sum=0;
		for(int i=1;i<=n;i++) {
			if(n%i==0) {
				System.out.print(i+" ");
				sum=sum+i;
			}
		}
		System.out.println();
		System.out.println("sum of factors are : "+sum);
	}

}
