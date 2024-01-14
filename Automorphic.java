package number;

public class Automorphic {
	public static void main(String[] args) {
		int n=25;
		int temp=n;
		int sq=n*n;
		int r1=n%10,r2=sq%10;
		while(n>0) {
			if(r1==r2) {
				n=n/10;
				sq=sq/10;
			}
		}
		if(n==0) {
			System.out.println(temp+" is automorphic");
		}
		else {
			System.out.println(temp+" is not a automorphic");
		}


	}

}


