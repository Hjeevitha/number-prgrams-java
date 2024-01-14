package number;

public class Pro_Factors {

	public static void main(String[] args) {
		int n=6;
		int prod=1;
		for(int i=1;i<=n;i++) {
			if(n%i==0) {
				System.out.print(i+" ");
				prod=prod*i;
			}
		}
		System.out.println();
		System.out.println("the product of factors are : "+prod);

	}

}
